package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 implements aaShadow.a {
    public static final m3 a = new m3();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.o5 o5Var = null;
        while (eVar.r0(b) == 0) {
            o5Var = (jo.o5) aa.c.b(aa.c.c(o3.a, false)).a(eVar, wVar);
        }
        return new jo.l5(o5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l5 l5Var = (jo.l5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l5Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(o3.a, false)).b(fVar, wVar, l5Var.a);
    }
}
