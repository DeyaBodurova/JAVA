package p01_Database;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {


    @Test
    public void createDatabase() throws OperationNotSupportedException {
        Integer [] numbers = {-1, 0, 5, 42, 69, 7};
        Database database = new Database(numbers);
        Integer[] dbElements = database.getElements();
        assertEquals(numbers.length, dbElements.length);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(numbers[i],dbElements[i]);
        }

       // assertEquals(numbers,dbElements);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void createDatabaseConstructorWithLessThanOneElements() throws OperationNotSupportedException {
        Database database= new Database();
    }

}