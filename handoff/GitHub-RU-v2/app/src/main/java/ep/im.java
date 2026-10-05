package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class im implements aa.a {
    public static final im a = new im();
    public static final List b = sy.d0.n("removeUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.jw jwVar = null;
        while (eVar.r0(b) == 0) {
            jwVar = (jo.jw) aa.c.b(aa.c.c(jm.a, false)).a(eVar, wVar);
        }
        return new jo.iw(jwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.iw iwVar = (jo.iw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iwVar, "value");
        fVar.z0("removeUpvote");
        aa.c.b(aa.c.c(jm.a, false)).b(fVar, wVar, iwVar.a);
    }
}
