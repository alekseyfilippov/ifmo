package com.ifmo.lesson11.inner;

import java.util.*;

/**
 * Created by xmitya on 20.10.16.
 */
public class UserGenerator {
    private static final List<String> COMPANIES = Arrays.asList("SpaceX", "Gazprom", "ITMO", "Lukoil", "TSystems");
    private static final List<String> NAMES = Arrays.asList("Bob", "Alice", "Nick", "Ted", "Quentin", "David", "Zack", "Stacy", "Helen", "Julia");

    private static final int MIN_AGE = 21;
    private static final int MAX_AGE = 65;

    private static final int MIN_SALARY = 15_000;
    private static final int MAX_SALARY = 100_000;

    public static List<User> generate(int num) {
        if (num <= 0)
            return Collections.emptyList();

        List<User> users = new ArrayList<>(num);

        Random rnd = new Random();

        for (int i = 0; i < num; i++) {
            users.add(new User(
                    NAMES.get(rnd.nextInt(NAMES.size())),
                    generateInRange(MIN_AGE, MAX_AGE, rnd),
                    round(generateInRange(MIN_SALARY, MAX_SALARY, rnd), 1000),
                    COMPANIES.get(rnd.nextInt(COMPANIES.size()))
            ));
        }

        return users;
    }

    private static int generateInRange(int min, int max, Random rnd) {
        int res = -1;

        while (res < min)
            res = rnd.nextInt(max + 1);

        return res;
    }

    private static int round(int num, int roundTo) {
        return num / roundTo * roundTo;
    }
}