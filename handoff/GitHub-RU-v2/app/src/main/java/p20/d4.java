package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4 implements aaShadow.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0Shadow.n("createIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.j6 j6Var = null;
        while (eVar.r0(b) == 0) {
            j6Var = (u10.j6) aa.c.b(aa.c.c(c4.a, false)).a(eVar, wVar);
        }
        return new u10.k6(j6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.k6 k6Var = (u10.k6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k6Var, "value");
        fVar.z0("createIssue");
        aa.c.b(aa.c.c(c4.a, false)).b(fVar, wVar, k6Var.a);
    }
}
