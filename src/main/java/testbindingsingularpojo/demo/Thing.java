package testbindingsingularpojo.demo;

import java.util.Objects;

/**
 *
 * @author Stephane Nicoll
 */
public class Thing {

	private final String value;

	private Thing(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static Thing valueOf(String value) {
		return new Thing(value);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Thing{");
		sb.append("value='").append(value).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Thing thing = (Thing) o;
		return Objects.equals(value, thing.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

}
