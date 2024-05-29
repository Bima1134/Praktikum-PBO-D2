import java.util.HashMap;
import java.util.Map;

public class Lambdamap {
    public static void main(String[] args) {
         Map <String, String> mahasiswaMap = new HashMap<String,String>();
        mahasiswaMap.put("24060122140113","Bima Aditya Aryono");
        mahasiswaMap.put("24060122120005","Aditya Haidar Faishal");
        mahasiswaMap.put("24060122120021","Yusuf Zaenul Mustofa");
        mahasiswaMap.put("24060122120035","Zikry Keram");

        mahasiswaMap.forEach((key,nama)-> System.out.println("NIM :"+key +" "+ "Nama :"+nama));
    }
}
