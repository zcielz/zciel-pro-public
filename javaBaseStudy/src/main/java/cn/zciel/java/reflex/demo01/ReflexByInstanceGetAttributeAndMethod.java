package cn.zciel.java.reflex.demo01;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author YINZHEN
 * @date 2019/3/19 16:09
 * @Description java通过实例获得到实例类中的属性和方法
 */
@Slf4j
public class ReflexByInstanceGetAttributeAndMethod {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Student student = new Student();

        student.setBirthdya(new Date());
        student.setGender(false);
        student.setId(3);
        student.setName("xiaobai");
        student.setScore(99);

        //通过实体得到类
        @SuppressWarnings("rawtypes")
        Class studentClass = (Class) student.getClass();

        //得到类中所有的属性
        Field[] field = studentClass.getDeclaredFields();

        for (int i = 0; i < field.length; i++) {
            Field f = field[i];
            int size = field.length; //属性个数
            f.setAccessible(true);  //设置些属性时可以访问的

            String type = f.getType().toString(); //得到此属性的类型
            String key = f.getName(); //key：得到属性名
            Object value = null; //得到此属性的值
            value = f.get(student);

            log.info("属性的个数" + size + "\t类型:" + type + "\t属性名:" + key + "\t属性值:" + value);

            if (key.endsWith("name")) {
                f.set(student, "张三");//给属性设置值
            }
            //后面就不写了
        }

        /**
         * 得到类中所有的方法集合
         */
        Method[] methods = studentClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            if (method.getName().startsWith("get")) {
                log.info("类中get方法:" + method.getName() + "\t");
                log.info("get方法的值:" + method.invoke(student));
            }
        }
    }
}
