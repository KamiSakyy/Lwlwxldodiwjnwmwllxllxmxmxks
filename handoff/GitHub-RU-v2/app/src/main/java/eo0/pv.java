package eo0;

import java.util.List;
import jn0.m90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pv implements aa.a {
    public static final pv a = new pv();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        er0.i c = er0.l.c(eVar, wVar);
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c2 = gu0.f.c(eVar, wVar);
        eVar.s0();
        er0.o c3 = er0.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new m90(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m90 m90Var = (m90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m90Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m90Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m90Var.b);
        List list = er0.l.a;
        er0.l.d(fVar, wVar, m90Var.c);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, m90Var.d);
        List list2 = er0.p.a;
        er0.p.d(fVar, wVar, m90Var.e);
    }
}
