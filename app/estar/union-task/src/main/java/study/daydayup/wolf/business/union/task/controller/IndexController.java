package study.daydayup.wolf.business.union.task.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.daydayup.wolf.business.union.task.dal.dao.ContractDAO;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * study.daydayup.wolf.business.union.task.controller
 *
 * @author Wingle
 * @since 2020/2/3 8:12 下午
 **/
@RestController
public class IndexController {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private ContractDAO contractDAO;

    @RequestMapping("/index/hello")
    public String hello() {
        return "Hello union task";
    }
    @RequestMapping("/index/contract")
    public List<Map<String, Object>> contract() {
        return contractDAO.top();
    }


    @RequestMapping("/index/jdbc")
    public List<Map<String, Object>> jdbc() {
        List<Map<String, Object>>  result = jdbcTemplate.queryForList("select * from `contract` order by id desc limit 5");
        

        return result;
    }

    @RequestMapping("/index/demo")
    public String demo() {
        Demo demo = new Demo();
        demo.show();

        return "demo showing ...";
    }

}
