package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 {
    public static final d6 c = new d6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final t5 a = new t5(0);

    public final g6 a(Class cls) {
        g6 u;
        Charset charset = n5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        g6 g6Var = (g6) concurrentHashMap.get(cls);
        if (g6Var != null) {
            return g6Var;
        }
        t5 t5Var = this.a;
        t5Var.getClass();
        e5 e5Var = h6.a;
        g5.class.isAssignableFrom(cls);
        f6 b = ((t5) t5Var.r).b(cls);
        if ((b.d & 2) == 2) {
            e5 e5Var2 = h6.a;
            e5 e5Var3 = a5.a;
            u = new a6(e5Var2, b.a);
        } else {
            int i = b6.a;
            int i2 = q5.a;
            e5 e5Var4 = h6.a;
            e5 e5Var5 = b.a() + (-1) != 1 ? a5.a : null;
            int i3 = w5.a;
            u = z5.u(b, e5Var4, e5Var5);
        }
        g6 g6Var2 = (g6) concurrentHashMap.putIfAbsent(cls, u);
        return g6Var2 != null ? g6Var2 : u;
    }
}
