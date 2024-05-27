package com.example.repository

import com.example.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait TaskRepository extends JpaRepository[Task, Long]

