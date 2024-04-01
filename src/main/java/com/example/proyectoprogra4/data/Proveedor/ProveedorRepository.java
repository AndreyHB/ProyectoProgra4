package com.example.proyectoprogra4.data.Proveedor;

import com.example.proyectoprogra4.logic.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,String> {

}
