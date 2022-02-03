package com.demo.test.repo;

import com.demo.test.domain.model.Automovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepo extends CrudRepository<Automovel, Long> {

}
