package com.search.medialib.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "photos_data", schema = "public", catalog = "photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gallery_id")
    private Gallery gallery;

    @Column(name = "descr")
    private String descr;

    @Column(name = "data", nullable = false)
    private byte[] data;

}
