package com.bk.marriott.coupon.domain.couponusingpolicy

import java.time.LocalDateTime

object CouponUsingPolicyFactory {

    fun generateCouponPolicy(
            type: CouponUsingPolicyType,
            id: Long,
            afterDay: Int,
            startedAt: LocalDateTime,
            endedAt: LocalDateTime
    ): CouponUsingPolicy {

        return when (type) {
            CouponUsingPolicyType.MIXED -> MixedCouponUsingPolicy(id, afterDay, startedAt, endedAt)
            CouponUsingPolicyType.FIXED -> FixedCouponUsingPolicy(id, startedAt, endedAt)
            CouponUsingPolicyType.AFTER -> AfterCouponUsingPolicy(id, afterDay)
        }
    }
}