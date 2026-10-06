package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ji implements aaShadow.a {
    public static final ji a = new ji();
    public static final List b = sy.d0Shadow.n("provideCopilotCodeReviewFeedback");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fr frVar = null;
        while (eVar.r0(b) == 0) {
            frVar = (jo.fr) aa.c.b(aa.c.c(ki.a, false)).a(eVar, wVar);
        }
        return new jo.er(frVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.erShadow erVar = (jo.er) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(erVar, "value");
        fVar.z0("provideCopilotCodeReviewFeedback");
        aa.c.b(aa.c.c(ki.a, false)).b(fVar, wVar, erVar.a);
    }
}
