public class learningJava {
    public static double getBigNum(double[] arr){
        double num = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
}

