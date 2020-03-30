package java15_0320;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //1.创建Map实例，泛型参数有两个，第一个参数是key的类型，第二个参数是value的类型
        //key value这种结构是为了跟据key找到对应的value
        Map<String, String> map = new HashMap<>();
        //2.使用size获取到元素个数（键值对个数）
        System.out.println(map.size());
        //3.使用isEmpty查看是否为空
        System.out.println(map.isEmpty());
        //4.使用put方法把一些键值对存放进去
        map.put("及时雨", "宋江");
        map.put("玉麒麟", "卢俊义");
        map.put("智多星", "吴用");
        map.put("入云龙", "公孙胜");
        map.put("及时雨","songjiang");
        //如果两个key值重复，后者value就会覆盖前者
        //5.使用get方法跟据key来查找对应的value,如果key不存在，返回null
        // getOrDefault如果key不存在，返回默认值
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("玉麒麟"));
        System.out.println(map.get("大刀"));
        System.out.println(map.getOrDefault("行者", "武松"));
        //6.通过containsKey和containsValue判断某个值是否存在
        //containsKey执行效率高，containsValue执行效率低，不推荐
        System.out.println(map.containsKey("智多星"));
        System.out.println(map.containsValue("公孙胜"));

        //7.foreach遍历Map中所有的键值对
        // Entry：表示一个"条目"，也就是一个键值对
        // map.entrySet获取到所有的键值对
        //Map中的元素和插入顺序无关，取决于具体的实现方式
        for (Map.Entry<String, String> x : map.entrySet()) {
                System.out.println(x.getKey() + ": " + x.getValue());
        }
        map.remove("入云龙");
        System.out.println("删除元素后：");
        for (Map.Entry<String, String> x: map.entrySet()) {
                System.out.println(x.getKey() + ": " + x.getValue());
        }
        System.out.println(map);
        //也可以直接输出map
    }
}

