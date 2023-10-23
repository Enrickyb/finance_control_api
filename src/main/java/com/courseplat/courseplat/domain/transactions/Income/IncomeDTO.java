package com.courseplat.courseplat.domain.transactions.Income;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record IncomeDTO(@NotBlank String title, String description, @NotBlank String user_id, @NotNull float value, @NotBlank String date) {
}
