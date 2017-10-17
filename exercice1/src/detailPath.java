import java.util.Scanner;
import service.PathEvaluator;

public class DetailPath {

    private static PathEvaluator PathEvaluator = new PathEvaluator();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Rentrez un chemin d'accès");
        String path = scanner.nextLine();

        PathEvaluator.pathExist(path);
        PathEvaluator.pathType(path);
    }
}