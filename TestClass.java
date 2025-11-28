import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

class HexFormatTest {
	private byte[] bytes;
	private HexFormat hexFormat;

	@BeforeEach
	void setUp() {
		this.bytes = mock(byte[].class);
		this.hexFormat = new HexFormat();
	}

	@Test
	void testFormatHex0() {
		byte[] bytes = new byte[] {0x00, 0x0F, 0x1A, (byte)0xFF};
		assertEquals("000f1aff", hexFormat.formatHex(bytes));
	}

	@Test
	void testParseHex0() {
		assertArrayEquals(new byte[]{0x00, 0x0F, 0x1A, (byte)0xFF}, 0x00, hexFormat.parseHex("000f1aff"));
	}

	@Test
	void testParseHex_InvalidHex0() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> hexFormat.parseHex("ZZ"));
		assertEquals("Invalid Hexadecimal Character", exception.getMessage());
	}

}