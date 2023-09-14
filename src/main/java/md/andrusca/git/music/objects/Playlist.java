package md.andrusca.git.music.objects;


import md.andrusca.git.music.interfaces.IPlaylist;
import md.andrusca.git.music.interfaces.ISong;

import java.util.ArrayList;

// плейлист
public class Playlist implements IPlaylist {

    private ArrayList<ISong> songList = new ArrayList<>(); // сразу создаем пустую коллекцию для хранения песен


    @Override
    public void addSong(ISong song) {
        if (songList.contains(song)) { // если коллекция уже содержит эту песню (этот объект)
            System.out.println("Песня " + song.getName() + " уже была добавлена ранее.");
            return; // выходим из метода и не добавляем песню
        }

        songList.add(song);
    }

    @Override
    public void playSongs() {
        // проигрываем все песни (перебор объектов в цикле)
        for (ISong song : songList) {
            song.play(); // проиграть песню
        }
    }

    @Override
    public ArrayList<ISong> getSongList() {
        return songList;
    }



    public void setSongList(ArrayList<ISong> songList) {
        this.songList = songList;
    }
}
