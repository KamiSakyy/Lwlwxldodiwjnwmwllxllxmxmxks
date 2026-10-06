package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ti implements aaShadow.a {
    public static final ti a = new ti();
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
        fw0.q0 c = fw0.r0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.jr(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.jr jrVar = (jn0.jr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jrVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jrVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, jrVar.b);
        List list = fw0.r0.a;
        fw0.q0 q0Var = jrVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, q0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, q0Var.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, q0Var.c);
        fVar.z0("login");
        bVar2.b(fVar, wVar, q0Var.d);
        List list2 = cp0.h.a;
        cp0.h.d(fVar, wVar, q0Var.e);
    }
}
