package p20;

import java.util.List;
import u10.h40;
import u10.j40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class or implements aaShadow.a {
    public static final or a = new or();
    public static final List b = sy.d0Shadow.n("updateIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j40 j40Var = null;
        while (eVar.r0(b) == 0) {
            j40Var = (j40) aa.c.b(aa.c.c(qr.a, false)).a(eVar, wVar);
        }
        return new h40(j40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h40 h40Var = (h40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h40Var, "value");
        fVar.z0("updateIssueComment");
        aa.c.b(aa.c.c(qr.a, false)).b(fVar, wVar, h40Var.a);
    }
}
