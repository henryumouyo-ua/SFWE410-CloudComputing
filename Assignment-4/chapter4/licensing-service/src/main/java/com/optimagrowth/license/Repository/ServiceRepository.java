package com.optimagrowth.license.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimagrowth.license.model.LicenseModel;

@Repository
public interface ServiceRepository extends CrudRepository<LicenseModel, Integer> {
}
