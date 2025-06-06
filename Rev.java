public class Rev {
    public static void main(String[] args) {
        int number=4;
        boolean flag=true;
        if(number<=1) flag=false;
        for(int i=2; i <=Math.sqrt(number); i++){
            if(number%i==0){
                flag=false;
            }
        }
            if(flag){
                System.out.println("Prime");
            }else{
                System.out.println("Not  a prime");
            }

    
        //  int[] arr = {1, 2, 4, 5};
        // int n = 5;
        // int total = n * (n + 1) / 2;
        // int sum = 0;
        // for (int num : arr) {
        //     sum += num;
        // }
        // int missing = total - sum;
        // System.out.println("Missing number is: " + missing);
        // int n = 1234, sum = 0,count=0;
        // while (n != 0) {
        //     sum += n % 10;
        //     count++;
        //     n /= 10;
        // }
        // System.out.println("Sum = " + sum);
        // System.out.println(count);
    
    // int n=5;
    // int a = 0, b = 1;
    // for (int i = 1; i <= n; i++) {
    //     System.out.print(a + " ");
    //     int sum = a + b;
    //     a = b;
    //     b = sum;
        // System.out.println(b);
//         if (n == 0) return 1;
//     return n * factorial(n - 1);
// //         int num = 1234, rev = 0;
// while (num != 0) {
//     rev = rev * 10 + num % 10;
//     num /= 10;
// }
// System.out.println("Reversed: " + rev);
// int a = 5;
// System.out.println(++a + a++);
    }
   
}

