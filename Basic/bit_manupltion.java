import java.util.*;

public class bit_manupltion {
    int getBit(int n, int pos) {
        int bit_mask = 1 << pos;
        return ((n & bit_mask) != 0) ? 1 : 0;
    }
    int setBit(int n, int pos){
        int bit_mask = 1 << pos;
        return ( n | bit_mask);
    }
    int clearBit(int n, int pos){
        int bit_mask = ~(1 << pos);
        return (n & bit_mask);
    }
    int updateBit(int n, int pos, int val){
        int num = clearBit(n, pos);
        int bit_mask = val << pos;
        return ( n | bit_mask);
    }

    public static void main(String[] args) {
        bit_manupltion obj = new bit_manupltion();
        int n = 8; //1000
        int i = 2;
System.out.println("By get ,Position of " + i + " is " + obj.getBit(n, i));
System.out.println("By set, New Bit is " + obj.setBit(n, i));
System.out.println("By clear, New bit is " + obj.clearBit(n, i));
System.out.println("By update, New bit is " + obj.updateBit(n, i,1));
    }
}
