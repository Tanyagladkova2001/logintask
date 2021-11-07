
import com.company.UserService;
import com.company.user;

public class UserServiceDemo {

    public static void main(String[] args) {
        UserService service = new UserService();
        user username = new user("Tanya", "123");
        service.login(username, "12345");
        service.login(username, "123456");
    }
}