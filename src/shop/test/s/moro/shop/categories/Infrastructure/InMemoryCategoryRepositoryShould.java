package s.moro.shop.categories.Infrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import s.moro.shop.categories.domain.Category;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryCategoryRepositoryShould {
    @Test
    void save_a_valid_category(){
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        repository.save(new Category("some-id", "some-name", "some-description"));

    }

    @Test
    void search_an_existing_course() {
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        Category category = new Category("some-id", "some-name", "some-description");

        repository.save(category);

        Assert.assertEquals(Optional.of(category), repository.search(category.id()));
    }

    @Test
    void not_find_a_non_existing_category(){
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        Assert.assertFalse(repository.search("non-existing-id").isPresent());
    }

}
