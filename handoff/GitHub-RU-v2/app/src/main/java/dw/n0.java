package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0.o("__typename", "id", "author");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        g0 g0Var = null;
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
                g0Var = (g0) aa.c.b(aa.c.c(l0.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        pu.a c = pu.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new i0(str, str2, g0Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i0 i0Var = (i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, i0Var.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(l0.a, true)).b(fVar, wVar, i0Var.c);
        List list = pu.b.a;
        pu.b.d(fVar, wVar, i0Var.d);
    }
}
