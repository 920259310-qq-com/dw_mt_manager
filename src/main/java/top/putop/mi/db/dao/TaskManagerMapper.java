package top.putop.mi.db.dao;

import top.putop.mi.db.model.TaskManager;

public interface TaskManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int insert(TaskManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int insertSelective(TaskManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    TaskManager selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int updateByPrimaryKeySelective(TaskManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(TaskManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_manager
     *
     * @mbggenerated Fri Jul 24 18:10:02 CST 2020
     */
    int updateByPrimaryKey(TaskManager record);
}