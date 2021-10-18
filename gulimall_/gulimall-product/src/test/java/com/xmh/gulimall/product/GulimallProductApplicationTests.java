package com.xmh.gulimall.product;

import com.xmh.gulimall.product.entity.BrandEntity;
import com.xmh.gulimall.product.service.AttrGroupService;
import com.xmh.gulimall.product.service.BrandService;
import com.xmh.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * @author dinner
 * @description
 * @create 2021/7/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    AttrGroupService attrGroupService;

    @Autowired
    CategoryService categoryService;

    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        //brandEntity.setName("华为");
        //brandService.save(brandEntity);
        //System.out.println("保存成功");
        brandEntity.setBrandId(2L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
    }

    @Test
    public void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径{}", Arrays.asList(catelogPath));

    }

}