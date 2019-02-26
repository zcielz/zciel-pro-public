package cn.zciel.chapter09;

import java.io.*;

/**
 * @author YINZHEN
 * @date 2019/2/25 19:46
 * @Description 使用try-with-resources语句替代try-finally语句
 */
public class Demo01 {

    public static final int BUFFER_SIZE = 1024;

    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
