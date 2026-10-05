package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 implements aa.a {
    public static final f6 a = new f6();
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
        xt0.z7 c = xt0.d8.c(eVar, wVar);
        eVar.s0();
        xt0.z zVar = xt0.z.a;
        xt0.v c2 = xt0.z.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.m9(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.m9 m9Var = (jn0.m9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m9Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m9Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m9Var.b);
        List list = xt0.d8.a;
        xt0.d8.d(fVar, wVar, m9Var.c);
        xt0.z zVar = xt0.z.a;
        xt0.z.d(fVar, wVar, m9Var.d);
    }
}
