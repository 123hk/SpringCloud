package com.demo.atom.api.IFeign;

import com.demo.atom.api.model.PlatformUser;
import org.springframework.web.bind.annotation.*;

/**
 * 平台访问地址
 */
public interface IPlatformUser {

    /**
     * 平台登录
     *
     * @param userName
     * @return
     */
    @PostMapping("/pms/login")
    PlatformUser login(@RequestParam("userName") String userName);

    /**
     * 修改平台用户
     *
     * @param platformUser
     * @return
     */
    @PutMapping("/platformUser")
    int update(@RequestBody PlatformUser platformUser);

    /**
     * 通过keyID查询用户
     *
     * @param keyID
     * @return
     */
    @GetMapping("/platformUser")
    PlatformUser getByKeyID(@RequestParam("keyID") String keyID);
}
