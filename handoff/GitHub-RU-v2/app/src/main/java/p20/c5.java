package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 implements aaShadow.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new u10.t7(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.t7 t7Var = (u10.t7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t7Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, t7Var.a);
    }
}
