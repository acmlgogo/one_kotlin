package com.storm.cftest.uitls;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class HtmlFmtUtil {

    public static String fmt(String str) {
        //用正则将img的style置为空
        Pattern pattern = Pattern.compile("style=\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll("");

        return "<html>" +
                "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>Sign in | Score System</title>" +
                "<style type=\"text/css\">\n" +
                "img{margin-top:15px;margin-bottom:15px; width:90%;height:auto}" +
                "body{display:flex;flex-direction:column;justify-content:center;}" +
                "</style>" +
                "</head>" +
                "<body>" +
                str +
                "</body>" +
                "</html>";
    }
}
