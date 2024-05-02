package com.example.courses.modelo
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Cursos(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes: Int
)
