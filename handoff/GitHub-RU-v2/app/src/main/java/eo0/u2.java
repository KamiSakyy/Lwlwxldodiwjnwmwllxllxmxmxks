package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u2 implements aaShadow.a {
    public static final u2 a = new u2();
    public static final List b = sy.d0.o(new String[]{"hasNextPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new jn0.l4(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.l4 l4Var = (jn0.l4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(l4Var.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, l4Var.b);
    }
}
