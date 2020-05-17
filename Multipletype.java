package multipletype;

public class Multipletype<T1,T2> {
     T1 nama;
     T2 Nim;
    
    public Multipletype(T1 nama, T2 Nim){
        this.nama= nama;
        this.Nim= Nim;
    }
    public T1 getNama() {
        return nama;
    }

    public void setNama(T1 nama) {
        this.nama = nama;
    }

    public T2 getNim() {
        return Nim;
    }

    public void setNim(T2 Nim) {
        this.Nim = Nim;
    }
    
}
