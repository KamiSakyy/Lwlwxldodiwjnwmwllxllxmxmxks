package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rl implements aa.a {
    public static final rl a = new rl();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jo.hv(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hv hvVar = (jo.hv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hvVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, hvVar.a);
    }
}
