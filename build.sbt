name := "tf-test"

version := "0.0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.tensorflow" % "tensorflow" % "1.14.0"

libraryDependencies += "org.tensorflow" % "libtensorflow_jni" % "1.14.0"

libraryDependencies += "com.google.guava" % "guava" % "27.1-jre"

run / fork := true

javaOptions in run += s"-Djava.library.path=" + baseDirectory.value.toString + "/lib/native"