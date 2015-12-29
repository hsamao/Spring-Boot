package com.samao.bootspring.service;

import com.samao.bootspring.model.Greeting;

import java.util.concurrent.Future;

/**
 * Created by samao on 12/28/15.
 */
public interface EmailService {

    Boolean send(Greeting greetig);

    void sendAsync(Greeting greeting);

    Future<Boolean> sendAsyncWithResult(Greeting greeting);
}
