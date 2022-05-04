package net.dubbo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户优惠	券
 * </p>
 *
 * @author 希尔
 * @since 2022-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("x_user_coupon")
public class UserCouponDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ⽤户优惠券	码
     */
    private String userCouponCode;

    /**
     * 优惠券图
     */
    private String imageUrl;

    /**
     * t_coupon表外键ID
     */
    private Integer couponId;

    /**
     * 所领取用户户id
     */
    private Integer userId;

    /**
     * 状态为0表示未使用，1为已使用
     */
    private Integer status;

    /**
     * 对应x_order表外键
     */
    private Integer orderId;

    private Date createTime;


}
