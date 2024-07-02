package com.giselle.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.springsecurity.entities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
