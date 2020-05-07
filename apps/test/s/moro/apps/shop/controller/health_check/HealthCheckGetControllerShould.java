package s.moro.apps.shop.controller.health_check;


import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import s.moro.apps.shop.controller.RequestTestCase;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckGetControllerShould extends RequestTestCase {

    @Test
    void check_health_check_is_working() throws Exception{
        assertResponse("/health-check", 200, "{'status':'ok'}");
    }
}
