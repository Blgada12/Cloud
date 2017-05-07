package com.example.smart.newgame;

public class song_items {
    public int getSongpic() {
        return songpic;
    }

    public void setSongpic(int songpic) {
        this.songpic = songpic;
    }

    public String getSongnam() {
        return songnam;
    }

    public void setSongnam(String songnam) {
        this.songnam = songnam;
    }

    public song_items(int songpic, String songnam) {

        this.songpic = songpic;
        this.songnam = songnam;
    }

    private int songpic;
    private  String songnam;
}
