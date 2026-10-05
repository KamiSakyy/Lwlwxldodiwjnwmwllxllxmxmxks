package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: /home/user/work/p/classes4.dex */
public interface c extends Future {
    void a(Runnable runnable, Executor executor);
}
