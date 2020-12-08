import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder history = new StringBuilder();

        File games = new File("Games");
        if (games.mkdir()) {
            history.append("Директория 'Games' создана");
            System.out.println("Директория 'Games' создана");
        }

        File src = new File("Games//src");
        if (src.mkdir()) {
            history.append("Директория 'src' создана");
            System.out.println("Директория 'src' создана");
        }

        File res = new File("Games//res");
        if (res.mkdir()) {
            history.append("Директория 'res' создана");
            System.out.println("Директория 'res' создана");
        }
        File savegames = new File("Games//savegames");
        if (savegames.mkdir()) {
            history.append("Директория 'savegames' создана");
            System.out.println("Директория 'savegames' создана");
        }

        File temp = new File("Games//temp");
        if (temp.mkdir()) {
            history.append("Директория 'temp' создана");
            System.out.println("Директория 'temp' создана");
        }

        File main = new File("Games//src//main");
        if (main.mkdir()) {
            history.append("Директория 'main' создана");
            System.out.println("Директория 'main' создана");
        }

        File test = new File("Games//src//test");
        if (test.mkdir()) {
            history.append("Директория 'test' создана");
            System.out.println("Директория 'test' создана");
        }

        File drawables = new File("Games//res//drawables");
        if (drawables.mkdir()) {
            history.append("Директория 'drawables' создана");
            System.out.println("Директория 'drawables' создана");
        }

        File vectors = new File("Games//res//vectors");
        if (vectors.mkdir()) {
            history.append("Директория 'vectors' создана");
            System.out.println("Директория 'vectors' создана");
        }

        File icons = new File("Games//res//icons");
        if (icons.mkdir()) {
            history.append("Директория 'icons' создана");
            System.out.println("Директория 'icons' создана");
        }

        File tempTXT = new File("Games//temp//temp.txt");

        try {
            if (tempTXT.createNewFile()) {
                history.append("Файл 'temp.txt' создан");
                history.toString();
                System.out.println("Файл 'temp.txt' создан\nВсе файлы созданы успешно");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(tempTXT, false)) {
            writer.append(history);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
