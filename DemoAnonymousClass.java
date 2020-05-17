Public class DemoAnonymousClass {
  Public static void main(String[] args){
    Thread anonymous = newThread(){
      @Override
      Public void run(){
        System.out.println("This is example anonymous class in Java");
      }
    };
    anonymous.start();
  }
}
