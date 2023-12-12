package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.enity.center;
import com.example.demo.mapper.CenterMapper;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import com.example.demo.method.loader.bestLoader;
import javax.annotation.Resource;
import java.sql.SQLException;
import com.example.demo.method.client.DatabaseManipulation;

@RestController
@RequestMapping("/center")
@CrossOrigin
@ResponseBody
public class CenterController {
    DatabaseManipulation db=new DatabaseManipulation();
    bestLoader bs=new bestLoader();
    @Resource
    CenterMapper centerMapper;

    @PostMapping("/load")
    public Result<?> load() throws SQLException {
        bs.loadData();
        return Result.success("[{\"huanyuhai\": \"sb\"}]");

    }
    @GetMapping("/Q6")
    public String find() throws SQLException {

        String re=db.getAllStaffCount();

        return re;
    }
    @GetMapping("/Q7")
    public String find7() throws SQLException {

        String re=db.getContractCount();

        return re;
    }
    @GetMapping("/Q8")
    public String find8() throws SQLException {

        String re=db.getOrderCount();

        return re;
    }
    @GetMapping("/Q9")
    public String find9() throws SQLException {

        String re=db.getNeverSoldProduct();

        return re;
    }
    @GetMapping("/Q10")
    public String find10() throws SQLException {

        String re=db.getFavoriteProductModel();

        return re;
    }
    @GetMapping("/Q11")
    public String find11() throws SQLException {

        String re=db.getAvgStockByCenter();

        return re;
    }
    @GetMapping("/Q12")
    public String find12(@RequestParam String search) throws SQLException {

        String re=db.getProductByNumber(search);

        return re;
    }
    @GetMapping("/Q131")
    public String  find131(@RequestParam String search) throws SQLException {

        String re=db.getContractInfoFirst(search);

        return re;
    }
    @GetMapping("/Q132")
    public String find132(@RequestParam String search) throws SQLException {

        String re=db.getContractInfoSecond(search);

        return re;
    }

}
