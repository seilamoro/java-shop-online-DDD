package s.moro.shop.categories.Infrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import s.moro.shop.categories.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryCategoryRepositoryShould {
    @Test
    void save_a_valid_category(){
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        Category category = CategoryMother.random();//asi se sabe menos ley de mether, cuando se va a crear algo, que me interesa la categoria
                /*new Category(
                new CategoryId("6972a2e5-b44c-4173-a83a-4d6c45d8fcd2"),
                CategoryNameMother.random(),
                new CategoryDescription("description"));*/
        repository.save(category);
    }

    @Test
    void search_an_existing_course() {
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        //Category category = new Category("some-id", "some-name", "some-description");
        Category category = CategoryMother.random();
        /*Category category = new Category(
                new CategoryId("6972a2e5-b44c-4173-a83a-4d6c45d8fcd2"),
                new CategoryName("name"),
                new CategoryDescription("description"));*/
        repository.save(category);

        assertEquals(Optional.of(category), repository.search(category.id()));
    }

    @Test
    void not_find_a_non_existing_category(){
        InMemoryCategoryRepository repository = new InMemoryCategoryRepository();

        //Assert.assertFalse(repository.search(new CategoryId("6972a2e5-b44c-4173-a83a-4d6c45d8fcd2")).isPresent());
        Assert.assertFalse(repository.search(CategoryIdMother.random()).isPresent());
    }

}
