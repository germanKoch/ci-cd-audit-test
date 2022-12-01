package com.german.ci.musalaaudit.api.resource;

public record AuditEvent(String droneId, Integer batteryCapacity, State state) {
}
