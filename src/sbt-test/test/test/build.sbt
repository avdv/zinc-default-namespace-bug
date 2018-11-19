
scalaVersion in ThisBuild := "2.12.7"

TaskKey[Unit]("rmFoo") := {
  val dir = (classDirectory in Compile).value
  IO.delete(dir / "Foo.class")
}
