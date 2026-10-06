package wc0;

import gn0.r6;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aa.a {
    public static final j2 a = new j2();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        v2 c = f3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g2(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g2 g2Var = (g2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g2Var.b);
        List list = f3.a;
        v2 v2Var = g2Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v2Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, v2Var.a);
        fVar.z0("title");
        aa.c.i.b(fVar, wVar, v2Var.b);
        fVar.z0("runNumber");
        fVar.z(v2Var.c);
        fVar.z0("eventType");
        fVar.I(v2Var.d.r);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, v2Var.e);
        fVar.z0("workflow");
        aa.c.c(e3.a, false).b(fVar, wVar, v2Var.f);
        fVar.z0("checkSuite");
        aa.c.c(x2.a, false).b(fVar, wVar, v2Var.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, v2Var.h);
    }
}
