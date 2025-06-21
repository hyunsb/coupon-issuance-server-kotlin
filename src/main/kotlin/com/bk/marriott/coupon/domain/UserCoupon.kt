package com.bk.marriott.coupon.domain

import java.time.LocalDateTime

class UserCoupon(
        private val id: Long? = null,
        private val coupon: Coupon,
        private val userId: Long,
        private val issuedAt: LocalDateTime,
        private var spentAt: LocalDateTime? = null,
        private val expiredAt: LocalDateTime,
        private var version: Long? = null
) {

    companion object {
        fun generateWithoutIdAndSpentAt(
                coupon: Coupon,
                userId: Long,
                issuedAt: LocalDateTime,
                expiredAt: LocalDateTime
        ): UserCoupon {
            return UserCoupon(
                    coupon = coupon,
                    userId = userId,
                    issuedAt = issuedAt,
                    expiredAt = expiredAt
            )
        }
    }

    public fun updateSpentAt(): UserCoupon {
        this.spentAt = LocalDateTime.now()
        return this
    }

    public fun deleteSpentAt(): UserCoupon {
        this.spentAt = null
        return this
    }

    public fun isSpent(): Boolean {
        return this.spentAt != null
    }
}