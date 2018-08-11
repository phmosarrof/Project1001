package encapsulation;
public class RunEncap {

   public static void main(String args[]) throws Exception {
	  Encapsulation001 encap = new Encapsulation001();
      encap.setName("Mosarrof Hossain");
      encap.setAge(20);
      encap.setIdNum("12343090");

      System.out.print(" Name : " + encap.getName() + " \n Age : " + encap.getAge());
   }
}