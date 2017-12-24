package Model;

import java.util.ArrayList;

/**
 * Created by kushalgupta on 23/12/17.
 */

public class Contents {

private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public static ArrayList<Contents> getContentsList() {
        ArrayList<Contents> contentList = new ArrayList<>();

        String[] con=getlist();

        for(int i=0;i<con.length;i++){
            Contents contents=new Contents();

            contents.setTopic(con[i]);

            contentList.add(contents);

        }


return contentList;
    }


    private static String[] getlist(){

    String[] con={"intent","recycler","typeface"};
return con;
}}