package com.example.modoosugang_be.Controller;

import com.example.modoosugang_be.Domain.Schedule;
import com.example.modoosugang_be.Service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleservice;

    @PostMapping("/manager/FormPeriod/basket")
    public int PeriodBasket(@RequestBody Map<String, Object> param) {

        String start = param.get("start").toString();
        String end = param.get("end").toString();
        String id = "1";
        return scheduleservice.setPeriodBasket(start,end,id);

    }

    @PostMapping("/manager/FormPeriod/register")
    public int PeriodRegister(@RequestBody Map<String, Object> param) {

        String start = param.get("start").toString();
        String end = param.get("end").toString();
        String id = "1";
        return scheduleservice.setPeriodRegister(start,end,id);

    }

    @PostMapping("/manager/FormPeriod/modify")
    public int PeriodModify(@RequestBody Map<String, Object> param) {

        String start = param.get("start").toString();
        String end = param.get("end").toString();
        String id = "1";
        return scheduleservice.setPeriodModify(start,end,id);

    }

    @PostMapping("/manager/FormPeriod/cancle")
    public int PeriodCancle(@RequestBody Map<String, Object> param) {

        String start = param.get("start").toString();
        String end = param.get("end").toString();
        String id = "1";
        return scheduleservice.setPeriodCancle(start,end,id);

    }

}
