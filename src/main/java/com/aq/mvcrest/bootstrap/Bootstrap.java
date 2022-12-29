package com.aq.mvcrest.bootstrap;

import com.aq.mvcrest.domain.Category;
import com.aq.mvcrest.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Bootstrap implements CommandLineRunner {

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category fresh = new Category();
        fresh.setName("Fresh");
        Category fruits = new Category();
        fruits.setName("Fruits");
        Category dried = new Category();
        dried.setName("Dried");
        Category exotic = new Category();
        exotic.setName("Exotic");
        Category nuts = new Category();
        nuts.setName("nuts");

        categoryRepository.save(fresh);
        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Number of Data Loaded: "+ categoryRepository.count());

    }
}
