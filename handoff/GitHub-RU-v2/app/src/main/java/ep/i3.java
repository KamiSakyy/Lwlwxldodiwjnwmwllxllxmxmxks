package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 implements aaShadow.a {
    public static final i3 a = new i3();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j5 j5Var = null;
        while (eVar.r0(b) == 0) {
            j5Var = (jo.j5) aa.c.b(aa.c.c(l3.a, true)).a(eVar, wVar);
        }
        return new jo.f5(j5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f5 f5Var = (jo.f5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f5Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(l3.a, true)).b(fVar, wVar, f5Var.a);
    }
}
