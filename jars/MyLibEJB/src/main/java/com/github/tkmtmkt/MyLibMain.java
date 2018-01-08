package com.github.tkmtmkt;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@LocalBean
@Stateless
public class MyLibMain implements MyLibMainRemote {
    @Override
    public void execute() {
        log.info(">>>>> execute() start");
    }
}
