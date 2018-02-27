package bottle;

public class MyWater {
    private static float BIG_BOTTLE = 2;
    private static float MEDIUM_BOTTLE = 1;
    private static float SMALL_BOTTLE = 0.5F;

    private int countOfBig;
    private int countOfMedium;
    private int countOfSmall;

    // Pozwól podać wartości startowe 'magazynu'
    public MyWater(int countOfBig, int countOfMedium, int countOfSmall) {
        this.countOfBig = countOfBig;
        this.countOfMedium = countOfMedium;
        this.countOfSmall = countOfSmall;
    }

    public void addBigBottle(int large){
        countOfBig += large;
    }


    public void addMediumBottle(int medium){
        countOfMedium += countOfMedium;
    }


    public void addSmallBottle(int small){
        countOfSmall += countOfSmall;
    }

    public static float getBigBottle() {
        return BIG_BOTTLE;
    }

    public static void setBigBottle(float bigBottle) {
        BIG_BOTTLE = bigBottle;
    }

    public static float getMediumBottle() {
        return MEDIUM_BOTTLE;
    }

    public static void setMediumBottle(float mediumBottle) {
        MEDIUM_BOTTLE = mediumBottle;
    }

    public static float getSmallBottle() {
        return SMALL_BOTTLE;
    }

    public static void setSmallBottle(float smallBottle) {
        SMALL_BOTTLE = smallBottle;
    }

    public int getCountOfBig() {
        return countOfBig;
    }

    public void setCountOfBig(int countOfBig) {
        this.countOfBig = countOfBig;
    }

    public int getCountOfMedium() {
        return countOfMedium;
    }

    public void setCountOfMedium(int countOfMedium) {
        this.countOfMedium = countOfMedium;
    }

    public int getCountOfSmall() {
        return countOfSmall;
    }

    public void setCountOfSmall(int countOfSmall) {
        this.countOfSmall = countOfSmall;
    }


    public float calculateAllWater(){
        return countOfBig * BIG_BOTTLE + countOfMedium * MEDIUM_BOTTLE +
                countOfSmall * SMALL_BOTTLE;
    }
}
