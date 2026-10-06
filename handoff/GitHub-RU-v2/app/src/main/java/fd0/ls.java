package fd0;

import java.util.List;
import kc0.h50;
import kc0.i50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ls implements aaShadow.a {
    public static final ls a = new ls();
    public static final List b = sy.d0.o(new String[]{"__typename", "subscribable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h50 h50Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                h50Var = (h50) aa.c.b(aa.c.c(ks.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new i50(str, h50Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i50 i50Var = (i50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i50Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i50Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(ks.a, true)).b(fVar, wVar, i50Var.b);
    }
}
