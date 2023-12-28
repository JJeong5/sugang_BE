package com.example.modoosugang_be.Controller;


import com.example.modoosugang_be.Domain.EmailMessage;
import com.example.modoosugang_be.Domain.Professor;
import com.example.modoosugang_be.Domain.Request;
import com.example.modoosugang_be.Service.MailService;
import com.example.modoosugang_be.Service.ProfessorService;
import com.example.modoosugang_be.Service.RequestingService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

@Component
@RequiredArgsConstructor
public class MailController {

    private final MailService emailService;
    private final ProfessorService professorService;
    private final RequestingService requestingService;

//    10초에 한번씩 실행
//    @Scheduled(fixedDelay = 10000)
//    매일 자정에 실행
    @Scheduled(cron = "0 0 0 * * *")
    public void handleRequesting(){
        List<Professor> professorList = professorService.callProfessorList();

        if (professorList.size() > 0) {
            for (Professor professor : professorList) {
                System.out.println(professor.getId());
                List<Request> requests = requestingService.callRequestByProfessor(professor.getId());

                if (requests.size() > 0) {
                    Map<String, int[]> requestCounter = new HashMap<>();

                    for (Request request : requests) {
                        System.out.println(request.getLecture());
                        int[] prevVal = requestCounter.get(request.getLecture());
                        if (prevVal == null) {
                            requestCounter.put(request.getLecture(), new int[]{1});
                        } else {
                            prevVal[0]++;
                        }
                    }

                    String EmailContext = "다음과 같은 증원 신청 요청이 있습니다.\n";
                    for (String key : requestCounter.keySet()) {
                        EmailContext = EmailContext + key+": "+requestCounter.get(key)[0] + "명\n";
                    }
                    System.out.println("Email: "+professor.getEmail());
                    System.out.println("Content: "+EmailContext);
                    sendMail(professor.getEmail(), EmailContext);
                }
            }
        }

    }



    public void sendMail(String email, String contents) {
        EmailMessage emailMessage = EmailMessage.builder()
                .to(email)
                .subject("[ModooSugang] 증원 신청 요청")
                .message(contents)
                .build();
        emailService.sendMail(emailMessage);
        System.out.println("Send~~");
    }
}
