package CODEWARS.Kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Song {
    private String title;
    private String artist;
    private List<String> allListeners = new ArrayList<>();
//    private static int sum;
    public Song(String title, String artist) { this.title = title; this.artist = artist; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }

    public int howMany(ArrayList<String> arrayList) {
        int sum = allListeners.size();
        allListeners.addAll(arrayList);
        allListeners = allListeners.stream().map(String::toLowerCase).distinct().collect(Collectors.toList());
        System.out.println(allListeners.size() - sum);
        return allListeners.size() - sum;
    }
}

public class WhatAClassySong {
    public static void main(String[] args) {
        Song mountMoose = new Song("Mount Moose", "The Snazzy Moose");

// day 1 (or test 1)
//        mountMoose.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "BOb", "carl", "RyAn"))); // 5
// These are all new since they are the first listeners.

// day 2
//        mountMoose.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))); // 2
// Luke and Amanda are new, john already listened to it the previous day

        mountMoose.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))); //5
        mountMoose.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))); //2
        mountMoose.howMany(new ArrayList<String>(Arrays.asList("Amanda", "CalEb", "CarL", "Furgus"))); //2
        mountMoose.howMany(new ArrayList<String>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))); //1
        mountMoose.howMany(new ArrayList<String>(Arrays.asList("Jack", "jacK"))); //1
        mountMoose.howMany(new ArrayList<String>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE", "Jack", "jacK"))); //0
    }
}
