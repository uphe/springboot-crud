package com.hzy.mapper;

import com.hzy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 表示这是mybatis的一个mapper类
@Repository //相当于@Component
public interface UserMapper {
    int addUser(User user);
    User queryUserByName(String username);
    List<User> queryAllUser();
}
