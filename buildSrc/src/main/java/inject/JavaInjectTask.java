package inject;

import javax.inject.Inject;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class JavaInjectTask extends DefaultTask {

	private final String message;

	@Inject
	public JavaInjectTask(String message) {
		this.message = message;
	}

	@TaskAction
	void print() {
		System.out.println("my Message is " + this.message);
	}
}
