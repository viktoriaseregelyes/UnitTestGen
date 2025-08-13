import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ClassNameTest {
	private ClassName className;

	@BeforeEach
	void setUp() {
		this.className = new ClassName();
	}

	@Test
	void testName() {
		assertEquals(10, className.name(10, 0));
	}

}