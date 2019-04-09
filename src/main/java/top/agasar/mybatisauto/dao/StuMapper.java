package top.agasar.mybatisauto.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.agasar.mybatisauto.model.Stu;

public interface StuMapper {
    @Delete({
        "delete from stu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into stu (id, name, ",
        "age)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER})"
    })
    int insert(Stu record);

    int insertSelective(Stu record);

    @Select({
        "select",
        "id, name, age",
        "from stu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu record);

    @Update({
        "update stu",
        "set name = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Stu record);
}