package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x1 implements aa.a {
    public static final x1 a = new x1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        o0 c = p0.c(eVar, wVar);
        if (str != null) {
            return new u1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u1 u1Var = (u1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u1Var.a);
        List list = p0.a;
        p0.d(fVar, wVar, u1Var.b);
    }
}
