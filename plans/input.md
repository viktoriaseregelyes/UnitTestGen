# Calculator

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    
        public int subtract(int a, int b) {
            return a - b;
        }
    
        public int multiply(int a, int b) {
            return a * b;
        }
    
        public int divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return a / b;
        }
    }

# Service

    import java.util.HashMap;
    import java.util.Map;
    
    public class UserService {
    private Map<String, String> users = new HashMap<>();
    
        public void register(String username, String password) {
            if (users.containsKey(username)) {
                throw new IllegalArgumentException("User already exists");
            }
            users.put(username, password);
        }
    
        public boolean login(String username, String password) {
            return users.containsKey(username) && users.get(username).equals(password);
        }
    }

# Add, remove

    import java.util.ArrayList;
    import java.util.List;
    
    public class ShoppingCart {
    private List<String> items = new ArrayList<>();
    
        public void addItem(String item) {
            items.add(item);
        }
    
        public void removeItem(String item) {
            if (!items.contains(item)) {
                throw new IllegalArgumentException("Item not found in cart");
            }
            items.remove(item);
        }
    
        public int getTotalItems() {
            return items.size();
        }
    }

# Mocking

    import software.amazon.awssdk.services.s3.S3Client;
    import software.amazon.awssdk.services.s3.model.PutObjectRequest;
    import java.nio.file.Path;
    
    public class CloudStorageService {
    private final S3Client s3Client;
    private final String bucketName;
    
        public CloudStorageService(S3Client s3Client, String bucketName) {
            this.s3Client = s3Client;
            this.bucketName = bucketName;
        }
    
        public void uploadFile(String key, Path filePath) {
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();
            s3Client.putObject(request, filePath);
        }
    }

--

    import com.google.cloud.firestore.Firestore;
    import com.google.cloud.firestore.DocumentReference;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.concurrent.ExecutionException;
    
    public class FirestoreService {
    private final Firestore firestore;
    
        public FirestoreService(Firestore firestore) {
            this.firestore = firestore;
        }
    
        public void saveUser(String userId, String name) throws ExecutionException, InterruptedException {
            Map<String, Object> data = new HashMap<>();
            data.put("name", name);
            DocumentReference docRef = firestore.collection("users").document(userId);
            docRef.set(data).get(); // Simulates waiting for Firestore write operation
        }
    }

--
    package retrofit2;
    
    import android.annotation.TargetApi;
    import android.os.Build;
    import java.lang.reflect.Method;
    import java.lang.reflect.Parameter;
    import javax.annotation.Nullable;
    import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
    
    class Reflection {
        boolean isDefaultMethod(Method method) {
            return false;
        }
    
        @Nullable
        Object invokeDefaultMethod(Method method, Class<?> declaringClass, Object proxy, @Nullable Object[] args) throws Throwable {
            throw new AssertionError();
        }
    
        String describeMethodParameter(Method method, int index) {
            return "parameter #" + (index + 1);
        }
    
        @IgnoreJRERequirement // Only used on JVM.
            static class Java8 extends Reflection {
            @Override
            boolean isDefaultMethod(Method method) {
                return method.isDefault();
            }
    
            @Override
            Object invokeDefaultMethod(Method method, Class<?> declaringClass, Object proxy, @Nullable Object[] args) throws Throwable {
              return DefaultMethodSupport.invoke(method, declaringClass, proxy, args);
            }
    
            @Override
            String describeMethodParameter(Method method, int index) {
              Parameter parameter = method.getParameters()[index];
              if (parameter.isNamePresent()) {
                return "parameter '" + parameter.getName() + '\'';
              }
              return super.describeMethodParameter(method, index);
            }
        }

        @TargetApi(24)
        @IgnoreJRERequirement // Only used on Android API 24+.
        static final class Android24 extends Reflection {
            @Override
            boolean isDefaultMethod(Method method) {
                return method.isDefault();
            }
    
            @Override
            Object invokeDefaultMethod(Method method, Class<?> declaringClass, Object proxy, @Nullable Object[] args) throws Throwable {
                if (Build.VERSION.SDK_INT < 26) {
                    throw new UnsupportedOperationException(
                    "Calling default methods on API 24 and 25 is not supported");
                }
                return DefaultMethodSupport.invoke(method, declaringClass, proxy, args);
            }
        }
    }
