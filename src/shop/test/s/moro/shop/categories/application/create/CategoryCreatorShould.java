package s.moro.shop.categories.application.create;

import org.junit.jupiter.api.Test;
import s.moro.shop.categories.domain.Category;
import s.moro.shop.categories.domain.CategoryRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CategoryCreatorShould {
    @Test
    void save_a_valid_course(){
        CategoryRepository repository = mock(CategoryRepository.class);
        CategoryCreator creator = new CategoryCreator(repository);

        Category category = new Category("some-id","some-name", "some-description");

        //creator.create(category.id(),category.name(),category.description());//cambio en el modelado 1
        creator.create(new CreateCategoryRequest(category.id(),category.name(),category.description()));//le pasamos el objeto request

        verify(repository, atLeastOnce()).save(category);
    }
}
