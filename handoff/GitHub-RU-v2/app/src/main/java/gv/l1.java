package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.a {
    public static final l1 a = new l1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        u c = v.c(eVar, wVar);
        if (str != null) {
            return new r0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, r0Var.a);
        List list = v.a;
        v.d(fVar, wVar, r0Var.b);
    }
}
