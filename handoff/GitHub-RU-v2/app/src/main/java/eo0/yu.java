package eo0;

import java.util.List;
import jn0.k80;
import jn0.m80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yu implements aaShadow.a {
    public static final yu a = new yu();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k80 k80Var = null;
        while (eVar.r0(b) == 0) {
            k80Var = (k80) aa.c.b(aa.c.c(wu.a, false)).a(eVar, wVar);
        }
        return new m80(k80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m80 m80Var = (m80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m80Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(wu.a, false)).b(fVar, wVar, m80Var.a);
    }
}
