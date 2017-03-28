package com.example.ilya.githubapi;

/**
 * Created by ilya on 3/28/17.
 */

public class RepoInfo {
    private int id;
    private String name;
    private String full_name;
    private String html_url;

    @Override
    public String toString(){
        return "Id : " + id + "\\n" + "Name :  " + name + "\\n" + "Full Name: " + full_name + "\\n" + "Html_url : " + html_url;
    }
}
