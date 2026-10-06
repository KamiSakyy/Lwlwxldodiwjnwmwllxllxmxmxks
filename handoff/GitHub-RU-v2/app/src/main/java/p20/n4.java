package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 implements aaShadow.a {
    public static final n4 a = new n4();
    public static final List b = sy.d0Shadow.n("dashboard");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.b7 b7Var = null;
        while (eVar.r0(b) == 0) {
            b7Var = (u10.b7) aa.c.b(aa.c.c(o4.a, false)).a(eVar, wVar);
        }
        return new u10.a7(b7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.a7 a7Var = (u10.a7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a7Var, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(o4.a, false)).b(fVar, wVar, a7Var.a);
    }
}
