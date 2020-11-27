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
public interface ServiceItem {
    
    public void displayService();
    
    public float getPrice(int serviceItem);
    
    public boolean checkMemberStatus(String MemberStatus);
    
    public float getSale(boolean isMember, float parServicePrice);
}
