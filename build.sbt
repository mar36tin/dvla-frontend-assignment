import play.routes.compiler.InjectedRoutesGenerator
import play.sbt.PlayScala

name := """dvla-front-assignment"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers += "Codehaus stable repository" at "http://repository.codehaus.org/"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc()
libraryDependencies += "org.jsoup" % "jsoup" % "1.7.2"
libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"

routesGenerator := InjectedRoutesGenerator

fork in run := true