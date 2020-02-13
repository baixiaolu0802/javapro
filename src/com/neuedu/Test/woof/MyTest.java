package com.neuedu.Test.woof;

import java.util.*;

/**
 * Created by 13930 on 2020/2/13.
 */
public class MyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输出游戏人数");
        //接收人数
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("不符合游戏人数");
        }else {
            List<String> all = new ArrayList<>();//发牌列表
            List<String> play = new ArrayList<>();//发完牌开玩的列表
            List<String> bottom = new ArrayList<>();//底牌列表
            init(all);
            Change_init(all,player);
            //盗贼必须在play列表里 所以把all中盗贼搞出来 放到play里面 其他再随机分配到底牌
            all.remove("盗贼");
            play.add("盗贼");
            buttom_paper(all,bottom);
            //放完底牌将总牌放入游戏牌
            play.addAll(all);
            //打乱游戏牌排序
            Collections.shuffle(play);
            System.out.println("手牌:"+play);
            System.out.println("底牌:"+bottom);
        }

    }

    //12个人初始化
    public static void init(List<String> list){
        for (int i = 0;i < 4;i++){
            list.add("狼人");
        }
        for (int i = 0;i < 4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }

    //根据人数调整
    public static void Change_init(List<String> list, int player){
        if (player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("吹笛者");

    }

    //底牌设置：从移出盗贼牌的总牌中选3张
    public static void buttom_paper(List<String> list,List<String> bottom){
        //底牌中狼人小于等于1
        while(bottom.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if (bottom.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                bottom.add(list.remove(index));
        }
    }
}
