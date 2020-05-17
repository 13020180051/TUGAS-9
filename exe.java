package multipletype;

public class exe {
    public static void main (String[] args){
        Multipletype<String, Integer> multiple = new Multipletype <String,Integer>("Ajja",1302018051);
        
        String nama = multiple.getNama();
        System.out.println("Nama saya :" +nama);
        
        int Nim = multiple.getNim();
        System.out.println("Nim saya :" +Nim);
    }
    
}
