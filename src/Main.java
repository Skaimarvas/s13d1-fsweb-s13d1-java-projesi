public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("----------------Havlayan-Köpke------------------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("----------------Bunaklık-Tespiti------------------------");
        System.out.println(hasTeen(35,26,15));
        System.out.println(hasTeen(55,22,33));

        System.out.println("--------------------Fofenk-Kedi--------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("--------------------Dikdortgen-Alan--------------------");
        System.out.println(areaRectangle(-1,2));
        System.out.println(areaRectangle(5,-5));
        System.out.println(areaRectangle(13,21));

        System.out.println("--------------------Daire-Alan--------------------");
        System.out.println(areaCircle(5));
        System.out.println(areaCircle(-3));
    }

    public static boolean shouldWakeUp (boolean isDog, int num){

        if (isDog) {
            if (num >= 0 && num <= 23) {
                return (num < 8 || num > 20);
            }
        }

       return false;
    }
    public static boolean hasTeen (int num1, int num2, int num3){

        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen (int age){
        return age >= 13 && age<=19;
    }
    public static boolean isCatPlaying(boolean isSummer, int heat){

        int upperLimit = isSummer ? 45 : 35;

        return heat >= 25 && heat <= upperLimit;

    }
    public static double areaRectangle (double num1, double num2){
     if(num1 < 0 || num2 < 0){
         return -1;
     }
     return num1 * num2;
 }

    public static double areaCircle (double radius){
        if(radius < 0){
            return -1;
        }
        return Math.pow(radius,2)*Math.PI;
    }

}