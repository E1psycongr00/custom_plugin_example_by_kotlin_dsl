
plugins {
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("greeting-plugin") {
            id = "greeting"
            implementationClass = "plugin.GreetingPlugin"
        }
        create("inject-plugin") {
            id = "inject"
            implementationClass = "inject.JavaInjectPlugin"
        }
        create("message-plugin") {
            id = "messaging"
            implementationClass = "inject.extension.JavaMessageExtensionPlugin"
        }
    }
}
