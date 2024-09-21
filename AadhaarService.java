import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String,Aadhaar> AadhaarMap= new HashMap<>();
    static {

         AadhaarMap.put("943883828157",new Aadhaar("943883828157",
                "Rahul", "Rustum", "Lasur"));

         AadhaarMap.put("984576983822",new Aadhaar("984576983822",
                "Rustum", "Raosaheb", "Lasur"));






    }
    public  Aadhaar getAadhaarByNumber(String AadhaarNumber)
    {
        return AadhaarMap.get(AadhaarNumber);

    }
}
