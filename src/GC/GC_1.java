package GC;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GC_1 {

    static final int _512KB=512*1024;
    static final int _1MB=1024*1024;
    static final int _6MB=6*1024*1024;
    static final int _7MB=7*1024*1024;
    static final int _8MB=8*1024*1024;

    // -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    public static void main(String[] args){
        ArrayList<byte[]> list = new ArrayList<>();
        list.add(new byte[_8MB]);
//        list.add(new byte[_1MB]);
//        list.add(new byte[_512KB]);
//        list.add(new byte[_512KB]);


    }
}
