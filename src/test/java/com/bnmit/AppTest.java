package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class AppTest{

    @Test
    void testadd(){
        App app = new App();
        assertEquals(2, app.add(4,5));
    }
}
