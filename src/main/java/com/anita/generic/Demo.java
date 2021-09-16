package com.anita.generic;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Product<NormalMember> softDoll = new Product<>();

        softDoll.setName("Pooh Bear");
        softDoll.setCreatedBy(new NormalMember(1L));
        softDoll.setDescription("softdoll*******");
        softDoll.setCreatedDate(new Date());
    }
}
