package com.factory.example1;

public class WebsiteFactory {

    public static Website getSite(String type) {
        switch (type.toLowerCase()) {
            case "shop":
                return new Shop();
            case "blog":
                return new Blog();
            default:
                return null;
        }
    }

}
