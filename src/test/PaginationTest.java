package test;

import com.company.PaginationHelper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaginationTest {

    @Test
    void testPageCount() {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(2,helper.pageCount());
        assertEquals(6,helper.itemCount());
        assertEquals(4,helper.pageItemCount(0));
        assertEquals(2,helper.pageItemCount(1));
        assertEquals(-1,helper.pageItemCount(2));
    }

    @Test
    void testItemCount() {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(6,helper.itemCount());
    }

    @Test
    void testPageItemCount() {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 2);
        assertEquals(2,helper.pageItemCount(0));
        assertEquals(2,helper.pageItemCount(1));
        assertEquals(-1,helper.pageItemCount(3));
    }

    @Test
    void testPageIndex() {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(1,helper.pageIndex(5));
        assertEquals(0,helper.pageIndex(2));
        assertEquals(-1,helper.pageIndex(20));
        assertEquals(-1,helper.pageIndex(-10));
    }
}
