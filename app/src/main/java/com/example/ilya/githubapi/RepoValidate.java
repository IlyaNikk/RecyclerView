package com.example.ilya.githubapi;

import java.util.List;

/**
 * Created by ilya on 3/28/17.
 */

public class RepoValidate {

//    private List<RepoInfo> info;
//
//    @Override
//    public String toString(){
//        StringBuilder result = new StringBuilder();
//        for(RepoInfo inormation: info){
//            result.append(inormation.toString());
//        }
//        return result.toString();
//    }

    private int id;
    private String name;
    private String full_name;
    private String html_url;

    @Override
    public String toString(){
        return "Id : " + id + "\n" + "Name :  " + name + "\n" + "Full Name: " + full_name + "\n" + "Html_url : " + html_url + "" +
                "\n\n\n";
    }
}
