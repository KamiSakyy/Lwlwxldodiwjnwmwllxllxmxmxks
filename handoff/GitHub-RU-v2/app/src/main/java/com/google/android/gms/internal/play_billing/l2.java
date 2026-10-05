package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 {
    public static final l2 c = new l2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final c2 a = new c2();

    public final o2 a(Class cls) {
        o2 u;
        Charset charset = z1.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        o2 o2Var = (o2) concurrentHashMap.get(cls);
        if (o2Var != null) {
            return o2Var;
        }
        c2 c2Var = this.a;
        c2Var.getClass();
        r1 r1Var = p2.a;
        if (!t1.class.isAssignableFrom(cls)) {
            int i = i1.a;
        }
        n2 a = ((c2) c2Var.a).a(cls);
        if ((a.d & 2) == 2) {
            int i2 = i1.a;
            r1 r1Var2 = p2.a;
            r1 r1Var3 = p1.a;
            u = new j2(r1Var2, a.a);
        } else {
            int i3 = i1.a;
            int i4 = k2.a;
            int i5 = b2.a;
            r1 r1Var4 = p2.a;
            r1 r1Var5 = a.a() + (-1) != 1 ? p1.a : null;
            int i6 = e2.a;
            u = i2.u(a, r1Var4, r1Var5);
        }
        o2 o2Var2 = (o2) concurrentHashMap.putIfAbsent(cls, u);
        return o2Var2 != null ? o2Var2 : u;
    }
}
