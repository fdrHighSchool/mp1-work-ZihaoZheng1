
/**
 * Write a description of class Rocket here.
 * Create a rocket
 * @Zihao Zheng
 * @9/22/22
 */
public class Rocket{
    public static void main(String[] args){
        triangle();
        body();
        name();
        body();
        triangle();
    } //close main method
    
    public static void triangle(){
        System.out.println("   /\\  ");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\ ");
    } //close triangle method
    
    public static void body(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    } //close body method
    
    public static void name(){
        System.out.println("|United|");
        System.out.println("|States|");
    } //close name method

} // close class