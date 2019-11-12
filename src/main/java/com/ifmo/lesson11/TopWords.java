package com.ifmo.lesson11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWords {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File("C:\\Users\\young\\Documents\\ITMO-Sber\\ifmo\\src\\main\\resources\\wap.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

        System.out.println(top10Words(words));
        System.out.println(top10Phrases(words));
        System.out.println(charactersFrequency(words));
    }

    public static Map<String, Integer> top10Words(List<String> words) {
        // todo implement
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            Integer cnt = map.get(word);
            if(cnt == null) {
                map.put(word, 1);
            } else {
                map.put(word, cnt + 1);
            }
        }
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry);

                if (i > 10)
                    break;

                i++;
        }

        return Map.of();
    }

    public static Map<String, Integer> top10Phrases(List<String> words) {
        // todo implement
        return Map.of();
    }

    public static Map<Character, Integer> charactersFrequency(List<String> words) {
        // todo implement
        return Map.of();
    }
}
