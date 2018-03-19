CREATE TABLE gallery
(
  id SERIAL PRIMARY KEY NOT NULL,
  name VARCHAR(250) NOT NULL
);
CREATE UNIQUE INDEX gallery_id_uindex ON gallery (id);
CREATE UNIQUE INDEX gallery_name_uindex ON gallery (name);

INSERT INTO gallery(name) VALUES ('none gallery');

CREATE TABLE photos_data
(
  id SERIAL PRIMARY KEY NOT NULL,
  descr VARCHAR(150),
  gallery_id INT DEFAULT 1,
  data BYTEA,
  CONSTRAINT photos_data_gallery_id_fk FOREIGN KEY (gallery_id) REFERENCES gallery (id)
);
CREATE UNIQUE INDEX photos_data_id_uindex ON photos_data (id);
