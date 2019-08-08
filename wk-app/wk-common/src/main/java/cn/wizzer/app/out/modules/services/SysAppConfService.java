package cn.wizzer.app.out.modules.services;

import cn.wizzer.app.out.modules.models.Sys_app_conf;
import cn.wizzer.framework.base.service.BaseService;

import java.util.List;

public interface SysAppConfService extends BaseService<Sys_app_conf> {
    List<String> getConfNameList();
}
