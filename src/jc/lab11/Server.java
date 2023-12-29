package jc.lab11;

import java.lang.reflect.Field;
import java.util.Random;

class Server {
    private String name;
    @JsonIgnore
    private boolean isRunning;

    public Server(String name) {
        this.name = name;
        this.isRunning = false;
    }

    //Метод імітації серіалізації
    public void serialize() {
        Field[] fields = Server.class.getDeclaredFields();

        for (Field field : fields) {
            // Ігноруємо поле, яке позначено анотацією @JsonIgnore
            if (field.isAnnotationPresent(JsonIgnore.class)) {
                continue;
            }

            // Зробити поле доступним для читання, навіть якщо воно private
            field.setAccessible(true);

            try {
                // Отримати значення поля
                Object value = field.get(this);

                // Вивести ім'я та значення поля в консоль
                System.out.println("Поле: " + field.getName() + ", Значення: " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    //Метод для запуску сервера
    @Retryable(maxRetries = 5)
    public void startServer() {
        System.out.println("Сервер '" + name + "' запускається...");
        //Логіка запуску сервера (штучна помилка для ілюстрації)
        if (new Random().nextBoolean()) {
            throw new RuntimeException("Помилка при запуску сервера");
        }
        isRunning = true;
        System.out.println("Сервер '" + name + "' успішно запущено.");
    }

    //Метод для отримання статусу сервера
    public boolean isRunning() {
        return isRunning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}