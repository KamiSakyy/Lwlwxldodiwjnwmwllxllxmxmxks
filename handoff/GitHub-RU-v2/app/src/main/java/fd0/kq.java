package fd0;

import java.util.List;
import kc0.i20;
import kc0.j20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kq implements aaShadow.a {
    public static final kq a = new kq();
    public static final List b = sy.d0.o(new String[]{"__typename", "subscribable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        i20 i20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                i20Var = (i20) aa.c.b(aa.c.c(jq.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new j20(str, i20Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j20 j20Var = (j20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j20Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, j20Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(jq.a, true)).b(fVar, wVar, j20Var.b);
    }
}
