package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testMockingAndStubbing() {

        // Create Mock
        ExternalApi api = mock(ExternalApi.class);

        // Stub
        when(api.getUserName()).thenReturn("Pavithra");

        // Inject Mock
        UserService service = new UserService(api);

        // Verify Result
        assertEquals("Pavithra", service.fetchUser());

        // Verify Method Invocation
        verify(api).getUserName();
    }
}