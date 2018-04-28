package com.designpatterns.demo.singleton.java;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式 使用容器实现单例模式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/27 上午9:52
 * @project_name DesignPatternsDemo
 */
public class ContainerSingleton {
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    public static void registerService(String key, Object instance) {
        if (objMap.containsKey(key)) {
            //  添加单例模式
            objMap.put(key, instance);
        }

    }

    //   获取单例
    public static Object getService(String key) {
        return objMap.get(key);
    }
}
