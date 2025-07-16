> Minták:
> - importnál kb mindig ugyanazt kell importálni a tesztekhez
> - BeforeEach megkövetelése!
> - osztálynév eredeti + Test
> - egy funkcióhoz lefixálni, mit vizsáljon (regisztráció, elem hozzáadás, törlés stb.)

# Calculator

> Plusz esetek:
> - 2 eset vizsgálata akár

    import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    class CalculatorTest {
    
        private Calculator calculator;
    
        @BeforeEach
        void setUp() {
            calculator = new Calculator();
        }
    
        @Test
        void testAdd() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(0, calculator.add(-1, 1));
        }
    
        @Test
        void testSubtract() {
            assertEquals(1, calculator.subtract(3, 2));
            assertEquals(-2, calculator.subtract(1, 3));
        }
    
        @Test
        void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(0, calculator.multiply(0, 5));
        }
    
        @Test
        void testDivide() {
            assertEquals(2, calculator.divide(6, 3));
            assertEquals(5, calculator.divide(10, 2));
        }
    
        @Test
        void testDivisionByZero() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
            assertEquals("Division by zero is not allowed", exception.getMessage());
        }
    }

# Service

> Plusz esetek:
> - dupla regisztráció 1 emaillel
> - rossz jelszó

    import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    class UserServiceTest {
    
        private UserService userService;
    
        @BeforeEach
        void setUp() {
            userService = new UserService();
        }
    
        @Test
        void testRegisterUser() {
            userService.register("john_doe", "password123");
            assertTrue(userService.login("john_doe", "password123"));
        }
    
        @Test
        void testDuplicateUserRegistration() {
            userService.register("jane_doe", "securePass");
            Exception exception = assertThrows(IllegalArgumentException.class, () -> 
                userService.register("jane_doe", "newPass"));
            assertEquals("User already exists", exception.getMessage());
        }
    
        @Test
        void testLoginWithWrongPassword() {
            userService.register("alice", "mypassword");
            assertFalse(userService.login("alice", "wrongpassword"));
        }
    }

# Add, remove

> Plusz esetek:
> - nem létező elem eltávolítása

    import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    class ShoppingCartTest {
    
        private ShoppingCart cart;
    
        @BeforeEach
        void setUp() {
            cart = new ShoppingCart();
        }
    
        @Test
        void testAddItem() {
            cart.addItem("Laptop");
            assertEquals(1, cart.getTotalItems());
        }
    
        @Test
        void testRemoveItem() {
            cart.addItem("Phone");
            cart.removeItem("Phone");
            assertEquals(0, cart.getTotalItems());
        }
    
        @Test
        void testRemoveNonExistentItem() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> 
                cart.removeItem("Tablet"));
            assertEquals("Item not found in cart", exception.getMessage());
        }
    }

# Mocking

    import static org.mockito.Mockito.*;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import org.mockito.Mock;
    import org.mockito.MockitoAnnotations;
    import software.amazon.awssdk.services.s3.S3Client;
    import software.amazon.awssdk.services.s3.model.PutObjectRequest;
    import java.nio.file.Path;
    
    class CloudStorageServiceTest {
    
        @Mock
        private S3Client s3Client;
        private CloudStorageService storageService;
        
        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
            storageService = new CloudStorageService(s3Client, "test-bucket");
        }
    
        @Test
        void testUploadFile() {
            Path mockFilePath = Path.of("test.txt");
            storageService.uploadFile("file-key", mockFilePath);
    
            verify(s3Client, times(1)).putObject(any(PutObjectRequest.class), eq(mockFilePath));
        }
    }

--

    import static org.mockito.Mockito.*;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import org.mockito.Mock;
    import org.mockito.MockitoAnnotations;
    import com.google.cloud.firestore.Firestore;
    import com.google.cloud.firestore.DocumentReference;
    import com.google.cloud.firestore.CollectionReference;
    import java.util.concurrent.ExecutionException;
    
    class FirestoreServiceTest {
    
        @Mock
        private Firestore firestore;
        @Mock
        private CollectionReference usersCollection;
        @Mock
        private DocumentReference documentReference;
        
        private FirestoreService firestoreService;
        
        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
            firestoreService = new FirestoreService(firestore);
    
            when(firestore.collection("users")).thenReturn(usersCollection);
            when(usersCollection.document("user123")).thenReturn(documentReference);
        }
    
        @Test
        void testSaveUser() throws ExecutionException, InterruptedException {
            doNothing().when(documentReference).set(anyMap());
    
            firestoreService.saveUser("user123", "John Doe");
    
            verify(documentReference, times(1)).set(anyMap());
        }
    }

--

    import static org.junit.jupiter.api.Assertions.*;
    import static org.mockito.Mockito.*;
    
    import java.lang.reflect.Method;
    import java.lang.reflect.Parameter;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
    import org.mockito.Mock;
    import org.mockito.MockitoAnnotations;
    
    class ReflectionTest {
    
        private Reflection reflection;
        private Reflection.Java8 java8Reflection;
        private Reflection.Android24 android24Reflection;
    
        @Mock
        private Method method;
    
        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
            reflection = new Reflection();
        }
    
        @Test
        void testIsDefaultMethod() {
            assertFalse(reflection.isDefaultMethod(method));
        }

        @Test
        void testIsDefaultMethod_Java8() {
            assertTrue(java8Reflection.isDefaultMethod(defaultMethod));
        }
    
        @Test
        void testIsDefaultMethod_Android24() {
            assertTrue(android24Reflection.isDefaultMethod(defaultMethod));
        }
    
        @Test
        void testInvokeDefaultMethod() {
            assertThrows(AssertionError.class, () -> reflection.invokeDefaultMethod(method, String.class, "proxy", null));
        }
    
        @Test
        void testDescribeMethodParameter() {
            assertEquals("parameter #1", reflection.describeMethodParameter(method, 0));
            assertEquals("parameter #2", reflection.describeMethodParameter(method, 1));
        }
    
        @Test
        // only for Java8
        void testDescribeMethodParameter() {
            Parameter parameter = method.getParameters()[0];
    
            if (parameter.isNamePresent()) {
                assertEquals("parameter 'text'", java8Reflection.describeMethodParameter(method, 0));
            } else {
                assertEquals("parameter #1", java8Reflection.describeMethodParameter(method, 0));
            }
        }
    }

