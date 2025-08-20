package com.devprime.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devprime.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList,Long>{
	 

}
