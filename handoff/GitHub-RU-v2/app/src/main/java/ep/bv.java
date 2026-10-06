package ep;

import java.util.List;
import jo.o80;
import jo.p80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bv implements aaShadow.a {
    public static final bv a = new bv();
    public static final List b = sy.d0Shadow.n("subscribeToCopilotLimited");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p80 p80Var = null;
        while (eVar.r0(b) == 0) {
            p80Var = (p80) aa.c.b(aa.c.c(cv.a, false)).a(eVar, wVar);
        }
        return new o80(p80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o80 o80Var = (o80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o80Var, "value");
        fVar.z0("subscribeToCopilotLimited");
        aa.c.b(aa.c.c(cv.a, false)).b(fVar, wVar, o80Var.a);
    }
}
