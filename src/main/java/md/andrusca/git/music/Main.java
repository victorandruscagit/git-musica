package md.andrusca.git.music;

import md.andrusca.git.music.objects.Author;
import md.andrusca.git.music.objects.Playlist;
import md.andrusca.git.music.objects.Song;

public class Main {
    public static void main(String[] args) {
        // список авторов
        Author author1 = new Author("Чайковский debile");
        Author author2 = new Author("Вивальди");
        Author author3 = new Author("Киркоров");
        Author author4 = new Author("Sting");
        Author author5 = new Author("Queen");


        // список песен с авторами
        Song song1 = new Song("Ceaikovskiiiiiiiii blaha muha", author1);
        Song song2 = new Song("Vivalid", author1);
        Song song3 = new Song("Времена года", author2);
        Song song4 = new Song("Цвет настроения синий", author3);
        Song song5 = new Song("Shape of My Heart", author4);
        Song song6 = new Song("Show must go on", author5);
        Song song7 = new Song("Show must go on", author5);
        Song song8 = new Song("We will rodddddck you", author5);
        Song song9 = new Song("We willsad rodddck you", author5);
        Song song10 = new Song("We will rodddasdfsadck you", author5);


        // заполняем плейлист
        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song6);//removees settter
        playlist.addSong(song7);
        playlist.addSong(song7);
        playlist.addSong(song8);
        playlist.addSong(song9);
        playlist.addSong(song10);

        playlist.addSong(song1);
        playlist.addSong(song7);// пытаемся добавить уже существующую песню (должно выйти сообщение, что нельзя добавить)
        playlist.addSong(song7);// пытаемся добавить уже существующую песню (должно выйти сообщение, что нельзя добавить)

        // проиграть все песни
        playlist.playSongs();
    }
}
