package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {
        // Step 1: Create mocks
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Step 2: Stub the file reader
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Step 3: Inject mocks into the service
        FileService fileService = new FileService(mockFileReader, mockFileWriter);
        String result = fileService.processFile();

        // Step 4: Assert the result and verify interaction
        assertEquals("Processed Mock File Content", result);
        verify(mockFileWriter).write("Processed Mock File Content");
    }
}
