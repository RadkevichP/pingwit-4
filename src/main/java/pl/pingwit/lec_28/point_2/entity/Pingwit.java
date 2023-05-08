package pl.pingwit.lec_28.point_2.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Pingwit(
    String name,
    Boolean isOnline,
    Double courseLength,
    List<PingwitStudent> students,
    Program program
) {
}
