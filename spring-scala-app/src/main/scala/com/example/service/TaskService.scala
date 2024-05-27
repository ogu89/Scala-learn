package com.example.service

import com.example.model.Task
import com.example.repository.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import scala.collection.JavaConverters._

@Service
class TaskService @Autowired()(private val taskRepository: TaskRepository){

  def save(task: Task): Task = taskRepository.save(task)

  def findById(id: Long): Task = taskRepository.findById(id).orElse(null)

  def findAll():  java.util.List[Task] = taskRepository.findAll().asScala.toList.asJava

  def update(id: Long, task: Task): Task = {
    val existingTask = findById(id)
    existingTask.title = task.title
    existingTask.description = task.description
    taskRepository.save(existingTask)
  }

  def delete(id: Long): Unit = taskRepository.deleteById(id)
}