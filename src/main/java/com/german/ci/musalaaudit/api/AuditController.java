package com.german.ci.musalaaudit.api;

import com.german.ci.musalaaudit.api.resource.AuditEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit-event")
@Log4j2
public class AuditController {

    @PostMapping
    public void saveEvent(@RequestBody AuditEvent auditEvent) {
       log.info("Event: {}", auditEvent);
    }


}
