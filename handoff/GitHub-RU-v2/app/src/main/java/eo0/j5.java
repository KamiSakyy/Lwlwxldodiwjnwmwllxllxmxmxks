package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 implements aaShadow.a {
    public static final j5 a = new j5();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
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
        eVar.s0();
        jv0.t c = jv0.n0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.c8(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c8 c8Var = (jn0.c8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, c8Var.b);
        List list = jv0.n0.a;
        jv0.n0.d(fVar, wVar, c8Var.c);
    }
}
