package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vi implements aaShadow.a {
    public static final vi a = new vi();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new kc0.hr(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.hr hrVar = (kc0.hr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hrVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, hrVar.a);
    }
}
