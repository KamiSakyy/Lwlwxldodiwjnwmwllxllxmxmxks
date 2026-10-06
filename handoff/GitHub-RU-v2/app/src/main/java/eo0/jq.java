package eo0;

import java.util.List;
import jn0.y10;
import jn0.z10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jq implements aaShadow.a {
    public static final jq a = new jq();
    public static final List b = sy.d0Shadow.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z10 z10Var = null;
        while (eVar.r0(b) == 0) {
            z10Var = (z10) aa.c.b(aa.c.c(kq.a, true)).a(eVar, wVar);
        }
        return new y10(z10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y10 y10Var = (y10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y10Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(kq.a, true)).b(fVar, wVar, y10Var.a);
    }
}
