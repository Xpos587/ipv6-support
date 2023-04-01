package com.example.accesskeybackend.IPv6Checker;

import java.net.InetAddress;
import java.net.Inet6Address;

import java.net.UnknownHostException;

// не рабочая хуйня
// вместе с гугловскими dns серверами тоже не работает
public class IPv6 {
    public static boolean isSupport(String siteUrl) {
//        System.out.println(siteUrl);
        try {
            InetAddress[] addresses = InetAddress.getAllByName(siteUrl);
            for (InetAddress address : addresses) {
//                System.out.println(address);
//                System.out.println(siteUrl);
//                System.out.println(address.getClass());
                if (address instanceof Inet6Address) return true;
            }
        } catch (UnknownHostException err) {
            err.printStackTrace();
            return false;
        }
        return false;
    }
}