package com.mp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.entity.IPLTeam;

public interface IPLTeamRepository extends JpaRepository<IPLTeam,Integer> {

}
