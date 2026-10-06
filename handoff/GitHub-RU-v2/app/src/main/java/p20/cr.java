package p20;

import java.util.List;
import u10.n30;
import u10.p30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cr implements aaShadow.a {
    public static final cr a = new cr();
    public static final List b = sy.d0Shadow.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p30 p30Var = null;
        while (eVar.r0(b) == 0) {
            p30Var = (p30) aa.c.b(aa.c.c(er.a, false)).a(eVar, wVar);
        }
        return new n30(p30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n30 n30Var = (n30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n30Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(er.a, false)).b(fVar, wVar, n30Var.a);
    }
}
