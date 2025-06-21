package com.bk.marriott.coupon.domain.couponusingpolicy

import java.time.LocalDateTime

class MixedCouponUsingPolicy(
        private val id: Long,
        private val afterDay: Int,
        private val startedAt: LocalDateTime,
        private val endedAt: LocalDateTime

): CouponUsingPolicy {

    override fun getId(): Long {
        return id
    }

    override fun calculateExpireDateTime(baseTime: LocalDateTime): LocalDateTime {
        val endedAtForAfterDay = baseTime.plusDays(afterDay.toLong())

        if (endedAt.isBefore(endedAtForAfterDay)) {
            return endedAt
        }
        return endedAtForAfterDay
    }
}