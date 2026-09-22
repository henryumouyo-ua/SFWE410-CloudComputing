package com.optimagrowth.license.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Locale.Category;
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByCategoryIdIgnoreCase(Long catId);     
}
