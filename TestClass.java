import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

class ClassNameTest {
	private ClassName className;

	@BeforeEach
	void setUp() {
		this.className = new ClassName();
	}

	@Test
	void testName() {
		when(valami(e,e)).thenReturn(true).thenThrow(IllegalStateException.class);
		assertEquals(10, className.name(10, 0));
	}

}