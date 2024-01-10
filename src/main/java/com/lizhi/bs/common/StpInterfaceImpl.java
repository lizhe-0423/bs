package com.lizhi.bs.common;

import cn.dev33.satoken.stp.StpInterface;
import com.lizhi.bs.service.impl.UsersServiceImpl;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义权限加载接口实现类
 *
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private UsersServiceImpl usersService;

    /**
     * 返回一个账号所拥有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        // 本 list 仅做模拟，实际项目中要根据具体业务逻辑来查询权限
        return null;
    }

    /**
     * 返回一个账号所拥有的角色标识集合 (权限与角色可分开校验)
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        Integer id = Integer.valueOf((String) loginId);

        String role = usersService.getById(id).getRole();
        List<String> list = new ArrayList<>();
        list.add(role);
        return list;
    }

}
