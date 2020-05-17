package no7;

class All_in_One<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Hewan;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setHewan(T Hewan){
        this.Hewan = Hewan;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Manusia
    protected T getHewan(){
        return Hewan;
    }
}