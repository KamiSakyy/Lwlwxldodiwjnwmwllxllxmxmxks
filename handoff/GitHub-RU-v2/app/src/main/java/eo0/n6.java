package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n6 implements aaShadow.a {
    public static final n6 a = new n6();
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
        xt0.e c = xt0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.w9(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.w9 w9Var = (jn0.w9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, w9Var.b);
        List list = xt0.f.a;
        xt0.e eVar = w9Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, eVar.a);
        fVar.z0("lastEditedAt");
        pz0.o7.Companion.getClass();
        aa.c.b(wVar.e(pz0.o7.a)).b(fVar, wVar, eVar.b);
        fVar.z0("state");
        fVar.I(eVar.c.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, eVar.d);
        xt0.d3 d3Var = xt0.d3.a;
        xt0.d3.d(fVar, wVar, eVar.e);
    }
}
