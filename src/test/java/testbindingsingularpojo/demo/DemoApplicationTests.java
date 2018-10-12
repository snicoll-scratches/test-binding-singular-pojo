package testbindingsingularpojo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DemoProperties properties;

	@Test
	public void bindToSingularPojoWithArray() {
		assertThat(properties.getArray()).containsOnlyKeys("my.test1", "my.test2");
		assertThat(properties.getArray().get("my.test1")).containsOnly(
				Thing.valueOf("value1"), Thing.valueOf("value2"));
		assertThat(properties.getArray().get("my.test2")).containsOnly(
				Thing.valueOf("value3"));
	}

	@Test
	public void bindToSingularPojo() {
		assertThat(properties.getSingle()).containsOnlyKeys("my.test3");
		assertThat(properties.getSingle().get("my.test3")).isEqualTo(Thing.valueOf("value4"));
	}

	@Test
	public void bindToRawString() {
		assertThat(properties.getRaw()).containsOnlyKeys("my.test4");
		assertThat(properties.getRaw().get("my.test4")).isEqualTo("value5");
	}

}
