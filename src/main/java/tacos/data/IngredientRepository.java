package tacos.data;

import tacos.Ingredient;

import java.util.Optional;

/**
 * @author Oleg Khilko
 */

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}