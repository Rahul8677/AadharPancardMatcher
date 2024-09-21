import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String,Pan> PanMap= new HashMap<>();
    static {
        PanMap.put("KEYKK2877Q",new Pan("KEYKK2877Q",
                "943883828157","HDFC",
                "Stocks,ETTS"));

        PanMap.put("KEYRR2833R",new Pan("KEYRR2833R",
                "984576983822","SBI",
                "Stocks,FD"));

    }
    public  Pan getPanByAadhaarNumber(String AadhaarNumber)
    {
         for(Pan Pan:PanMap.values())
         {
             if(Pan.getAadhaarNumber().equals(AadhaarNumber))
             {
                 return Pan;

             }
         }
         return null;

    }
}
