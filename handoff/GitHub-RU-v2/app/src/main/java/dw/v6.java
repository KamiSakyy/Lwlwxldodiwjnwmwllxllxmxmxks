package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v6 implements aa.a {
    public static final v6 a = new v6();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        xx.a c = xx.b.c(eVar, wVar);
        if (str != null) {
            return new p6(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p6 p6Var = (p6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p6Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, p6Var.a);
        List list = xx.b.a;
        xx.b.d(fVar, wVar, p6Var.b);
    }
}
