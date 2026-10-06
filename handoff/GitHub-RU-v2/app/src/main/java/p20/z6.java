package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z6 implements aaShadow.a {
    public static final z6 a = new z6();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.oa oaVar = null;
        while (eVar.r0(b) == 0) {
            oaVar = (u10.oa) aa.c.b(aa.c.c(b7.a, false)).a(eVar, wVar);
        }
        return new u10.ma(oaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ma maVar = (u10.ma) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(maVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(b7.a, false)).b(fVar, wVar, maVar.a);
    }
}
