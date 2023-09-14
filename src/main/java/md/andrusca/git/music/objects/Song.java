package md.andrusca.git.music.objects;


import md.andrusca.git.music.interfaces.ISong;


// песня
public class Song implements ISong {

    private String name; // название песни
    private Author author; // автор песни (ссылка на объект)

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("pIesa: " + name + ", autor: " + author.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}
