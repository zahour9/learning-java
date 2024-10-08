public class learningJava {
    public static void main(String[] args) {
        double[] array = {1000039.001, 1.22, -10.909};
        double bigNum = getBigNum(array);
        System.out.println(bigNum);
    }
    public static double getBigNum(double[] arr){
        double num = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
            num = arr[0];
            }
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
}

