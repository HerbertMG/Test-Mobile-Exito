package models;

import java.util.HashMap;
import java.util.Map;

import static utils.Constants.*;

public class UserInfoModel {

    private static final Map<String, String> infoUser = new HashMap<>();

    private UserInfoModel() {
    }

    public static Map<String, String> userInformation() {
        infoUser.put(FIRST_NAME,UserInformation.JUAN.getName());
        infoUser.put(LAST_NAME,UserInformation.JUAN.getLastName());
        infoUser.put(BORN_DATE,UserInformation.JUAN.getBornDate());
        infoUser.put(EMAIL,UserInformation.JUAN.getEmail());
        infoUser.put(PASSWORD,UserInformation.JUAN.getPassword());
        infoUser.put(DOCUMENT_NUMBER,UserInformation.JUAN.getDocNumber());
        infoUser.put(PHONE,UserInformation.JUAN.getPhone());

        return infoUser;
    }
}
