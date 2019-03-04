package cn.zciel.designPatterns.moocdesignpatterns.structural.composite;

/**
 * @author YINZHEN
 * @date 2019/3/4 17:25
 * @Description
 */
public class Test {
    public static void main(String[] args) {

        CatalogComponent linuxCourse = new Course("linux课程", 11);
        CatalogComponent windowsCourse = new Course("windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("网课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
