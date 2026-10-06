package eo0;

import java.util.List;
import jn0.t90;
import jn0.u90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uv implements aaShadow.a {
    public static final uv a = new uv();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t90 t90Var = null;
        while (eVar.r0(b) == 0) {
            t90Var = (t90) aa.c.b(aa.c.c(tv.a, true)).a(eVar, wVar);
        }
        return new u90(t90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u90 u90Var = (u90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u90Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(tv.a, true)).b(fVar, wVar, u90Var.a);
    }
}
