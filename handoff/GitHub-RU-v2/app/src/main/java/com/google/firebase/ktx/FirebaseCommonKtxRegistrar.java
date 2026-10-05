package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i4.u;
import java.util.List;
import java.util.concurrent.Executor;
import o41.b;
import o41.d;
import p41.a;
import p41.i;
import p41.o;
import v71.v;
import w61.c;
import x61.l;

@Keep
@c
/* loaded from: /home/user/work/p/classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        u b = a.b(new o(o41.a.class, v.class));
        b.a(new i(new o(o41.a.class, Executor.class), 1, 0));
        b.f = v51.a.s;
        a b2 = b.b();
        u b3 = a.b(new o(o41.c.class, v.class));
        b3.a(new i(new o(o41.c.class, Executor.class), 1, 0));
        b3.f = v51.a.t;
        a b4 = b3.b();
        u b5 = a.b(new o(b.class, v.class));
        b5.a(new i(new o(b.class, Executor.class), 1, 0));
        b5.f = v51.a.u;
        a b6 = b5.b();
        u b7 = a.b(new o(d.class, v.class));
        b7.a(new i(new o(d.class, Executor.class), 1, 0));
        b7.f = v51.a.v;
        return l.r(new a[]{b2, b4, b6, b7.b()});
    }
}
