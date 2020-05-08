package s.moro.shop.categories.application.create;
//servicio aplicacion


import s.moro.shared.domain.Service;
import s.moro.shop.categories.domain.Category;
import s.moro.shop.categories.domain.CategoryRepository;


//encapsulamos al punto de entrada del boudencontext que es el modulo
@Service
public final class CategoryCreator {
    private CategoryRepository repository;

    public CategoryCreator(CategoryRepository repository) {
        this.repository = repository;
    }


        public void create(String id, String name, String description ){
            Category category = new Category(id, name, description);
            repository.save(category);
    }//refactorizado en modelado de dominio1
    //ahora recibe un valid object, no hace falta que el valid object tenga get, los atributos siempre van a ser privados para evitar que fuera del objeto sea mutable, encapsularlo
   /* public void create(CreateCategoryRequest request){
        Category category = new Category(request.id(), request.name(), request.description());
        repository.save(category);
    }*/
}
