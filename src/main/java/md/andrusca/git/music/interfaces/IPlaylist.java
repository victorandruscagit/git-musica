package md.andrusca.git.music.interfaces;

/*
 Все действия и свойства объектов прописываем согласно условию задачи (часто называют "ТЗ" - техническое задание)

 На все главные объекты, которые реализуют функционал - нужно создавать интерфейсы (кроме объектов-утилит, объектов-контейнеров и пр.)

 С первого раза на 100% не нужно описывать интерфейс, только основные моменты (например, названия свойств и методов пока без параметров и возвращаемого типа - чтобы увидеть общую картину), затем по ходу разработки - корректировать (добавлять параметры и пр.)
 Ошибка многих новичков - пытаются сразу сделать правильный, идеальный интерфейс (не всегда получается), но потом не исправляют по ходу создания проекта и работают до конца с этим неверным вариантом
 Практически не бывает ситуаций, когда интерфейс описан идеально с первого раза - поэтому в начале создаем черновой вариант, потом постепенно дорабатываем

*/


import java.util.ArrayList;

public interface IPlaylist {



    ArrayList<ISong> getSongList();

    void addSong(ISong song);
    void playSongs();
}
