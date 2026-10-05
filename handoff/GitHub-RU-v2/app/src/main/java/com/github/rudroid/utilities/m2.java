package com.github.rudroid.utilities;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 {
    public final AtomicLong a = new AtomicLong(Long.MIN_VALUE);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final long a(String str) {
        Object putIfAbsent;
        k71.k.g(str, "uniqueId");
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = Long.valueOf(this.a.getAndIncrement())))) != null) {
            obj = putIfAbsent;
        }
        return ((Number) obj).longValue();
    }
}
