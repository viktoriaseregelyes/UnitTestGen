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
	void testName0() {
		assertEquals(1, className.name(10, 0));
	}

	@Test
	void testName1() {
		assertEquals(2, className.name(10, 1));
	}

	@Test
	void testName2() {
		assertEquals(3, className.name(10, 5));
	}

}