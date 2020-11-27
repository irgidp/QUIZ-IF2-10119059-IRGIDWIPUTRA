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
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
    this.email = email;
    }
    public boolean isMember(){
        return true;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    @Override
    public String currentTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date));  
        return null;
    }

    
}
