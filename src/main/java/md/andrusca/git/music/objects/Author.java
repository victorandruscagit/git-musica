package md.andrusca.git.music.objects;


// можно использовать обычный класс (без интерфейса) - часто называют POJO (Plain Old Java Object) - по смыслу является просто контейнером данных

public class Author {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
