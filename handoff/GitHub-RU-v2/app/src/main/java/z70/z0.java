package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.n("__typename");

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
            return new f0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f0 f0Var = (f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f0Var.a);
        List list = a50.b.a;
        a50.b.d(fVar, wVar, f0Var.b);
    }
}
