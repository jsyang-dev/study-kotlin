package me.study.kotlin.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@EntityListeners(AuditingEntityListener::class)
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    var title: String,

    var content: String,

    var author: String,

    @CreatedDate
    var createdAt: LocalDateTime,

    @LastModifiedDate
    var updatedAt: LocalDateTime
)