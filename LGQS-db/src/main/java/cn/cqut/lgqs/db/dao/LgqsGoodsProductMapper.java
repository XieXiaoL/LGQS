package cn.cqut.lgqs.db.dao;

import cn.cqut.lgqs.db.domain.LgqsGoodsProduct;
import cn.cqut.lgqs.db.domain.LgqsGoodsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LgqsGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    long countByExample(LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int insert(LgqsGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(LgqsGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    LgqsGoodsProduct selectOneByExample(LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    LgqsGoodsProduct selectOneByExampleSelective(@Param("example") LgqsGoodsProductExample example, @Param("selective") LgqsGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    List<LgqsGoodsProduct> selectByExampleSelective(@Param("example") LgqsGoodsProductExample example, @Param("selective") LgqsGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    List<LgqsGoodsProduct> selectByExample(LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    LgqsGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LgqsGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    LgqsGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    LgqsGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LgqsGoodsProduct record, @Param("example") LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LgqsGoodsProduct record, @Param("example") LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LgqsGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LgqsGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LgqsGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lgqs_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}