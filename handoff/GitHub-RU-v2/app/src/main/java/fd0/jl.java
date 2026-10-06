package fd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jl implements aaShadow.a {
    public static final jl a = new jl();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.ru ruVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        kc0.qu quVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            ruVar = el.c(eVar, wVar);
        } else {
            ruVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            quVar = dl.c(eVar, wVar);
        }
        return new kc0.wu(str, ruVar, quVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wu wuVar = (kc0.wu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wuVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, wuVar.a);
        kc0.ru ruVar = wuVar.b;
        if (ruVar != null) {
            el.d(fVar, wVar, ruVar);
        }
        kc0.qu quVar = wuVar.c;
        if (quVar != null) {
            dl.d(fVar, wVar, quVar);
        }
    }
}
