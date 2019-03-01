package com.micro.system.gateway.model.gateway;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class GateWayRoute {
    private String id;
    private List<GatewayPredicate> predicates = new ArrayList<>();
    private List<GatewayFilter> filters = new ArrayList<>();
    private String uri;
    private int order = 0;
}
