package top.putop.mi.service;

public interface IBaseService<T> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    int deleteByPrimaryKey(Integer colId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    int insert(T t);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    int insertSelective(T t);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    T selectByPrimaryKey(Integer colId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table col_manager
     *
     * @mbggenerated Wed Jul 22 14:00:18 CST 2020
     */
    int updateByPrimaryKey(T t);
}
