package com.zhaofan.studaydemo.observal;

/**
 * @author ChengJingQiang
 * @copyright:2019
 * @project Wepay
 * @date 2019/4/15
 * description:
 */
public class LiSi implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }


    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板!韩非子有活动----->" +reportContext);
    }
}
