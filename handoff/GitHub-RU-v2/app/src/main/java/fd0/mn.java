package fd0;

import java.util.List;
import kc0.ey;
import kc0.fy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mn implements aa.a {
    public static final mn a = new mn();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fy fyVar = null;
        while (eVar.r0(b) == 0) {
            fyVar = (fy) aa.c.b(aa.c.c(nn.a, true)).a(eVar, wVar);
        }
        return new ey(fyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ey eyVar = (ey) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eyVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(nn.a, true)).b(fVar, wVar, eyVar.a);
    }
}
