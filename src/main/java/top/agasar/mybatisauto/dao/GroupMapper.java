package top.agasar.mybatisauto.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.agasar.mybatisauto.model.Group;

public interface GroupMapper {
    @Delete({
        "delete from group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into group (id, name, ",
        "size)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{size,jdbcType=INTEGER})"
    })
    int insert(Group record);

    int insertSelective(Group record);

    @Select({
        "select",
        "id, name, size",
        "from group",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Group selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Group record);

    @Update({
        "update group",
        "set name = #{name,jdbcType=VARCHAR},",
          "size = #{size,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Group record);
}