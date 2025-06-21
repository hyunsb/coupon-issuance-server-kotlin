package com.bk.marriott.coupon.domain.couponusingpolicy

import java.time.LocalDateTime

class FixedCouponUsingPolicy(
        private val id: Long,
        private val statedAt: LocalDateTime,
        private val endedAt: LocalDateTime

): CouponUsingPolicy {

    override fun getId(): Long {
        return id
    }

    override fun calculateExpireDateTime(baseTime: LocalDateTime): LocalDateTime {
        return endedAt;
    }
}