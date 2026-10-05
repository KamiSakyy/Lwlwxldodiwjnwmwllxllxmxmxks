package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e7 implements aa.a {
    public static final e7 a = new e7();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        a50.a c = a50.b.c(eVar, wVar);
        if (str != null) {
            return new z6(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z6 z6Var = (z6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z6Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, z6Var.a);
        List list = a50.b.a;
        a50.b.d(fVar, wVar, z6Var.b);
    }
}
