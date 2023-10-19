package inject.extension;

import javax.inject.Inject;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.TaskAction;

public class JavaMessageExtensionTask extends DefaultTask {

	private final Property<Integer> code;

	@Inject
	public JavaMessageExtensionTask(Project project) {
		JavaMessageExtension messageExtension = project.getExtensions().getByType(JavaMessageExtension.class);
		this.code = messageExtension.getCode();
	}

	@TaskAction
	void print() {
		System.out.println("Code :" + code.get());
	}
}
