public class learningJava {
    public static void main(String[] args) {
        double[] array = {1, 2, 3};
        double bigNum = getBigNum(array);
        System.out.println(bigNum);
    }
    public static double getBigNum(double[] arr){
        double num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                num = arr[i];
            }
        }
        return num;
    }
}

