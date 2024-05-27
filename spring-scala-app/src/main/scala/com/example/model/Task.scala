package com.example.model

import jakarta.persistence._
import jakarta.validation.constraints.NotNull
//import com.sun.istack.NotNull

@Entity
@Table(name = "tasks")
class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _

  @NotNull
  @Column(nullable = false)
  var title: String = _

  var description: String = _

  override def toString: String = s"Task(id=$id, title=$title, description=$description)"
}