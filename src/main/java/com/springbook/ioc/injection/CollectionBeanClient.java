package com.springbook.ioc.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.*;

public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        CollectionBean bean = factory.getBean("collectionBean", CollectionBean.class);
//        CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

        System.out.println("List injection test");
        // applicationContext로 inject 해주면 ArrayList로 설정됨
        List<String> addressList = bean.getAddressList();
        for (String address : addressList) {
            System.out.println(address);
        }

        System.out.println("\nSet injection test");
        // applicationContext로 inject 해주면 LinkedHashSet으로 설정됨
        Set<String> addressSet = bean.getAddressSet();
        for (String address : addressSet) {
            System.out.println(address);
        }

        System.out.println("\nMap injection test");
        // applicationContext로 inject 해주면 LinkedHashMap으로 설정됨
        Map<String, String> addressMap = bean.getAddressMap();

//        // 출력 방법 1
//        Iterator<String> keys = addressMap.keySet().iterator();
//        while (keys.hasNext()) {
//            String name = keys.next();
//            String address = addressMap.get(name);
//            System.out.println(name + " : " + address);
//        }
//
//        // 출력 방법 2
//        for (Map.Entry<String, String> entry : addressMap.entrySet()) {
//            String name = entry.getKey();
//            String address = entry.getValue();
//            System.out.println(name + " : " + address);
//        }
//
//        // 출력 방법 3
//        for (String name: addressMap.keySet()) {
//            String address = addressMap.get(name);
//            System.out.println(name + " : " + address);
//        }

        // 출력 방법 4
        addressMap.forEach((name, address) -> {
            System.out.println(name + " : " + address);
        });

        System.out.println("\nProperties injection test");
        Properties addressProperties = bean.getAddressProperties();
        addressProperties.forEach((name, address) -> {
            System.out.println(name + " : " + address);
        });

        factory.close();
    }
}
