package ep;

import java.util.List;
import jo.p80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cv implements aaShadow.a {
    public static final cv a = new cv();
    public static final List b = sy.d0Shadow.n("subscribed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new p80(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p80 p80Var = (p80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p80Var, "value");
        fVar.z0("subscribed");
        aa.c.k.b(fVar, wVar, p80Var.a);
    }
}
