package com.coda_fofos.java_akademika.DTOs;

import jakarta.validation.constraints.Email;

import javax.validation.constraints.NotNull;

public record LoginRequestDTO(@NotNull @Email String email, @NotNull String password) {
}
