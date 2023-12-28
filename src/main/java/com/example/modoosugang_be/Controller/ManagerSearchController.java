package com.example.modoosugang_be.Controller;

import com.example.modoosugang_be.Domain.StudentLog;
import com.example.modoosugang_be.Service.StudentLogService;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ManagerSearchController {
    private final StudentLogService studentLogService;

    @PostMapping("/manage/search")
    public List searchLog(@RequestBody Map<String, Object> param){
        System.out.println(param);
        String univ = param.get("univ").toString();
        String id = param.get("studentId").toString();

        List<StudentLog> logs = studentLogService.findStudentLog(univ, id);
        List list = new ArrayList();

        for (StudentLog log : logs){
            JSONObject data = new JSONObject();

            // Create Json Array
            data.put("id", log.getId());
            data.put("univ", log.getUniv());
            data.put("lecture", log.getLecture());
            data.put("register", log.getRegister());
            data.put("cancel", log.getCancel());
            data.put("retake", log.getRetake());
            data.put("modify", log.getModify());
            list.add(data);
        }
        System.out.println(list);
        return list;
    }
}
