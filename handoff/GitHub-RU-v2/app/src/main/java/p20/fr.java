package p20;

import java.util.List;
import u10.r30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fr implements aa.a {
    public static final fr a = new fr();
    public static final List b = sy.d0.o("__typename", "id");

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
        i50.h c = i50.k.c(eVar, wVar);
        eVar.s0();
        i80.e eVar2 = i80.e.a;
        i80.c c2 = i80.e.c(eVar, wVar);
        eVar.s0();
        i50.n c3 = i50.o.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new r30(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r30 r30Var = (r30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r30Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r30Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r30Var.b);
        List list = i50.k.a;
        i50.k.d(fVar, wVar, r30Var.c);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, r30Var.d);
        List list2 = i50.o.a;
        i50.o.d(fVar, wVar, r30Var.e);
    }
}
