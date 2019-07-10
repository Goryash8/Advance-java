import java.io.*;
class demo{
	public static void main(String args[]){
      try
      {
         File temp =new File("abc.txt"); 
          
         boolean exists = temp.exists();
          
         System.out.println("file exists : " + exists);
      } catch (Exception e)
      {
      }
}
}