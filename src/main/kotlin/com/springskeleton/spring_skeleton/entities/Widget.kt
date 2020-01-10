package com.springskeleton.spring_skeleton.entities

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "widget")
data class Widget (
        @Column(name = "name")
        var name: String,
        var quantity: String,
        @Column(name = "date_updated")
        var dateUpdated: Long = System.currentTimeMillis(),
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
)