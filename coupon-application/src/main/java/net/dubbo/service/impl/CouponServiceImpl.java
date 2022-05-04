package net.dubbo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.dubbo.mapper.CouponMapper;
import net.dubbo.model.CouponDO;
import net.dubbo.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券定义表 服务实现类
 * </p>
 *
 * @author 希尔
 * @since 2022-05-04
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, CouponDO> implements CouponService {

}
