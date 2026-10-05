package com.google.firebase.crashlytics;

import b61.d;
import com.google.firebase.components.ComponentRegistrar;
import i4.u;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import k41.g;
import o41.a;
import o41.b;
import o41.c;
import p41.i;
import p41.o;

/* loaded from: /home/user/work/p/classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final o a = new o(a.class, ExecutorService.class);
    public final o b = new o(b.class, ExecutorService.class);
    public final o c = new o(c.class, ExecutorService.class);

    static {
        Map map = b61.c.b;
        d dVar = d.r;
        if (map.containsKey(dVar)) {
            dVar.toString();
        } else {
            map.put(dVar, new b61.a(new e81.c(true)));
            dVar.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u a = p41.a.a(r41.c.class);
        a.c = "fire-cls";
        a.a(i.a(g.class));
        a.a(i.a(q51.d.class));
        a.a(new i(this.a, 1, 0));
        a.a(new i(this.b, 1, 0));
        a.a(new i(this.c, 1, 0));
        a.a(new i(0, 2, s41.b.class));
        a.a(new i(0, 2, m41.a.class));
        a.a(new i(0, 2, z51.a.class));
        a.f = new c5.b(18, this);
        a.i(2);
        return Arrays.asList(a.b(), sy.o.c("fire-cls", "19.4.4"));
    }
}
