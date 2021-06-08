public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int divisor = 0;
        int end = 0;
        int i = 1;
        if(first<second){
            end = first;
        } else {
            end = second;
        }
        while(i <= end ){
            if(first % i == 0 && second % i == 0){
                divisor = i;
            }
            i++;
        }
        return divisor;
    }
}
