package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 implements aaShadow.a {
    public static final h5 a = new h5();
    public static final List b = sy.d0Shadow.n("deleteRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.f8 f8Var = null;
        while (eVar.r0(b) == 0) {
            f8Var = (u10.f8) aa.c.b(aa.c.c(i5.a, false)).a(eVar, wVar);
        }
        return new u10.e8(f8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.e8 e8Var = (u10.e8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e8Var, "value");
        fVar.z0("deleteRef");
        aa.c.b(aa.c.c(i5.a, false)).b(fVar, wVar, e8Var.a);
    }
}
