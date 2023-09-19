package hello.capstone.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import hello.capstone.dto.Member;

@Mapper
public interface LoginMapper {

   void save(Member member);

   void saveSocial(Member member);
   
   Member findbyid(@Param("id") String id, @Param("social") String social); //마지막수정 09/15 16시 41분
}