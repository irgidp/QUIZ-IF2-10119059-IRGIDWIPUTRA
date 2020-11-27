/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : QUIZ
 */
package quiz.if2.pkg10119059.irgidwiputra;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class QUIZIF210119059IRGIDWIPUTRA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer cus = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : "); cus.setName(input.next());
        System.out.print("Customer Email : "); cus.setEmail(input.next());
        cus.displayService();
        System.out.println("Choose (1/2/3) : ");
        System.out.println("are you Member(yes/no) :");
        System.out.println("");
        System.out.println("#******************************#");
        System.out.println("#*****CUSTOMER SEVICE*****#");
        System.out.println("Date Transaction : ");cus.currentTime();
        System.out.println("Service Price : Rp");
        System.out.println("Discount : Rp");
        System.out.println("Total Pay : Rp "); cus.getTotalPay();
        
    }
    
}
