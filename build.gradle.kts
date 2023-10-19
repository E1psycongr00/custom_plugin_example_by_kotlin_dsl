import inject.extension.JavaMessageExtension
import plugin.GreetingPluginExtension

plugins {
    id("inject")
    id("greeting")
    id("messaging")
}
//
// Configure the extension
configure<GreetingPluginExtension> {
    message = "LHG"
}

configure<JavaMessageExtension> {
    code = 1234
}

//
//tasks.compileJava.configure {
//    dependsOn(tasks.hello)
//}



tasks.register("myTask1") {
    description = "나의 태스크"
    doFirst {
        println("hello first1")
    }
    println("run1")
    doLast {
        println("hello last1")
    }
}

tasks.create("myTask2") {
    description = "task2"
    doFirst {
        println("hello first2")
    }
    println("run2")
    doLast {
        println("hello last2")
    }
}

val myTask by tasks.register("myTask") {
    description = "tasktask!!!"
    doFirst {
        println("hello first")
    }
    println("run")
    doLast {
        println("hello last")
    }
}

tasks.register<Copy>("copyTask") {
    from("src/main")
    into("tasks")
}