package com.udacity.notepad.data

import java.util.*

fun demoDataClasses() {
    val note = Note(text = "")
    val aCopy = note.copy(text = "df", updatedAt = Date())
}