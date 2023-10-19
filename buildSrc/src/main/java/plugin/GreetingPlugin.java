package plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionContainer;

public class GreetingPlugin implements Plugin<Project> {

	@Override
	public void apply(Project target) {
		ExtensionContainer extensions = target.getExtensions();
		GreetingPluginExtension greeting = extensions.create("greeting", GreetingPluginExtension.class);
		target.task("hello")
			.doLast(task -> System.out.println("Hello from " + greeting.getMessage().get() + "!"));
	}
}
