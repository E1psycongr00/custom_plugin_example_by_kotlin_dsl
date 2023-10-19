package inject;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JavaInjectPlugin implements Plugin<Project> {
	@Override
	public void apply(Project project) {
		project.getTasks().register("injectTask", JavaInjectTask.class, "my task");
	}
}
