package cn.wizzer.app.out.modules.services.impl;

import cn.wizzer.app.out.modules.models.Sys_config;
import cn.wizzer.app.out.modules.services.SysConfigService;
import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

import java.util.List;

/**
 * Created by wizzer on 2016/12/23.
 */
@IocBean(args = {"refer:dao"})
@Service(interfaceClass=SysConfigService.class)
public class SysConfigServiceImpl extends BaseServiceImpl<Sys_config> implements SysConfigService {
    public SysConfigServiceImpl(Dao dao) {
        super(dao);
    }

    public List<Sys_config> getAllList() {
        return this.query(Cnd.where("delFlag", "=", false));
    }
}