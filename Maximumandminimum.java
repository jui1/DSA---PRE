public class Maximumandminimum {
    public static void main(String[] args) {
        int arr [] = {90 , 78 ,60 ,-9 , 88, 45};

        int maxVal = arr[0];
        int minVal = arr[0];

        for( int  i = 0 ;i<arr.length;i++){
            maxVal = Math.max(maxVal , arr[i]);
            minVal = Math.min(minVal , arr[i]);



        }

        System.out.println(maxVal);
        System.out.println(minVal);
        
    }
    
}
