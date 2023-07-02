use screenspot;
CREATE TABLE Movie (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  release_year INT,
  genre VARCHAR(255),
  director VARCHAR(255)
);
CREATE TABLE TVShow (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  release_year INT,
  genre VARCHAR(255),
  season_count INT
);
CREATE TABLE Band (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  genre VARCHAR(255),
  year_formed INT
);
CREATE TABLE User (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name varchar(200),
  last_name varchar(200),
  DOB DATE,
  gender ENUM('Male', 'Female', 'Other'),
    phone_number VARCHAR(20),
  profile_picture VARCHAR(255),
  biography TEXT,
  facebook_url VARCHAR(255),
  twitter_url VARCHAR(255),
  linkedin_url VARCHAR(255),
  tiktok_url VARCHAR(255),
  instagram_url VARCHAR(255),
  username VARCHAR(255),
  email VARCHAR(255),
  password_hash VARCHAR(255)
);

