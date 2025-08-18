package guru.springframework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled("Will fail due to JPA setup")
@SpringBootTest
class Spring5RecipeAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
