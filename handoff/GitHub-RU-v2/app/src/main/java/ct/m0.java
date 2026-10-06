package ct;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o("hasPreviousPage", "startCursor", "hasNextPage", "endCursor");

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
            return new h0(str, str2, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h0 h0Var = (h0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("hasPreviousPage");
        aa.b bVar = aa.c.f;
        f4.C(h0Var.a, bVar, fVar, wVar, "startCursor");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, h0Var.b);
        fVar.z0("hasNextPage");
        f4.C(h0Var.c, bVar, fVar, wVar, "endCursor");
        o0Var.b(fVar, wVar, h0Var.d);
    }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
