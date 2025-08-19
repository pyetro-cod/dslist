package com.devprime.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprime.dslist.entities.Game;

public interface GameRepository  extends JpaRepository<Game,Long>{
	 

}
