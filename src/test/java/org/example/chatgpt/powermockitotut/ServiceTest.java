//package org.example.chatgpt.powermockitotut;
//
//import org.junit.Test;
//import static org.mockito.Mockito.*;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.MockedStatic;
//import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//import static org.junit.Assert.assertEquals;
//
//@RunWith(PowerMockRunner.class)
////prepare the Utility class for static method
//@PrepareForTest(Utility.class)
//public class ServiceTest {
////    @Test
//    void testStaticMethod() {
//        try (MockedStatic<Utility> mockedStatic = mockStatic(Utility.class)) {
//            mockedStatic.when(Utility::getInfo).thenReturn("mocked result");
//
//            // Assertions or verifications
//        }
//    }
//
//    @Test
//    public void testFetchInfo(){
//        // Mock the static method in Utility class
//        PowerMockito.mockStatic(Utility.class);
//        // Define the return or other behaviour of static class
//        Mockito.when(Utility.getInfo()).thenReturn("Mocked Info");
//        Service srv= new Service();
//        String result = srv.fetchInfo();
//        System.out.println(result);
////        assertEquals(result, "Mocked Info");
//
//        // Optionally, verify static method is called or not....
////        PowerMockito.verifyStatic(Utility.class);
////        Utility.getInfo();
//    }
//}
