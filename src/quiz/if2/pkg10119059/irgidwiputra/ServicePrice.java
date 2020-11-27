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
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    
    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        
    }

    @Override
    public float getPrice(int serviceItem) {
    int harga = 0;
    switch (serviceItem) {
        case 1:
            harga = 45;
            break;
        case 2:
            harga = 55;
            break;
        case 3:
            harga = 15;
            break;
        default:
            break;
    }
    return harga;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return true;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return 0;
    }
    
    public float getTotalPay(){
        return priceService - discount;
    }
    
}
