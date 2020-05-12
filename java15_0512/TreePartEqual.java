package java15_0512;

//将一个数组分成和相等的三部分(从前往后,每一部分的元素个数不限)
public class TreePartEqual {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int curSum = 0, cnt = 0;

        //A.length-1是为了保证有第三段
        for (int i = 0; i < A.length-1; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                if (cnt == 2) {
                    return true;
                }
                curSum = 0;
            }
        }
        return false;
    }
}
