package top.putop.mi.db.dao;

import top.putop.mi.db.model.SrcManager;

public interface SrcManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    int deleteByPrimaryKey(Integer srcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    int insert(SrcManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    int insertSelective(SrcManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    SrcManager selectByPrimaryKey(Integer srcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    int updateByPrimaryKeySelective(SrcManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table src_manager
     *
     * @mbggenerated Mon Aug 17 16:44:18 CST 2020
     */
    int updateByPrimaryKey(SrcManager record);
}