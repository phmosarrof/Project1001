package encapsulation;
public class RunEncap {

   public static void main(String args[]) throws Exception {
	  Encapsulation001 encap = new Encapsulation001();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}