package org.example.Patterns;

public class AllScenarios {
    public static void main(String[] args) {
        pattern1(5);

        pattern2(5);

        pattern3(5);

        pattern4(5);

        pattern5(5);

        pattern6(5);

        System.out.println("This is pattern7 :");
        pattern7(5);

        System.out.println("This is pattern8 :");
        pattern8(5);

        pattern9(5);

        pattern10(5);

        pattern11(5);

        pattern12(4);

        pattern13(5);

        pattern14(5);

        pattern15(5);

        pattern16(5);

        pattern17(4);

        pattern18(5);

        pattern19(5);

        pattern20(5);

        pattern21(4);

        pattern22(4);
    }

    private static void pattern22(int num) {
        System.out.println("This is pattern22 :");
        for (int i = 0; i < num * 2 - 1; i++) {
            for (int j = 0; j < num * 2 - 1; j++) {
                System.out.print(num-Math.min(Math.min(i,j),Math.min((2*num-2)-i, (2*num-2)-j))); // distance from edge top down right left
            }
            System.out.println();
        }
    }

    private static void pattern21(int num) {
        System.out.println("This is pattern21 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern20(int num) {
        System.out.println("This is pattern20 :");
        for (int i = num - 1; i >= 0; i--) {
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < (i * 2); j++) {
                System.out.print(" ");
            }
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < (i * 2); j++) {
                System.out.print(" ");
            }
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern19(int num) {
        System.out.println("This is pattern19 :");
        for (int i = 0; i < num; i++) {
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < (i * 2); j++) {
                System.out.print(" ");
            }
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 0; i--) {
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < (i * 2); j++) {
                System.out.print(" ");
            }
            //char
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern18(int num) {
        char[] charArr = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("This is pattern18 :");
        for (int i = num - 1; i >= 0; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }
    }

    private static void pattern17(int num) {
        System.out.println("This is pattern17 :");
        for (int i = 0; i < num; i++) {
            //space
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            //stars
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    private static void pattern16(int num) {
        char[] charArr = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("This is pattern16 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(charArr[i]);
            }
            System.out.println();
        }
    }

    private static void pattern15(int num) {
        char[] charArr = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("This is pattern15 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }
    }

    private static void pattern14(int num) {
        char[] charArr = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("This is pattern14 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }
    }

    private static void pattern13(int num) {
        int count = 1;
        System.out.println("This is pattern13 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    private static void pattern12(int num) {
        System.out.println("This is pattern12 :");
        for (int i = 0; i < num; i++) {
            //num
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            //space
            for (int j = 0; j < (num - i - 1) * 2; j++) {
                System.out.print(" ");
            }
            //num
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern11(int num) {
        System.out.println("This is pattern11 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    private static void pattern10(int num) {
        System.out.println("This is pattern10 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int num) {
        System.out.println("This is pattern9 :");
        pattern7(5);
        pattern8(5);
    }

    private static void pattern8(int num) {
        for (int i = 0; i < num; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < (num - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern7(int num) {
        for (int i = 0; i < num; i++) {
            //space
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern6(int num) {
        System.out.println("This is pattern 6 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int num) {
        System.out.println("This is pattern 5 :");
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int num) {
        System.out.println("This is pattern 4 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int num) {
        System.out.println("This is pattern 3 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int num) {
        System.out.println("This is pattern 2 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern1(int num) {
        System.out.println("This is pattern 1 :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
