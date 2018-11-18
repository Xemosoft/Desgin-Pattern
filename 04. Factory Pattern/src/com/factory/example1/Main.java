package com.factory.example1;

public class Main {

    public static void main(String[] args) {


        Website site = WebsiteFactory.getSite("blog");
        System.out.println(site.getPages());


        Website shop = WebsiteFactory.getSite("shop");
        System.out.println(shop.getPages());


    }

}
