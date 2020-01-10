package com.springskeleton.spring_skeleton.controller

import com.springskeleton.spring_skeleton.entities.Widget
import com.springskeleton.spring_skeleton.model.Greeting
import com.springskeleton.spring_skeleton.service.WidgetService
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class WidgetController(val widgetService: WidgetService) {
    val counter = AtomicLong()

    @GetMapping("/getAllWidgets")
    fun getWidget() = widgetService.getAllWidgets()

    @PostMapping("/addWidget")
    fun addWidget(@RequestBody widget: Widget): Widget{
        return widgetService.addWidget(widget)
    }
}