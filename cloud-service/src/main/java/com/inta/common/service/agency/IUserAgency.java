package com.inta.common.service.agency;


import com.inta.common.api.feign.IUser;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 原子服务代理
 */
@FeignClient("cloud-atom")
public interface IUserAgency extends IUser {
}
