package Welcome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ngoc
 */
import javax.servlet.http.*;
public class MyCookie {
    public static String getCookieValue(
            Cookie[] cookies, String cookieName) {
        
        String cookieValue = "";
        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (cookieName.equals(cookie.getValue())) {
                    cookieValue = cookie.getValue();
                }
            }
        }
        return cookieValue;
    }
    
    
}
