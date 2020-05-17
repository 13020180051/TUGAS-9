Public class OuterClass {
Public void display(){
      int num = 24;
class Inner{
public void print() {
System.out.println("This is method innerclass "+num);
         }
      }
Inner obj = new Inner();
obj.print();
   }
Public static void main(String args[]){
Outer Classouter = new OuterClass();
outer.display();
   }
}
