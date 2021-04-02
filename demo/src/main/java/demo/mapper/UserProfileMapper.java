package demo.mapper;

import demo.model.UserProfile;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    @Select("SELECT * FROM UserProfile WHERE id=#{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("SELECT * FROM UserProfile")
    List<UserProfile> getUserProfileList();

    @Insert("INSERT INTO UserProfile VALUES(#{id}, #{passwd}, #{name}, #{phonenumber}, #{address})")
    int insertUserProfile(@Param("id") String id, @Param("passwd") String passwd, @Param("name") String name, @Param("phonenumber") String phonenumber,
                          @Param("address") String address);

    @Update("UPDATE UserProfile SET passwd=#{passwd}, name=#{name}, phonenumber=#{phonenumber}, address=#{address} WHERE id=${id}")
    int updateUserProfile(@Param("id") String id, @Param("passwd") String passwd, @Param("name") String name, @Param("phonenumber") String phonenumber,
                          @Param("address") String address);

    @Delete("DELETE FROM UserProfile WHERE id=#{id}")
    int deleteUserProfile(@Param("id") String id);
}
