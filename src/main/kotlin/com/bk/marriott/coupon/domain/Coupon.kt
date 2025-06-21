package com.bk.marriott.coupon.domain

import com.bk.marriott.coupon.domain.couponusingpolicy.CouponUsingPolicy
import java.time.LocalDateTime

class Coupon(
        private val id: Long,
        private val couponUsingPolicy: CouponUsingPolicy,
        private val name: String,
        private val discountRate: Float
) {

    public fun calcCouponExpireTime(baseTime: LocalDateTime): LocalDateTime {
        return couponUsingPolicy.calculateExpireDateTime(baseTime)
    }
}