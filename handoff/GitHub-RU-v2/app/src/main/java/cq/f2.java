package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 implements aa.a {
    public static final f2 a = new f2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        w0 c = x0.c(eVar, wVar);
        if (str != null) {
            return new c2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c2 c2Var = (c2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c2Var.a);
        List list = x0.a;
        x0.d(fVar, wVar, c2Var.b);
    }
}
