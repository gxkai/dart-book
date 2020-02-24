package com.shop.db.dao;

import com.shop.db.domain.ShopGoods;
import com.shop.db.domain.ShopGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    long countByExample(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int deleteByExample(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int insert(ShopGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int insertSelective(ShopGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectOneByExample(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectOneByExampleSelective(@Param("example") ShopGoodsExample example, @Param("selective") ShopGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectOneByExampleWithBLOBs(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    List<ShopGoods> selectByExampleSelective(@Param("example") ShopGoodsExample example, @Param("selective") ShopGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    List<ShopGoods> selectByExampleWithBLOBs(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    List<ShopGoods> selectByExample(ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShopGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    ShopGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShopGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ShopGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShopGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") ShopGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}