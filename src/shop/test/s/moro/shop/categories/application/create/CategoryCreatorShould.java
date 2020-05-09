package s.moro.shop.categories.application.create;

import org.junit.jupiter.api.Test;
import s.moro.shop.categories.domain.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CategoryCreatorShould {
    @Test
    void save_a_valid_Category(){
        CategoryRepository repository = mock(CategoryRepository.class);
        CategoryCreator creator = new CategoryCreator(repository);
        CreateCategoryRequest request = new CreateCategoryRequest("6972a2e5-b44c-4173-a83a-4d6c45d8fcd2","some-name","some-description");
        //Category category = new Category("some-id","some-name", "some-description");//refactorizado en modelando dominio
        Category category = new Category(new CategoryId(request.id()),new CategoryName(request.name()), new CategoryDescription(request.description()));
        //creator.create(category.id(),category.name(),category.description());//cambio en el modelado 1
        //creator.create(new CreateCategoryRequest(category.id(),category.name(),category.description()));//le pasamos el objeto request
        creator.create(request);
        verify(repository, atLeastOnce()).save(category);
    }
}
