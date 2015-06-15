package pathashala;

import com.thoughtworks.pathashala.Console;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ConsoleTest {
    private Console console;
    private BufferedReader bufferedReader;

    @Mock
    PrintStream printStream;

    @Test
    public void shouldTakeUserInputUntilEmptyLineIsRead() throws Exception {
        String lineOne = "1 book at 12.49";
        String lineTwo = "1 music CD at 14.99";
        String lineThree = "1 chocolate bar at 0.85";
        String totalInput = lineOne + System.lineSeparator() +
                lineTwo + System.lineSeparator() + lineThree + System.lineSeparator();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(totalInput.getBytes());
        bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        console = new Console(bufferedReader, printStream);

        String actualInput = console.getUserInput();
        String expectedInput = lineOne + System.lineSeparator() +
                lineTwo + System.lineSeparator() + lineThree + System.lineSeparator();

        assertEquals(expectedInput, actualInput);
    }
}
