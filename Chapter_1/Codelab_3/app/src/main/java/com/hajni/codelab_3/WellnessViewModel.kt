package com.hajni.codelab_3

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.hajni.codelab_3.ui.theme.view.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        _tasks.find { it.id == item.id }?.let {task ->
            task.checked = checked
        }

    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }