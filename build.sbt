name := """AkkaStreams-Elasticsearch"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.elasticsearch.client" % "transport" % "5.2.0",
  "com.typesafe.akka" % "akka-stream_2.11" % "2.4.16",
  "org.scalatest" % "scalatest_2.11" % "3.0.1",
  "org.twitter4j" % "twitter4j-stream" % "4.0.6"
)
