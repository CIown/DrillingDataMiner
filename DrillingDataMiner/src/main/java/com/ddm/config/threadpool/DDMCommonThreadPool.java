package com.ddm.config.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DDMCommonThreadPool {

    public static final ThreadPoolExecutor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(
            2, 5, 60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(1024 * 10), new ThreadPoolExecutor.DiscardPolicy());

}
