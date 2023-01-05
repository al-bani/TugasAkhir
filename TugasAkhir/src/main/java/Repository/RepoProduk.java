/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author alzildan
 * @param <T> Type
 * @param <ID> Identifier
 */
public interface RepoProduk<T, ID> {
    List<T> findAll(String query);
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(String id);
    ID delete(String kodeProduk);
}
