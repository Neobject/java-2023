package jc.lab11;

public class Main {
    public static void main(String[] args) {
        Server server = new Server("допоміжний");

        //Спроби запустити сервер
        try {
            int retries = Server.class.getMethod("startServer").getAnnotation(Retryable.class).maxRetries(); //Повторні спроби

            while (!server.isRunning() && retries > 0) {
                try {
                    server.startServer();
                } catch (Exception e) {
                    System.out.println("Помилка при запуску сервера: " + e.getMessage());
                }
            }
        } catch (Exception e) {};

        server.serialize(); //Імітація серіалізація сервера
    }
}