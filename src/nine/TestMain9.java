package nine;

import java.util.HashMap;
import java.util.Map;

public class TestMain9 {

    public static void main(String[] args) {
        Map<PhoneNumber,String> map = new HashMap<PhoneNumber,String>();
        map.put(new PhoneNumber(707,867,5309),"白富宽");
        // 输出null 违反hashCode 约定
        System.out.println(map.get(new PhoneNumber(707,867,5309)));
    }
}
