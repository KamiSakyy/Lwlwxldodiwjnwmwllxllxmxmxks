package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n3 implements aa.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.p5 p5Var = null;
        while (eVar.r0(b) == 0) {
            p5Var = (kc0.p5) aa.c.b(aa.c.c(o3.a, true)).a(eVar, wVar);
        }
        return new kc0.o5(p5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.o5 o5Var = (kc0.o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(o3.a, true)).b(fVar, wVar, o5Var.a);
    }
}
