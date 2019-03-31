package javaReadExcel02Ali_easyexcel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class EasyExcelReadTest {

    @Test
    public void simpleReadListStringV2007() throws IOException {
        InputStream inputStream = getResourcesFileInputStream("2007.xlsx");
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 0));
        inputStream.close();
        print(data);
    }

    public static InputStream getResourcesFileInputStream(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = getResourcesFileInputStream("2007.xlsx");
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 0));
        inputStream.close();
        print(data);
    }


}
