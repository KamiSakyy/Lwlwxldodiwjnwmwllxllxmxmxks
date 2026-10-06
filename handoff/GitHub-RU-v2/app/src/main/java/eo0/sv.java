package eo0;

import java.util.List;
import jn0.s90;
import jn0.u90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sv implements aaShadow.a {
    public static final sv a = new sv();
    public static final List b = sy.d0Shadow.n("updateDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u90 u90Var = null;
        while (eVar.r0(b) == 0) {
            u90Var = (u90) aa.c.b(aa.c.c(uv.a, false)).a(eVar, wVar);
        }
        return new s90(u90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s90 s90Var = (s90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s90Var, "value");
        fVar.z0("updateDiscussion");
        aa.c.b(aa.c.c(uv.a, false)).b(fVar, wVar, s90Var.a);
    }
}
