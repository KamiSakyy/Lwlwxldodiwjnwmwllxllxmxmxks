package gp;

import fp.e1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        hp.h c = hp.j.c(eVar, wVar);
        if (str != null) {
            return new e1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e1Var.a);
        List list = hp.j.a;
        hp.j.d(fVar, wVar, e1Var.b);
    }
}
