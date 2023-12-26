package hw3.dto.Predator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TigerBreeds {
    SIBERIAN_TIGER,
    BENGAL_TIGER,
    INDOCHINESE_TIGER,
    MALAYAN_TIGER,
    SUMATRAN_TIGER,
    CASPIAN_TIGER,
    BALI_TIGER,
    JAPAN_TIGER;

    private static final List<TigerBreeds> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TigerBreeds randomBreed() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
