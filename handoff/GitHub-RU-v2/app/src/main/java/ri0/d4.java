package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0.o(new String[]{"hasPreviousPage", "startCursor", "hasNextPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasPreviousPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new z3(str, str2, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z3 z3Var = (z3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("hasPreviousPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(z3Var.a, bVar, fVar, wVar, "startCursor");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, z3Var.b);
        fVar.z0("hasNextPage");
        jo.f4.C(z3Var.c, bVar, fVar, wVar, "endCursor");
        o0Var.b(fVar, wVar, z3Var.d);
    }
}
