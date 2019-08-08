package cn.wizzer.app.out.modules.services;

import cn.wizzer.app.out.modules.models.Sys_app_list;
import cn.wizzer.framework.base.service.BaseService;

import java.util.List;

public interface SysAppListService extends BaseService<Sys_app_list> {
    List<String> getAppNameList();
}
