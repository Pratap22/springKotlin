package com.springskeleton.spring_skeleton.service

import com.springskeleton.spring_skeleton.entities.Widget
import com.springskeleton.spring_skeleton.repo.WidgetRepo
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class WidgetService (val widgetRepo: WidgetRepo){
    fun getAllWidgets() = widgetRepo.findAll()

    fun addWidget(widget: Widget): Widget {
        return widgetRepo.save(widget)
    }
}