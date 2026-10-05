package uf0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.a {
    public static final q0 a = new q0();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "replyTo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        n0 n0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                n0Var = (n0) aa.c.b(aa.c.c(y0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        yf0.i c = yf0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g0(str, str2, n0Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, g0Var.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(y0.a, false)).b(fVar, wVar, g0Var.c);
        List list = yf0.l.a;
        yf0.l.d(fVar, wVar, g0Var.d);
    }
}
