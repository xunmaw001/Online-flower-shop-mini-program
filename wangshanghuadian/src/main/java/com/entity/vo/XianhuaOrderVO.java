package com.entity.vo;

import com.entity.XianhuaOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 鲜花订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xianhua_order")
public class XianhuaOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单编号
     */

    @TableField(value = "xianhua_order_uuid_number")
    private String xianhuaOrderUuidNumber;


    /**
     * 收货地址
     */

    @TableField(value = "address_id")
    private Integer addressId;


    /**
     * 鲜花
     */

    @TableField(value = "xianhua_id")
    private Integer xianhuaId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "xianhua_order_true_price")
    private Double xianhuaOrderTruePrice;


    /**
     * 派送人
     */

    @TableField(value = "xianhua_order_courier_name")
    private String xianhuaOrderCourierName;


    /**
     * 联系方式
     */

    @TableField(value = "xianhua_order_courier_number")
    private String xianhuaOrderCourierNumber;


    /**
     * 订单类型
     */

    @TableField(value = "xianhua_order_types")
    private Integer xianhuaOrderTypes;


    /**
     * 支付类型
     */

    @TableField(value = "xianhua_order_payment_types")
    private Integer xianhuaOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单编号
	 */
    public String getXianhuaOrderUuidNumber() {
        return xianhuaOrderUuidNumber;
    }


    /**
	 * 获取：订单编号
	 */

    public void setXianhuaOrderUuidNumber(String xianhuaOrderUuidNumber) {
        this.xianhuaOrderUuidNumber = xianhuaOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：鲜花
	 */
    public Integer getXianhuaId() {
        return xianhuaId;
    }


    /**
	 * 获取：鲜花
	 */

    public void setXianhuaId(Integer xianhuaId) {
        this.xianhuaId = xianhuaId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getXianhuaOrderTruePrice() {
        return xianhuaOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setXianhuaOrderTruePrice(Double xianhuaOrderTruePrice) {
        this.xianhuaOrderTruePrice = xianhuaOrderTruePrice;
    }
    /**
	 * 设置：派送人
	 */
    public String getXianhuaOrderCourierName() {
        return xianhuaOrderCourierName;
    }


    /**
	 * 获取：派送人
	 */

    public void setXianhuaOrderCourierName(String xianhuaOrderCourierName) {
        this.xianhuaOrderCourierName = xianhuaOrderCourierName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getXianhuaOrderCourierNumber() {
        return xianhuaOrderCourierNumber;
    }


    /**
	 * 获取：联系方式
	 */

    public void setXianhuaOrderCourierNumber(String xianhuaOrderCourierNumber) {
        this.xianhuaOrderCourierNumber = xianhuaOrderCourierNumber;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getXianhuaOrderTypes() {
        return xianhuaOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setXianhuaOrderTypes(Integer xianhuaOrderTypes) {
        this.xianhuaOrderTypes = xianhuaOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getXianhuaOrderPaymentTypes() {
        return xianhuaOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setXianhuaOrderPaymentTypes(Integer xianhuaOrderPaymentTypes) {
        this.xianhuaOrderPaymentTypes = xianhuaOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
