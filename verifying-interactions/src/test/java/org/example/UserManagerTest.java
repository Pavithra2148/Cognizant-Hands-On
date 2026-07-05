package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserManagerTest {

    @Test
    void testVerifyInteraction() {

        // Create Mock
        NotificationService notificationService = mock(NotificationService.class);

        // Inject Mock
        UserManager userManager = new UserManager(notificationService);

        // Act
        userManager.registerUser("Pavithra");

        // Verify interaction
        verify(notificationService).sendNotification("Welcome Pavithra");

    }
}