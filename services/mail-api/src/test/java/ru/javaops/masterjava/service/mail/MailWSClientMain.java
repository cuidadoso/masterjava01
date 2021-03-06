package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableList;

/**
 * gkislin
 * 28.11.2016
 */
public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendMail(
                ImmutableList.of(new Addressee("Григорий Кислин <gkislin@javaops.ru>")),
                ImmutableList.of(new Addressee("Мастер Java <masterjava@javaops.ru>")), "Subject", "Body");
    }
}