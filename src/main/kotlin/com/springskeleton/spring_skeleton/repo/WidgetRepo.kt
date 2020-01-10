package com.springskeleton.spring_skeleton.repo

import com.springskeleton.spring_skeleton.entities.Widget
import org.springframework.data.jpa.repository.JpaRepository

interface WidgetRepo : JpaRepository<Widget, Long> {
}