package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    Map<String,String> mp = new HashMap<>();

    public LoginService(){
        mp.put("Hari","Shankar");
        mp.put("Sam","Sam@123");
        mp.put("Admin","Admin@123");
    }


    public boolean validate(String username, String password) {
        if(mp.containsKey(username)) {
            String ogpass = mp.get(username);
            if(ogpass.equals(password))
            {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
