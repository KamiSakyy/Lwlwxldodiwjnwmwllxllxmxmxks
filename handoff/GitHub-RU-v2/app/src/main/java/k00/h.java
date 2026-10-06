package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = sy.d0Shadow.n("getsAssignments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new j00.m(bool.booleanValue());
        }
        k41.b.B(eVar, "getsAssignments");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.m mVar = (j00.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("getsAssignments");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(mVar.a));
    }
}
