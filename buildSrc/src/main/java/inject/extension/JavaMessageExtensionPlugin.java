package inject.extension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionContainer;

public class JavaMessageExtensionPlugin implements Plugin<Project> {
	@Override
	public void apply(Project project) {
		ExtensionContainer extensions = project.getExtensions();
		extensions.create("messageExtension", JavaMessageExtension.class);
		project.getTasks().register("JavaMessageTask", JavaMessageExtensionTask.class);
	}
}
