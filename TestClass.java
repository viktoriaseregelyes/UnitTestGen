import java.io.File;
import java.io.IOException;
import java.util.Vector;
import android.content.Context;
import android.os.Environment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class APKExpansionSupportTest {
	private APKExpansionSupport aPKExpansionSupport;

	@BeforeEach
	void setUp() {
		this.aPKExpansionSupport = new APKExpansionSupport();
	}

	@Test
	void testName() {
		assertEquals(10, aPKExpansionSupport.getAPKExpansionFiles(10, 0));
	}

	@Test
	void testName() {
		assertEquals(10, aPKExpansionSupport.getResourceZipFile(10, 0));
	}

	@Test
	void testName() {
		assertEquals(10, aPKExpansionSupport.getAPKExpansionZipFile(10, 0));
	}

	@Test
	void testName() {
		assertEquals(10, aPKExpansionSupport.getAPKExpansionZipFile(10, 0));
	}

}