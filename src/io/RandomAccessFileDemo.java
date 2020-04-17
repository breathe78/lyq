package io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * Created by lyq on 2019/9/16.
 */
public class RandomAccessFileDemo {
//    public static void main(String[] args) throws Exception {
//        String s = "中";
//        byte[] gbk = s.getBytes("gbk");
//        System.out.println(gbk.length);
//        System.out.println(gbk);
//        char[] chars = {'中', '国'};
//        System.out.println(chars);
//    }

    //转换char
//    private static char[] getChars (byte[] bytes) {
//        Charset cs = Charset.forName ("gbk");
//        ByteBuffer bb = ByteBuffer.allocate (bytes.length);
//        bb.put (bytes);
//        bb.flip ();
//        CharBuffer cb = cs.decode (bb);
//
//        return cb.array();
//    }
    //转换byte
//    private static byte[] getBytes (char[] chars) {
//        Charset cs = Charset.forName ("UTF-8");
//        CharBuffer cb = CharBuffer.allocate (chars.length);
//        cb.put (chars);
//        cb.flip ();
//        ByteBuffer bb = cs.encode (cb);
//
//        return bb.array();
//    }
}
