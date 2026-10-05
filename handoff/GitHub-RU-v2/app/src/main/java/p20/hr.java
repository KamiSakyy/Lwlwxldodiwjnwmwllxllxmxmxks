package p20;

import java.util.List;
import u10.r30;
import u10.u30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hr implements aa.a {
    public static final hr a = new hr();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r30 r30Var = null;
        while (eVar.r0(b) == 0) {
            r30Var = (r30) aa.c.b(aa.c.c(fr.a, true)).a(eVar, wVar);
        }
        return new u30(r30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u30 u30Var = (u30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u30Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(fr.a, true)).b(fVar, wVar, u30Var.a);
    }
}
