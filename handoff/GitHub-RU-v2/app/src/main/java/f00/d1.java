package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d1 implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static v0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        y c = z.c(eVar, wVar);
        if (str != null) {
            return new v0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, v0Var.a);
        List list = z.a;
        z.d(fVar, wVar, v0Var.b);
    }
}
