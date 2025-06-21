package com.bk.marriott.coupon.domain.couponusingpolicy

import java.time.LocalDateTime

interface CouponUsingPolicy {

    fun getId(): Long
    fun calculateExpireDateTime(baseTime: LocalDateTime): LocalDateTime
}