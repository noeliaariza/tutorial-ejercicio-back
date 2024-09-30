package com.ccsw.ejclientes.category;

import com.ccsw.ejclientes.category.model.Category;
import com.ccsw.ejclientes.category.model.CategoryDto;

import java.util.List;

/**
 * @author ccsw
 *
 */
public interface CategoryService {

    /**
     * Método para recuperar todas las {@link Category}
     *
     * @return {@link List} de {@link Category}
     */
    List<Category> findAll();

    /**
     * Método para crear o actualizar una {@link Category}
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    void save(Long id, CategoryDto dto);

    /**
     * Método para borrar una {@link Category}
     *
     * @param id PK de la entidad
     */
    void delete(Long id) throws Exception;

}