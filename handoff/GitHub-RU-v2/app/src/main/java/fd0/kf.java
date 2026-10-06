package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kf implements aaShadow.a {
    public static final kf a = new kf();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.dn dnVar = null;
        while (eVar.r0(b) == 0) {
            dnVar = (kc0.dn) aa.c.b(aa.c.c(of.a, false)).a(eVar, wVar);
        }
        return new kc0.zm(dnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.zm zmVar = (kc0.zm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zmVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(of.a, false)).b(fVar, wVar, zmVar.a);
    }
}
