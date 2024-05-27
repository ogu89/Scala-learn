ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "spring-scala-app",
    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-web" % "3.0.0",
      "org.springframework.boot" % "spring-boot-starter-data-jpa" % "3.0.0",
      // other dependencies...
      "org.springframework.boot" % "spring-boot-starter-validation" % "3.0.0",
      "org.scala-lang" % "scala-library" % scalaVersion.value,
      "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.1",
      "com.h2database" % "h2" % "2.1.214",
      "org.springframework.boot" % "spring-boot-starter-test" % "3.0.0" % Test,
      "jakarta.persistence" % "jakarta.persistence-api" % "3.0.0",
      "org.hibernate.orm" % "hibernate-core" % "6.1.0.Final",

    ),
  )
enablePlugins(JavaAppPackaging)

