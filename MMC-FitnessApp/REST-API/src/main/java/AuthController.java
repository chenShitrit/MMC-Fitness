import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("auth")
public class AuthController {

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Object> login(@RequestBody LoginInformation logInfo, HttpServletRequest request) {
//        try {
//            authService.login();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
        return null;
    }

    @PostMapping(value = "/logout")
    public ResponseEntity<Object> logout() {
        return null;
    }

}
