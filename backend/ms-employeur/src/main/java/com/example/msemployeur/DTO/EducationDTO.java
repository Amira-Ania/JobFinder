package com.example.msemployeur.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO {
    private Long idEducation;
    private String ecole ;
    private Date dateDebut;
    private Date dateFin;
}
