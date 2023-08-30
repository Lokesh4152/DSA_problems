// Problem Description
// Given a number represented as an array of digits, increment the number by 1, and return the resulting sum as an array.

// Input format
// There are two lines of input.

// First line will contain a single integer N .

// Next line will contain N space separated integers for Array A.

// Output format
// Single integer which will be the incremented number.

// Sample Input 1
// 3

// 1 1 1

// Sample Output 1
// 112

// Explanation
// 111 + 1 = 112

// Constraints
// 0<=Ai<10

// Most significant value will be non-zero in the array.

// 1<=N<=5000


import java.util.*;


class IncrementNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }
        
    }

    static int[] incrementNumber(int n, int arr[]){
      // int sum =0; int carry =1;
    //    ArrayList<Integer> result = new ArrayList<Integer>();
    //    for(int i=n-1; i>=0;i--){
    //        sum = arr[i] + carry;
    //        if(sum > 9){
    //            carry = sum / 10;
    //            sum = sum % 10;
    //        }else{
    //            carry=0;
    //        }
    //        result.add(sum);
    //    }
    //    if(carry !=0){
    //        result.add(carry);
    //    }
    //    Collections.reverse(result);
    //    int incrementArray[] = new int[result.size()];
    //    for(int i=0; i<result.size(); i++){
    //        incrementArray[i] = result.get(i);
    //    }
    //    return incrementArray;


//  ======================OR===========================
     for(int i = n-1; i >=0; i--){
         if(arr[i] < 9){
             arr[i]++;
             return arr;
         }else{
             arr[i]=0;
         }
     }
      int newArr[]= new int[n+1];
      newArr[0]=1;
      return newArr;
    }
}

