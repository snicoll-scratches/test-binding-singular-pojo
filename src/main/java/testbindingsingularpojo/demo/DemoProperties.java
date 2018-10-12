package testbindingsingularpojo.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("demo")
public class DemoProperties {

	private final Map<String, Thing[]> array = new HashMap<>();

	private final Map<String, Thing> single = new HashMap<>();

	private final Map<String, String> raw = new HashMap<>();

	public Map<String, Thing[]> getArray() {
		return this.array;
	}

	public Map<String, Thing> getSingle() {
		return this.single;
	}

	public Map<String, String> getRaw() {
		return this.raw;
	}

}
