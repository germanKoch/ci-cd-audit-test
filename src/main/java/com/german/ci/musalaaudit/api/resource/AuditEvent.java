package com.german.ci.musalaaudit.api.resource;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public record AuditEvent(String droneId, Integer batteryCapacity, State state) {
}
