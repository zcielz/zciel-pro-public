package cn.zciel.moocdesignpatterns.structural.adapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 13:49
 * @Description
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器
        int adapterOupt = adapterInput / 44;
        System.out.println("使用PowerAdapter输入:" + adapterInput + "V" + "输出DC:" + adapterOupt + "V");
        return adapterOupt;
    }
}
