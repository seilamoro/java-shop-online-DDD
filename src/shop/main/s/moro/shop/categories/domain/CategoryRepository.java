package s.moro.shop.categories.domain;

import java.util.Optional;

//para el mock
public interface CategoryRepository {
    void save(Category category);

    Optional<Category> search(String id);
}
