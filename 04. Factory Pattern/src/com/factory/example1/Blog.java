package com.factory.example1;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}
