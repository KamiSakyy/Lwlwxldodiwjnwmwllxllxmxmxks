package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zk implements aaShadow.a {
    public static final zk a = new zk();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ou ouVar = null;
        while (eVar.r0(b) == 0) {
            ouVar = (u10.ou) aa.c.b(aa.c.c(bl.a, false)).a(eVar, wVar);
        }
        return new u10.mu(ouVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mu muVar = (u10.mu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(muVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(bl.a, false)).b(fVar, wVar, muVar.a);
    }
}
