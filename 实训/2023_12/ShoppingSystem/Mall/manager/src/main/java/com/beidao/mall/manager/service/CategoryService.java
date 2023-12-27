package com.beidao.mall.manager.service;

import com.beidao.mall.model.entity.product.Category;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface CategoryService {

    //分类列表  每次查询一层数据
    List<Category> findCategoryList(Long id);

    //导出功能
    void exportData(HttpServletResponse response);
}
