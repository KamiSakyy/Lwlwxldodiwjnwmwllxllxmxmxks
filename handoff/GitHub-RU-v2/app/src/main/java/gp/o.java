package gp;

import fp.l0;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = sy.d0.o("__typename", "sessionId");

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
        hp.y c = hp.b0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new l0(str, str2, c);
        }
        k41.b.B(eVar, "sessionId");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l0 l0Var = (l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l0Var.a);
        fVar.z0("sessionId");
        bVar.b(fVar, wVar, l0Var.b);
        List list = hp.b0.a;
        hp.y yVar = l0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("sessionId");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, yVar.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, yVar.b);
        fVar.z0("state");
        fVar.I(yVar.c.r);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        aa.x xVar = sa.a;
        wVar.e(xVar).b(fVar, wVar, yVar.d);
        no.a.e(fVar, "lastUpdatedAt", wVar, xVar).b(fVar, wVar, yVar.e);
        no.a.e(fVar, "completedAt", wVar, xVar).b(fVar, wVar, yVar.f);
        fVar.z0("resource");
        aa.c.b(aa.c.c(hp.a0.a, true)).b(fVar, wVar, yVar.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, yVar.h);
    }
}
