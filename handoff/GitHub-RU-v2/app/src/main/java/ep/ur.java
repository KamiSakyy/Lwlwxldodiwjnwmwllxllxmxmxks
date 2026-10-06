package ep;

import java.util.List;
import jo.y30;
import jo.z30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ur implements aaShadow.a {
    public static final ur a = new ur();
    public static final List b = sy.d0.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z30 z30Var = null;
        while (eVar.r0(b) == 0) {
            z30Var = (z30) aa.c.b(aa.c.c(vr.a, true)).a(eVar, wVar);
        }
        return new y30(z30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y30 y30Var = (y30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y30Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(vr.a, true)).b(fVar, wVar, y30Var.a);
    }
}
