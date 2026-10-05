package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 implements aa.a {
    public static final z1 a = new z1();
    public static final List b = sy.d0.o(new String[]{"hasNextPage", "hasPreviousPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new kc0.k3(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.k3 k3Var = (kc0.k3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k3Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(k3Var.a, bVar, fVar, wVar, "hasPreviousPage");
        jo.f4.C(k3Var.b, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, k3Var.c);
    }
}
