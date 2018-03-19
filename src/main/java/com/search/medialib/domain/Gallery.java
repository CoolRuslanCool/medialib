package com.search.medialib.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gallery", schema = "public", catalog = "photos")
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false, length = 250)
    private String name;
}
