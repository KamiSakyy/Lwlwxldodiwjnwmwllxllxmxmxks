package tz;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 implements aa.a {
    public static final l4 a = new l4();
    public static final List b = sy.d0Shadow.o("duration", "completedIterations", "iterations");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                arrayList = aa.c.a(aa.c.c(k4.a, true)).c(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                arrayList2 = aa.c.a(aa.c.c(m4.a, true)).c(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "duration");
            throw null;
        }
        int intValue = num.intValue();
        if (arrayList == null) {
            k41.b.B(eVar, "completedIterations");
            throw null;
        }
        if (arrayList2 != null) {
            return new h4(intValue, arrayList, arrayList2);
        }
        k41.b.B(eVar, "iterations");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h4 h4Var = (h4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h4Var, "value");
        fVar.z0("duration");
        fVar.z(h4Var.a);
        fVar.z0("completedIterations");
        aa.c.a(aa.c.c(k4.a, true)).e(fVar, wVar, h4Var.b);
        fVar.z0("iterations");
        aa.c.a(aa.c.c(m4.a, true)).e(fVar, wVar, h4Var.c);
    }
}
