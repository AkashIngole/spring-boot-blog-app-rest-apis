package com.springboot.blog.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null/empty.")
    private String name;

    @NotEmpty(message = "Email should not be null/empty.")
    @Email
    private String email;

    @NotEmpty(message = "Comment text cannot be null/empty.")
    @Size(min = 10)
    private String messageBody;
}
