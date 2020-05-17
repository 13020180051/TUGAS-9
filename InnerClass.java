public class InnerClass {
  private class Inner {
    public void printText(){
      System.out.println("Inner class example in Java");
    }
  }
  public static void main(String[] args){
    DemoInnerClass oDemo = new DemoInnerClass();
    DemoInnerClass.Inner oInner = oDemo.newInner();
    oInner.printText();
  }
}
