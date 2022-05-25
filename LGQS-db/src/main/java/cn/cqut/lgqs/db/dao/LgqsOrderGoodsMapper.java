package cn.cqut.lgqs.db.dao;

import cn.cqut.lgqs.db.domain.LgqsOrderGoods;
import cn.cqut.lgqs.db.domain.LgqsOrderGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgqsOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    long countByExample(LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int insert(LgqsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(LgqsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    LgqsOrderGoods selectOneByExample(LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    LgqsOrderGoods selectOneByExampleSelective(@Param("example") LgqsOrderGoodsExample example, @Param("selective") LgqsOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    List<LgqsOrderGoods> selectByExampleSelective(@Param("example") LgqsOrderGoodsExample example, @Param("selective") LgqsOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    List<LgqsOrderGoods> selectByExample(LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    LgqsOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LgqsOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    LgqsOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    LgqsOrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LgqsOrderGoods record, @Param("example") LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LgqsOrderGoods record, @Param("example") LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LgqsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LgqsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LgqsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_order_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}