package generictype;

class Generictype<T> {
    //T adalah kepanjangan dari tipe parameter
    private T Manusia;
    
    //method void set dengan tipe parameter T
    protected void setManusia (T Manusia){
        this.Manusia = Manusia;
    }
   // method return get yang mengembalikan nilai Manusia
    protected T getManusia(){
        return Manusia;
    }
}
