package com.example.apispringbackend;

import java.util.List;
import java.util.Objects;

    public record ClientDTO(int id,
                            String name,
                            String email,
                            int age,
                            String gender,
                            List<PhoneDTO> phone,
                            String address) {

    }
