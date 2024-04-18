package com.qnaplace.qnaplace.qnaplace.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
) {
    override fun equals(other: Any?): Boolean {
        if (other !is BaseEntity) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
