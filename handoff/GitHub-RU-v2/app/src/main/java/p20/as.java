package p20;

import java.util.List;
import u10.x40;
import u10.z40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class as implements aaShadow.a {
    public static final as a = new as();
    public static final List b = sy.d0.n("updateIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z40 z40Var = null;
        while (eVar.r0(b) == 0) {
            z40Var = (z40) aa.c.b(aa.c.c(cs.a, false)).a(eVar, wVar);
        }
        return new x40(z40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x40 x40Var = (x40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x40Var, "value");
        fVar.z0("updateIssue");
        aa.c.b(aa.c.c(cs.a, false)).b(fVar, wVar, x40Var.a);
    }
}
