package ep;

import java.util.List;
import jo.ab0;
import jo.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tw implements aa.a {
    public static final tw a = new tw();
    public static final List b = sy.d0.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ya0 ya0Var = null;
        while (eVar.r0(b) == 0) {
            ya0Var = (ya0) aa.c.b(aa.c.c(rw.a, false)).a(eVar, wVar);
        }
        return new ab0(ya0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ab0 ab0Var = (ab0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ab0Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(rw.a, false)).b(fVar, wVar, ab0Var.a);
    }
}
