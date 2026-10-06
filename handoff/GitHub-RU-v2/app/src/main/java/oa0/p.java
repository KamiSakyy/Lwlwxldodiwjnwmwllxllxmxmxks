package oa0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        na0.a0Shadow a0Var = null;
        while (eVar.r0(b) == 0) {
            a0Var = (na0.a0Shadow) aa.c.b(aa.c.c(t.a, true)).a(eVar, wVar);
        }
        return new na0.w(a0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.w wVar2 = (na0.w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(t.a, true)).b(fVar, wVar, wVar2.a);
    }
}
