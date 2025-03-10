package org.example.models

import java.time.LocalDate
import java.time.LocalDateTime

data class Vehiculo(
    val id: Int,
    val matricula: String,
    val marca: String,
    val modelo: String,
    val fechaMatriculacion: LocalDate,
    val permisoActivo: Boolean,
    val tipo: Tipo

)

enum class Tipo {
    ELECTRICO, HIBRIDO, COMBUSTION
}