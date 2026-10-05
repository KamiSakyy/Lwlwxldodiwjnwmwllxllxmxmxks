package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 implements aa.a {
    public static final k4 a = new k4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        o4 c = p4.c(eVar, wVar);
        if (str != null) {
            return new g4(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g4 g4Var = (g4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g4Var.a);
        List list = p4.a;
        p4.d(fVar, wVar, g4Var.b);
    }
}
