package pl.pingwit.lec_28.point_2.entity;

import java.util.List;

public record Program(
    String name,
    List<String> lectures
) {
}
