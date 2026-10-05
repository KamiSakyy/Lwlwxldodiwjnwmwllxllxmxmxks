package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static t3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        nv0.f fVar = nv0.f.a;
        nv0.b c = nv0.f.c(eVar, wVar);
        eVar.s0();
        r4 r4Var = r4.a;
        l4 c2 = r4.c(eVar, wVar);
        eVar.s0();
        c c3 = d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new t3(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t3 t3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, t3Var.b);
        nv0.f fVar2 = nv0.f.a;
        nv0.f.d(fVar, wVar, t3Var.c);
        r4 r4Var = r4.a;
        r4.d(fVar, wVar, t3Var.d);
        List list = d.a;
        d.d(fVar, wVar, t3Var.e);
    }
}
