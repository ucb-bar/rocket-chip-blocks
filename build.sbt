val chisel6Version = "6.7.0"
val chiselTestVersion = "6.0.0"
val scalaVersionFromChisel = "2.13.16"

ThisBuild / organization := "sifive"
ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalaVersion := scalaVersionFromChisel
ThisBuild / scalacOptions := Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:reflectiveCalls",
  "-Xsource:2.11"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/service/local/repositories/snapshots/content"

val rocketchip = "edu.berkeley.cs" %% "rocketchip-6.0.0" % "1.6-6.0.0-1b9f43352-SNAPSHOT"

libraryDependencies ++=
  Seq(
    rocketchip,
    "org.chipsalliance" %% "chisel" % chisel6Version,
    "edu.berkeley.cs" %% "chiseltest" % chiselTestVersion % Test,
  ),

