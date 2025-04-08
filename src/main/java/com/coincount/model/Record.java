package com.coincount.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "records")
public class Record {

     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "record_seq")
    @SequenceGenerator(name = "record_seq", sequenceName = "record_id_seq", allocationSize = 1)
    private Long id;

    @NotBlank(message = "Description is required")
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String description;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Amount must be positive")
    @Digits(integer = 17, fraction = 2)
    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal amount;

    @NotNull(message = "Date is required")
    @Column(nullable = false)
    private LocalDate date;

    @NotBlank(message = "Category is required")
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String category;


    // 1. BuildConstructors
    public Record() {}

    public Record(String description, BigDecimal amount, LocalDate date, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // Build the getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}