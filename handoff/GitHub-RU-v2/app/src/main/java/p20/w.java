package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.j0 j0Var = null;
        while (eVar.r0(b) == 0) {
            j0Var = (u10.j0) aa.c.b(aa.c.c(x.a, true)).a(eVar, wVar);
        }
        return new u10.i0(j0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.i0 i0Var = (u10.i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(x.a, true)).b(fVar, wVar, i0Var.a);
    }
}
