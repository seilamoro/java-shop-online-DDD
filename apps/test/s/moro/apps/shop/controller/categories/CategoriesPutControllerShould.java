package s.moro.apps.shop.controller.categories;


import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import s.moro.apps.shop.controller.RequestTestCase;

public final class CategoriesPutControllerShould extends RequestTestCase {
    //validamos que la infraestructura del test de aceptacion es ok, simulamos una peticion http
    @Test
    void create_a_valid_categories() throws Exception{
        assertRequestWithBody(
            "PUT",
            "/categories/201c4bb3-b790.492c-9985-9919de9ee4c1",
            "{\"name\": \"the best categories \", \"description\": \"descripcion\"}",
            201
        );
    }
}
