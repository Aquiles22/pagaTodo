package com.pagatodo.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagatodo.test.dao.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}