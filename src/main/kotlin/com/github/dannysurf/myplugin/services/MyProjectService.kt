package com.github.dannysurf.myplugin.services

import com.intellij.openapi.project.Project
import com.github.dannysurf.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
