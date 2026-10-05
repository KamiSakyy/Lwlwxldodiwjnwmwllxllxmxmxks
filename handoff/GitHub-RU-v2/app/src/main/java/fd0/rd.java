package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rd implements aa.a {
    public static final rd a = new rd();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ok okVar = null;
        while (eVar.r0(b) == 0) {
            okVar = (kc0.ok) aa.c.b(aa.c.c(sd.a, true)).a(eVar, wVar);
        }
        return new kc0.nk(okVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nk nkVar = (kc0.nk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nkVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(sd.a, true)).b(fVar, wVar, nkVar.a);
    }
}
