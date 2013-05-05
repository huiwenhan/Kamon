import sbt._
import Keys._

object Build extends Build {
  import Dependencies._
  import Settings._


  lazy val root = Project("kamon", file("."))
    .settings(basicSettings: _*)
    .settings(
      libraryDependencies ++=
        compile(akkaActor, sprayCan, sprayClient, sprayRouting, sprayServlet, aspectJ, metrics, newrelic, metricsScala) ++
        test(scalatest, sprayTestkit))


}