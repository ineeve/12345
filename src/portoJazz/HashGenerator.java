package portoJazz;

import java.util.UUID;

public class HashGenerator{

    public static String generateHash(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}