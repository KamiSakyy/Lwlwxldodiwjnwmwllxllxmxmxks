package eo0;

import java.util.List;
import jn0.m20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tq implements aaShadow.a {
    public static final tq a = new tq();
    public static final List b = sy.d0.n("totalCount");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        while (eVar.r0(b) == 0) {
            long nextLong = eVar.nextLong();
            if (nextLong > 2147483647L) {
                while (nextLong > 2147483647L) {
                    nextLong = jo.f4.c(1, nextLong, "substring(...)");
                }
                num = Integer.valueOf((int) nextLong);
            } else {
                num = Integer.valueOf((int) nextLong);
            }
        }
        if (num != null) {
            return new m20(num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m20 m20Var = (m20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m20Var, "value");
        fVar.z0("totalCount");
        fVar.z(m20Var.a);
    }
}
