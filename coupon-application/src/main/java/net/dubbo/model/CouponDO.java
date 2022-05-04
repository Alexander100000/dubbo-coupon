package net.dubbo.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券定义表
 * </p>
 *
 * @author 希尔
 * @since 2022-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("x_coupon")
public class CouponDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠券编码
     */
    private String code;

    /**
     * 优惠券图
     */
    private String imageUrl;

    /**
     * 优惠券库存
     */
    private Integer stock;

    /**
     * 达到满减资格金额
     */
    private BigDecimal achieveAmount;

    /**
     * 所减金额
     */
    private BigDecimal reduceAmount;

    /**
     * 状态0表示在使用期限内可用,状态1表示不在使用期限内不可用
     */
    private Boolean status;

    /**
     * 优惠券名称
     */
    private String title;

    private Date createTime;


}
