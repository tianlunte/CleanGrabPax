package com.cleangrab.cleanpaxadr;

/**
 * Created by qingyun.wang on 11/12/17.
 */

public class Sync {

    public int sync(int loops) {
        synchronized (this) {
            try {
                Thread.sleep(loops * 3000);
            } catch (Exception e) {}
        }
        return loops;
    }

}