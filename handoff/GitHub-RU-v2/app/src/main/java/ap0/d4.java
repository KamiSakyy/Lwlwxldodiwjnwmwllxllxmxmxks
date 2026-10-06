package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        mr0.a c = mr0.b.c(eVar, wVar);
        if (str != null) {
            return new p3(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p3 p3Var = (p3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, p3Var.a);
        List list = mr0.b.a;
        mr0.b.d(fVar, wVar, p3Var.b);
    }
}
