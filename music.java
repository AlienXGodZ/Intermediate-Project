class music{
    String songname;
    String artist;
    String duration;

    music(String songname,String artist,String duration){

        this.songname = songname;
        this.artist = artist;
        this.duration = duration;

    }

    public String toString(){

        return "SONG NAME: " + songname + "|SONG ARTIST: " + artist + "|SONG DURATION: " + duration;

    }
}