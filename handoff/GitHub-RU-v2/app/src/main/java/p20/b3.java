package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b3 implements aaShadow.a {
    public static final b3 a = new b3();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.y4 y4Var = null;
        while (eVar.r0(b) == 0) {
            y4Var = (u10.y4) aa.c.b(aa.c.c(d3.a, false)).a(eVar, wVar);
        }
        return new u10.v4(y4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.v4 v4Var = (u10.v4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v4Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(d3.a, false)).b(fVar, wVar, v4Var.a);
    }
}
