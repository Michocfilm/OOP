import java.util.Arrays;

public class LAB5_680449 {
    static int [] data = {28,58,8,77,48,39};
    static ArrayProcessor q1NumberOfEvenElement;
    static ArrayProcessor q2IndexOfLargestEvenValue;
    static ArrayProcessor myMedian;

    static void q1() {
        q1NumberOfEvenElement = (arr) -> {
            int count = 0;
            for(int i : arr){
                if (i % 2 == 0) count++;
            }
            return count;
        };
        System.out.println("q1 : " + q1NumberOfEvenElement.calculate(data));
    }
    static void q2(){
        q2IndexOfLargestEvenValue = (arr) -> {
            int maxVal = Integer.MIN_VALUE;
            int maxId = -1;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] % 2 == 0 && arr[i] > maxVal){
                    maxVal = arr[i];
                    maxId = i;
                }
            }
            return maxId;
        };
        System.out.println("q2 : " + q2IndexOfLargestEvenValue.calculate(data));
    }
    static void online(){
        int[] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = (arr) -> arr[arr.length / 2];
        System.out.println("q3 : " + myMedian.calculate(tmp));
    }
    static void q_1(){
        MemberTypeWithDiscount m1 = MemberTypeWithDiscount.GOLD;
        MemberTypeWithDiscount m2 = MemberTypeWithDiscount.GOLD;
        System.out.println(m1 == m2);
    }
    static void q_2(){
        int[] monthly = {1,1,1,1,1,-1,1,-1};
        Customer yindee =new Customer("Yindee");
        int i = 0;
        for(; i < monthly.length ; i++){
            yindee.spend(monthly[i]);
        }
    }
    static void q_3() {
        int[] monthly = {1,1,1,1,1,-1,1,-1};
        Client preeda = new Client("Preeda");
        int i = 0;
        for(; i < monthly.length; i++){
            preeda.spend(monthly[i]);
        }
    }
    public static void main(String [] args){
        q1();
        q2();
        online();
        q_1();
        q_2();
        q_3();
    }
}
