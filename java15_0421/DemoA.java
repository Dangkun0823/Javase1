package java15_0419;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoA {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println(a + "是闰年");
        } else {
            System.out.println(a + "不是闰年");
        }
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("请输入一个整数a：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a > 0) {
            if (a % 2 == 1) {
                count++;
            }
            a /= 2;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("请输入两个正整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        int a = 1;
        double sum = 0;
        int tmp = 1;
        for (a = 1; a < 101; a++) {
            sum += 1.0 / a * tmp;  //注意进制转换
            tmp *= -1;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toguess = random.nextInt(100);
        while (true) {
            System.out.println("请输入一个数字：");
            int num = scanner.nextInt();
            if (num > toguess)
                System.out.println("高了");
            if (num < toguess)
                System.out.println("低了");
            if (num == toguess) {
                System.out.println("猜对了！");
                break;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //奇数位
        for (int i = 30; i >= 0; i -= 2) {
            if ((num & (1 << i)) != 0) {
                System.out.print("1");
                System.out.print(" ");
            } else {
                System.out.print("0");
                System.out.print(" ");
            }
        }
        System.out.println();

        //偶数位
        for (int i = 31; i >= 0; i -= 2) {
            if ((num & (1 << i)) != 0) {
                System.out.print("1");
                System.out.print(" ");
            } else {
                System.out.print("0");
                System.out.print(" ");
            }
        }
    }

    public static int max2(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }

    public static int max3(int a, int b, int c) {
        if (max2(a, b) > c) {
            return max2(a, b);
        } else
            return c;
    }

    public static void main(String[] args) {
        System.out.println(max2(2, 5));
        System.out.println(max3(3, 7, 1));
    }

    public static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 != 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 1, 3, 6, 5, 4};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

    public static int fac(int n) {
        if (n == 1 || n == 2) {
            return n;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    public static int fib(int n) {
        int pre = 1;
        int cur = 1;
        int next = pre + cur;
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else if (n > 2) {
            for (int i = 3; i < n; i++) {
                pre = cur;
                cur = next;
                next = pre + cur;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int one(int[] array) {
        //把零与数组中的所有元素都按位异或，0^一个元素两次会得到0
        int a = 0;
        for (int x : array) {
            a = a ^ x;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 4, 5, 5};
        System.out.println(one(array));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(7.0, 8.0, 9.0));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static void print(int n) {
        if (n > 10) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        print(1234);
    }

    public static int digitsum(int n) {
        int sum = 0;
        int b = 0;
        if (n != 0) {
            b += n % 10;
            n /= 10;
            sum = b + digitsum(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitsum(1234));
    }

    //    青蛙跳台问题
//    最后一次跳了一级台阶，这类方法共有f(n-1)种；
//    最后一次跳了两级台阶，这类方法共有f(n-2)种。
//    因此，可以得出公式：f(n)=f(n-1)+f(n-2)，类似斐波那契数列
    public static int jump(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return jump(n - 1) + jump(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(jump(4));
    }


}
