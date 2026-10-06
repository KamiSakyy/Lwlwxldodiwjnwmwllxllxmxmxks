package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aaShadow.a {
    public static final x a = new x();
    public static final List b = sy.d0.o("__typename", "replyTo", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.m0 m0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m0Var = (u10.m0) aa.c.b(aa.c.c(z.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        i50.u c = i50.y.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.j0(str, m0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j0 j0Var = (u10.j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j0Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(z.a, true)).b(fVar, wVar, j0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, j0Var.c);
        List list = i50.y.a;
        i50.y.d(fVar, wVar, j0Var.d);
    }
}
