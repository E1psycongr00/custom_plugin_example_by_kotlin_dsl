package plugin;

import org.gradle.api.provider.Property;

public interface GreetingPluginExtension {
	Property<String> getMessage();

}
