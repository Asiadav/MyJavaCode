package com.company;

import java.awt.*;
import java.net.URI;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception{
        // Make a program in which an input via command line or speech to text plays a youtube video found by such a command
        // For example: Input "Alexa, play Despacito" and it will search Youtube and play the video for that song

        String videoToPlay = "";
        String url = "";
        Scanner input = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("What should I play? ");

                String command = input.nextLine();

                command = command.substring(command.indexOf("play "));

                command = command.replace(" ", "+");

                url = "https://www.youtube.com/results?search_query=" + command;

                break;

            } catch (Exception exception) {
                System.out.println("That is not a valid input\n");
            }
        }

        Document doc = Jsoup.connect(url).get();

        Elements links = doc.select("a[href]");

        for(Element link: links){
            if(link.attr("abs:href").contains("watch")){
                videoToPlay = link.attr("abs:href");
                break;
            }
        }

        //System.out.println(videoToPlay);

        Desktop desktop = Desktop.getDesktop();

        URI theLink = URI.create(videoToPlay);

        desktop.browse(theLink);

    }
}
