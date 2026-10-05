package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        tz.h c = tz.j.c(eVar, wVar);
        if (str != null) {
            return new s0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s0 s0Var = (s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s0Var.a);
        List list = tz.j.a;
        tz.j.d(fVar, wVar, s0Var.b);
    }
}
