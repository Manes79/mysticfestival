package pl.manes.mysticfestival2022.bands.thevintagecaravan;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TheVintageCaravanRepository extends CrudRepository<TheVintageCaravan, UUID> {
}