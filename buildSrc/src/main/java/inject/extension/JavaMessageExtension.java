package inject.extension;

import org.gradle.api.provider.Property;

public interface JavaMessageExtension {
	Property<Integer> getCode();
}
