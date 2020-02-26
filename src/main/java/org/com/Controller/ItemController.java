package org.com.Controller;

import org.com.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.com.service.ItemService;

/*
 * @Author: hlz
 * @Contact: zxc2404283049@163.com
 * @Date: 2020/2/25 13:05
 * @Version: 1.0
 * @Description:
 * */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;


    /*
     * 对外提供接口服务，查询商品信息
    * */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return this.itemService.ByIdgetitem(id);
    }
}
