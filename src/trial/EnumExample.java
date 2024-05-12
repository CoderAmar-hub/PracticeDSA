package trial;

import java.util.Arrays;

public class EnumExample {
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {
        SMALL(0), MEDIUM(1), LARGE(2), EXTRALARGE(3);

        private int orderNum;
        Size(int orderNum) {
            this.orderNum = orderNum;
        }

        public int getOrderNum() {
            return orderNum;
        }
    }

    public static void main(String[] args) {
        EnumExample ex = new EnumExample();
        ex.setSize(Size.SMALL);
        System.out.println(Size.SMALL.getOrderNum());
        System.out.println(Size.MEDIUM);
        System.out.println(Arrays.toString(Size.values()));

        String s = "     Amar    ";
        s= s.trim();
        System.out.println("\n" + s);

        Integer i1 = Integer.MAX_VALUE;
        Integer i2 = Integer.MIN_VALUE;

        System.out.println(i1.toString() + i2.toString());
    }
}
