package tacos.data;

import tacos.TacoOrder;

import java.util.Optional;

/**
 * @author Oleg Khilko
 */

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

    Optional<TacoOrder> findById(Long id);

}