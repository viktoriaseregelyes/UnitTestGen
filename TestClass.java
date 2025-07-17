import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

class CloudStorageServiceTest {
	private S3Client s3Client;
	private S3Client2 s3Client2;
	private CloudStorageService cloudStorageService;

	@BeforeEach
	void setUp() {
		s3Client = mock(S3Client.class);
		s3Client2 = mock(S3Client2.class);
		cloudStorageService = new CloudStorageService(s3Client, "hello");
	}

	@Test
	void testUploadFile() {
		verify(s3Client2, times(1)).putObject(any(PutObjectRequest.class), valami));
	}

	@Test
	void testUploadFile2() {
		verify(s3Client, times(1)).save(valami, any(PutObjectRequest.class)));
		verify(s3Client2, times(1)).putObject2(any(PutObjectRequest.class), any(Path.class)));
	}

}