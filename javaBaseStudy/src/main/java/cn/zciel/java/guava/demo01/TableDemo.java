package cn.zciel.java.guava.demo01;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

/**
 * @author zciel
 * @date 2019/3/31 13:51
 * @Description Table它有两个支持所有类型的键：”行”和”列”。
 */
@Slf4j
public class TableDemo {

    public static void main(String[] args) {
        //记录学生在某门课上的成绩
        Table<String, String, Integer> table = HashBasedTable.create();
        table.put("jack", "jack", 100);
        table.put("jack", "c", 80);
        table.put("mike", "java", 93);
        table.put("mike", "c", 100);
        Set<Table.Cell<String, String, Integer>> cells = table.cellSet();
        for (Table.Cell<String, String, Integer> cell : cells) {
            log.info(cell.getRowKey() + " " + cell.getColumnKey() + " " + cell.getValue());
        }
        log.info(String.valueOf(table.row("jack")));
        log.info(String.valueOf(table));
        log.info(String.valueOf(table.rowKeySet()));
        log.info(String.valueOf(table.columnKeySet()));
        log.info(String.valueOf(table.values()));
    }
}
