package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 implements aa.a {
    public static final m6 a = new m6();
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
        up0.f c = up0.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.v9(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.v9 v9Var = (jn0.v9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v9Var.b);
        List list = up0.h.a;
        up0.f fVar2 = v9Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("name");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, fVar2.a);
        fVar.z0("status");
        fVar.I(fVar2.b.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, fVar2.c);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, fVar2.d);
        fVar.z0("permalink");
        bVar2.b(fVar, wVar, fVar2.e);
        fVar.z0("deployment");
        aa.c.b(aa.c.c(up0.g.a, false)).b(fVar, wVar, fVar2.f);
        fVar.z0("steps");
        aa.c.b(aa.c.c(up0.l.a, false)).b(fVar, wVar, fVar2.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, fVar2.h);
    }
}
