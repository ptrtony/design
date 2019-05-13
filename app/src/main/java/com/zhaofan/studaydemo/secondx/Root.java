package com.zhaofan.studaydemo.secondx;

import java.util.ArrayList;

/**
 * @author ChengJingQiang
 * @copyright:2019
 * @project Wepay
 * @date 2019/4/15
 * description:
 */
public class Root implements IRoot {
    private ArrayList subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;
    public Root(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String getInfo() {
        String info = "";
        info = "名称："+this.name;
        info = info +"\t职位:"+this.position;
        info = info +"\t薪水："+this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
