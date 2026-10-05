package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        ow0.g0 g0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            g0Var = x.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (str2 != null) {
            return new ow0.e0(str, str2, g0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.e0 e0Var = (ow0.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e0Var.b);
        ow0.g0 g0Var = e0Var.c;
        if (g0Var != null) {
            x.d(fVar, wVar, g0Var);
        }
    }
}
