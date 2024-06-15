package com.example.service_brand.domain.entities


import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("\"Brand\"")
class Brand(
    @Id
    @Column
    val id: Long? = null,
    @Column("create_at")
    val createAt: LocalDate,
    @Column("update_at")
    var updateAt: LocalDate,
    @Column
    var name: String,
    @Column
    var description: String,
) {
    fun copy(name: String, updateAt: LocalDate, description: String): Brand {
        this.name = name
        this.updateAt = updateAt
        this.description = description
        return this
    }
}