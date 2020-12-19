package subway;

import subway.controller.MenuScanner;
import subway.view.InputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        InputView inputView = new InputView(scanner);
        MenuScanner menuController = new MenuScanner();
        menuController.scanMainMenu(inputView);
    }
}
