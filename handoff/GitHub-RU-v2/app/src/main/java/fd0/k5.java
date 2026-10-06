package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k5 implements aaShadow.a {
    public static final k5 a = new k5();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new kc0.f8(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.f8 f8Var = (kc0.f8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f8Var.a);
    }
}
