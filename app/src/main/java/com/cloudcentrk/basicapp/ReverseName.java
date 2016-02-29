package com.cloudcentrk.basicapp;

/**
 * Created by Packard Bell on 2016-02-15.
 */
public class ReverseName {


    public static String reversString( String q)
    {
        String tempStr;
        StringBuilder Str = new StringBuilder(q);

        Str.reverse();
        return Str.toString();
        //return  "gjjh" ;

    }



}
