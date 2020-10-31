import java. util. Arrays;

class q1{
    static void miniMaxSum(int[] arr) {
       Arrays.sort(arr);
       int[] arr_sum = new int[5];
       int sum1 =0;
       int block=0;
       int k =0;
       for(k=0;k<arr.length;k++){
           
           for(int i=0; i<arr.length;i++){
               
               block = arr[k];
               sum1= arr[i] + sum1 ;
               
           }
          
           arr_sum[k] = sum1 -block;
           sum1=0;
           
           
       }
      
       
       Arrays.sort(arr_sum);

       System.out.println(arr_sum[0] + " " + arr_sum[4]);

    }

    public static void main(String[] args){
        int [] arr = {1 , 2 , 3, 4, 5};
        miniMaxSum(arr);
    }
}