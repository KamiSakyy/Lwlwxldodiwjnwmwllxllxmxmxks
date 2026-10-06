package k00;

import j00.i1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0Shadow.n("getsReleases");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new i1(bool.booleanValue());
        }
        k41.b.B(eVar, "getsReleases");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("getsReleases");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(i1Var.a));
    }
}
