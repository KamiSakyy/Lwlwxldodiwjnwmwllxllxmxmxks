package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.o("endCursor", "hasNextPage");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new r0(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("endCursor");
        aa.c.i.b(fVar, wVar, r0Var.a);
        fVar.z0("hasNextPage");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(r0Var.b));
    }
}
