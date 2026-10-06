package p20;

import java.util.List;
import u10.x30;
import u10.z30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ir implements aaShadow.a {
    public static final ir a = new ir();
    public static final List b = sy.d0.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z30 z30Var = null;
        while (eVar.r0(b) == 0) {
            z30Var = (z30) aa.c.b(aa.c.c(kr.a, false)).a(eVar, wVar);
        }
        return new x30(z30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x30 x30Var = (x30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x30Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(kr.a, false)).b(fVar, wVar, x30Var.a);
    }
}
