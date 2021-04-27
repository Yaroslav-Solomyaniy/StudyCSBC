package Ex_5;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Song> myPlayer = new HashSet<Song>();
        Scanner sc = new Scanner(System.in);
        boolean point = true;
        while (point = true)
        {
            System.out.println("========== ПЛЕЙЛИСТ =============\n" +
                    "1.Добавити пісню\n" +
                    "2.Видалити пісню\n" +
                    "3.Розмір плейлисту\n" +
                    "4.Очистка плейлисту\n" +
                    "5.Вивід плейлисту\n" +
                    "6.Тривалість відтворення плейлисту\n" +
                    "7. Вихід");
            int cmd = sc.nextInt();
            switch (cmd)
            {
                case 1:{
                    System.out.print("Введіть назву пісні:");
                    String newName = sc.useDelimiter("\n").next();
                    System.out.print("Введіть автора пісні:");
                    String newAuthor = sc.useDelimiter("\n").next();
                    System.out.print("Введіть альбом пісні:");
                    String newAlbum = sc.useDelimiter("\n").next();
                    System.out.print("Введіть тривалість пісні(Наприклад '2,45'):");
                    double newDuration = sc.nextDouble();
                    myPlayer.add(new Song(newName,newAuthor,newAlbum,newDuration));
                    break;
                }
                case 2:{
                    System.out.println("Введіть назву пісні для видалення:");
                    String newName = sc.useDelimiter("\n").next();
                    for (Song song : myPlayer) {
                        if (newName.equals(song.name))
                        {
                            myPlayer.remove(song);
                            System.out.println("Пісню з назвою: | "+song.getName()+ " | Успішно видалено!");
                        }
                        else
                            {
                                System.out.println("Пісню з таким іменем не знайдено в плейлисті!");
                            }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Розмір плейлисту: " + myPlayer.size());
                    break;
                }
                case 4:{
                    myPlayer.clear();
                    System.out.println("Плейлист очищено.");
                    break;
                }
                case 5:{
                    if(myPlayer.isEmpty())
                    {
                        System.out.println("Плейлист пустий!");}
                    else {
                        for (Song s : myPlayer) {
                            System.out.println("| Назва: " + s.getName() + "| Aвтор: " + s.getAuthor() + "| Альбом: " + s.getAlbum() + "| Тривалість: " + s.getDuration());
                        }
                        break;
                    }
                }
                case 6:{
                    double time = 0;
                    for (Song s : myPlayer)
                    {
                        time += s.getDuration();
                    }
                    time = Math.round(time*100)/100D;
                    String str = String.format("Повна тривалість відтворення плейлисту: " + time + " Минут.");
                    System.out.println(str);
                    break;
                }
                case 7:{
                    System.out.println("Виконується вихід з програми.");
                    point = false;
                    printTimeStamp();
                    break;
                }
            }
        }
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
