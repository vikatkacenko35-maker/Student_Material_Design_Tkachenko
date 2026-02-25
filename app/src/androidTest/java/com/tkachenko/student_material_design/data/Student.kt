package com.tkachenko.student_material_design.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import org.hamcrest.StringDescription

class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age:Int,
    @StringRes val description: Int
    )

