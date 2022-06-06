package pl.manes.mysticfestival2022.bands.onlysons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OnlySonsRepository extends CrudRepository<OnlySons, UUID> {
}