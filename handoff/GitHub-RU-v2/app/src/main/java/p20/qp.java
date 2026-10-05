package p20;

import java.util.List;
import u10.f10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qp implements aa.a {
    public static final qp a = new qp();
    public static final List b = sy.d0.o("hasNextPage", "endCursor", "hasPreviousPage");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new f10(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f10 f10Var = (f10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f10Var, "value");
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        jo.f4.C(f10Var.a, bVar, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, f10Var.b);
        fVar.z0("hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(f10Var.c));
    }
}
