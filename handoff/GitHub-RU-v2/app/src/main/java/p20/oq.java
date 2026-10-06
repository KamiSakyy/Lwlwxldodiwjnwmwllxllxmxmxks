package p20;

import java.util.List;
import u10.p20;
import u10.r20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oq implements aaShadow.a {
    public static final oq a = new oq();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p20 p20Var = null;
        while (eVar.r0(b) == 0) {
            p20Var = (p20) aa.c.b(aa.c.c(mq.a, false)).a(eVar, wVar);
        }
        return new r20(p20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r20 r20Var = (r20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r20Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(mq.a, false)).b(fVar, wVar, r20Var.a);
    }
}
