package p20;

import java.util.List;
import u10.o40;
import u10.u40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tr implements aaShadow.a {
    public static final tr a = new tr();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u40 u40Var = null;
        while (eVar.r0(b) == 0) {
            u40Var = (u40) aa.c.b(aa.c.c(zr.a, false)).a(eVar, wVar);
        }
        return new o40(u40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o40 o40Var = (o40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o40Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(zr.a, false)).b(fVar, wVar, o40Var.a);
    }
}
