package Recursion;

public class findMax {

    private static int curMax = -1;  // biến static
    private static void findMax1 (int arr [],int i){

        if (i<arr.length){
              if (arr[i] > curMax){
                   curMax = arr[i];
              }
           findMax1(arr,i+1);
         }
    }

    private static int findMax2 (int arr[], int i, int preMax){
//         Each time, compare 2 value of arr[i] and previous max found before to find new max
        if (i<arr.length) {
            int curMax = Math.max(preMax, arr[i]);
                 return findMax2 (arr,i+1,curMax);
/**            giá trị của method luôn được sử dungj ở đâu đó
            tại sao phải trả về findMax2 ở đây mà không phải là findMax2 không thôi
          Mọi trường hơp đều phải có giá trị trả về (return value) vì nếu không trả về (return)
                         findMax2(arr, i + 1, curMax);
 thì biến return sẽ không được cập nhật (preMax trong trường hợp này) mà sẽ vẫn giữ nguyên là -1
   Mỗi lần thực hiện recursive call mà không có return thì hàm recursion đó (được gọi) sẽ không trả về giá trị
    cái mà ta cần để cập nhật biến preMax
 **/

        }
        return preMax;
    }

    public static void main(String[] args) {
        int arr[] = {9,3,8,4,7,1,23,6};
/**        int curMax = 7;       trond method thì không được dùng access modifier (public, private,...)
//        2 biến curMax khác nhau một là biến local một là biến được lưu ở 2 vùng nhớ khác nhau
 **/
//        findMax1(arr,0);
//        System.out.println(curMax);
        System.out.println(findMax2(arr,0,curMax));

    }
}
