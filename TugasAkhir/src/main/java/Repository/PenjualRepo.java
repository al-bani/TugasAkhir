/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author alzildan
 */

public interface PenjualRepo<T> {
    T Login(String username, String password);
    T Register(String username, String password,String namaDepan, String namaBelakang,String alamat,String email);
    T updatePassword(String email, String Password);
    T cekEmail(String email);
    T cekUsername(String username);
}
