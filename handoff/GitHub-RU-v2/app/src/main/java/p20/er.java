package p20;

import java.util.List;
import u10.o30;
import u10.p30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class er implements aaShadow.a {
    public static final er a = new er();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o30 o30Var = null;
        while (eVar.r0(b) == 0) {
            o30Var = (o30) aa.c.b(aa.c.c(dr.a, true)).a(eVar, wVar);
        }
        return new p30(o30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p30 p30Var = (p30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p30Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(dr.a, true)).b(fVar, wVar, p30Var.a);
    }
}
