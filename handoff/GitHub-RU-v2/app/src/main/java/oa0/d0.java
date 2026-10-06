package oa0;

import java.util.List;
import na0.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static m0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        w50.xShadow c = w50.y.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new m0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m0 m0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m0Var.b);
        List list = w50.y.a;
        w50.xShadow xVar = m0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, xVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, xVar.b);
        fVar.z0("timelineItems");
        aa.c.c(w50.b0.a, false).b(fVar, wVar, xVar.c);
    }
}
