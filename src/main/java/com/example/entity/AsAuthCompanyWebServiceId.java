package com.example.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AsAuthCompanyWebServiceId implements Serializable {

    private String authCompanyGuid;
    private String authWebServiceGuid;
}
