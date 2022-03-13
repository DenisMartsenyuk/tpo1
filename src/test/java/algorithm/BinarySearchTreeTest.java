package algorithm;

import org.junit.jupiter.api.*;

public class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @BeforeEach
    public void setup() {
        bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(6);
        bst.insert(5);
        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
    }

    @Test
    @DisplayName("Test BST find contains element 10")
    public void find10() {
        Assertions.assertEquals(bst.find(10), 10);
    }

    @Test
    @DisplayName("Test BST find contains element 6")
    public void find6() {
        Assertions.assertEquals(bst.find(6), 6);
    }

    @Test
    @DisplayName("Test BST find non-contains element 1")
    public void find1() {
        Assertions.assertNull(bst.find(1));
    }

    @Test
    @DisplayName("Test BST find non-contains element 11")
    public void find11() {
        Assertions.assertNull(bst.find(11));
    }

    @Test
    @DisplayName("Test BST insert non-contains element 13")
    public void insert13() {
        bst.insert(13);
        Assertions.assertNotNull(bst.find(13));
    }

    @Test
    @DisplayName("Test BST insert non-contains element 15")
    public void insert15() {
        bst.insert(15);
        Assertions.assertNotNull(bst.find(15));
    }

    @Test
    @DisplayName("Test BST insert contains element 10")
    public void insert10() {
        bst.insert(10);
        Assertions.assertNotNull(bst.find(10));
    }

    @Test
    @DisplayName("Test BST delete contains not duplicate element 6")
    public void delete6() {
        bst.delete(6);
        Assertions.assertNull(bst.find(6));
    }

    @Test
    @DisplayName("Test BST delete contains duplicate element 5")
    public void delete5() {
        bst.delete(5);
        Assertions.assertNotNull(bst.find(5));
    }

}
