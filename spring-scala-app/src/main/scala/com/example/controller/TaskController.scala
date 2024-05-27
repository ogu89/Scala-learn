package com.example.controller

import com.example.model.Task
import com.example.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
import jakarta.validation.Valid
import org.slf4j.LoggerFactory


@RestController
@RequestMapping(Array("/api/tasks"))
class TaskController @Autowired()(private val taskService: TaskService){
  private val logger = LoggerFactory.getLogger(classOf[TaskController])


  @PostMapping
  def createTask(@Valid @RequestBody task: Task): Task = {
    println(s"Received task: $task")
    logger.info(s"Received task: $task")
    if (task.title == null || task.title.isEmpty) {
      throw new IllegalArgumentException("Title cannot be null or empty")
    }
    taskService.save(task)
  }

  @GetMapping(Array("/{id}"))
  def getTask(@PathVariable id: Long): Task = taskService.findById(id)

  @GetMapping
  def getAllTasks(@RequestBody task: Task): java.util.List[Task] = {
    println("Hello")
    println(task)
    println(s"Received task: $task")

    println(task.title, task.description)
    logger.info(s"Received task: $task")
    taskService.findAll()
  }

  @PutMapping(Array("/{id}"))
  def updateTask(@PathVariable id: Long, @RequestBody task: Task): Task = taskService.update(id, task)


  @DeleteMapping(Array("/{id}"))
  def deleteTask(@PathVariable id: Long): Unit = taskService.delete(id)

}