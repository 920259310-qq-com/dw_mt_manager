package top.putop.mi.db.dao;

import top.putop.mi.db.model.ColManager;

public interface ColManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int deleteByPrimaryKey(Integer colId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int insert(ColManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int insertSelective(ColManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    ColManager selectByPrimaryKey(Integer colId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int updateByPrimaryKeySelective(ColManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int updateByPrimaryKey(ColManager record);
}