package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = sy.d0.n("getsLiveActivityCopilotCodingAgentV2");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new j00.c(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.c cVar = (j00.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("getsLiveActivityCopilotCodingAgentV2");
        aa.c.k.b(fVar, wVar, cVar.a);
    }
}
