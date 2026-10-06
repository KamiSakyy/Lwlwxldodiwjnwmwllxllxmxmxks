package e00;

import d00.b0;
import d00.e0;
import f00.c0;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = d0Shadow.o("__typename", "item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b0 b0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                b0Var = (b0) aa.c.b(aa.c.c(u.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        f00.b0 c = c0.c(eVar, wVar);
        if (str != null) {
            return new e0(str, b0Var, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e0 e0Var = (e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e0Var.a);
        fVar.z0("item");
        aa.c.b(aa.c.c(u.a, true)).b(fVar, wVar, e0Var.b);
        List list = c0.a;
        c0.d(fVar, wVar, e0Var.c);
    }
}
