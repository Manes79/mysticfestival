package pl.manes.mysticfestival2022.bands.arabrot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArabrotRepository extends CrudRepository<Arabrot, UUID> {
}
