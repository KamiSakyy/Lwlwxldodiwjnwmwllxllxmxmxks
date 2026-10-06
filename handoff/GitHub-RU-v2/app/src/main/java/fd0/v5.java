package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 implements aaShadow.a {
    public static final v5 a = new v5();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d9 d9Var = null;
        while (eVar.r0(b) == 0) {
            d9Var = (kc0.d9) aa.c.b(aa.c.c(a6.a, true)).a(eVar, wVar);
        }
        return new kc0.y8(d9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.y8 y8Var = (kc0.y8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y8Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(a6.a, true)).b(fVar, wVar, y8Var.a);
    }
}
