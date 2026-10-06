package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v7 implements aaShadow.a {
    public static final v7 a = new v7();
    public static final List b = sy.d0Shadow.n("enablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.vb vbVar = null;
        while (eVar.r0(b) == 0) {
            vbVar = (u10.vb) aa.c.b(aa.c.c(w7.a, false)).a(eVar, wVar);
        }
        return new u10.ub(vbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ub ubVar = (u10.ub) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ubVar, "value");
        fVar.z0("enablePullRequestAutoMerge");
        aa.c.b(aa.c.c(w7.a, false)).b(fVar, wVar, ubVar.a);
    }
}
