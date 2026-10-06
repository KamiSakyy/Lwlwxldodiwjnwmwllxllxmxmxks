package ep;

import java.util.List;
import jo.jg0;
import jo.kg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k00 implements aaShadow.a {
    public static final k00 a = new k00();
    public static final List b = sy.d0Shadow.n("shortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jg0 jg0Var = null;
        while (eVar.r0(b) == 0) {
            jg0Var = (jg0) aa.c.b(aa.c.c(j00.a, true)).a(eVar, wVar);
        }
        return new kg0(jg0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kg0 kg0Var = (kg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kg0Var, "value");
        fVar.z0("shortcut");
        aa.c.b(aa.c.c(j00.a, true)).b(fVar, wVar, kg0Var.a);
    }
}
