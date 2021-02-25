package com.example.infra;

import com.example.domain.model.EventMember;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PokerEventRepository {
  void registerMember(EventMember eventMember);

  List<EventMember> fetch();
}
