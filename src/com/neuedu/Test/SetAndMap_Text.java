package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetAndMap_Text {
    public static void main(String[] args) {
        char [] str ={'0','1','2','x','y','0'};
        for(int k=0;str[k]!='0';k++){
            System.out.println(str[k]);
        }
        Set <Integer> set =new HashSet<>();//<数据类型(包装类)> 代表泛型，规范数据类型
        set.add(1);//set中如果有重复的内容会进行覆盖  list方法可以允许重复的对象，而set方法不允许重复对象
        set.add(2);// list是一个有序的容器，保持了每个元素的插入顺序。即输出顺序就是输入顺序，而set方法是无序容器，无法保证每个元素的存储顺序，TreeSet可保证有序并且不重复
        set.add(3);
        set.add(2);
        for(Object obj:set){
            System.out.println(obj);//Set没有get方法，只能用增强for遍历
        }
        Map <String,String> map =new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("002","王六");
        Set <String> keys=map.keySet();
        for(String key:keys){
            System.out.println(map.get(key));
        }


    }
}
