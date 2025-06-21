package com.bk.marriott.coupon.domain.couponusingpolicy

import java.time.LocalDateTime

class AfterCouponUsingPolicy(
        private val id: Long,
        private val afterDay: Int

): CouponUsingPolicy {

    override fun getId(): Long {
        return id
    }

    override fun calculateExpireDateTime(baseTime: LocalDateTime): LocalDateTime {
        return baseTime.plusDays(afterDay.toLong())
    }
}