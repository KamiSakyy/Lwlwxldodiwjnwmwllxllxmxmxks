package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements aa.a {
    public static final i2 a = new i2();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.b4 b4Var = null;
        while (eVar.r0(b) == 0) {
            b4Var = (kc0.b4) aa.c.b(aa.c.c(m2.a, true)).a(eVar, wVar);
        }
        return new kc0.x3(b4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.x3 x3Var = (kc0.x3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x3Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(m2.a, true)).b(fVar, wVar, x3Var.a);
    }
}
