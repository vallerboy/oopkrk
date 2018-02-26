package task5;

public class Guarantee {
    private Product product;
    private String validUntil;

    public Guarantee(Product product, String validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    //format daty: yyyy/MM/dd
    public boolean isValid(String today){
        String[] validUntilArray = validUntil.split("/");
        String[] todayArray = today.split("/");


        if(Integer.valueOf(validUntilArray[0]) < Integer.valueOf(todayArray[0])){
            setProductNull();
            return  false;
        }else if(Integer.valueOf(validUntilArray[1]) < Integer.valueOf(todayArray[1])){
            setProductNull();
            return  false;
        }else if(Integer.valueOf(validUntilArray[2]) < Integer.valueOf(todayArray[2])){
            setProductNull();
            return  false;
        }
        return true;
    }

    private void setProductNull() {
        product = null;
        validUntil = null;
    }
}
