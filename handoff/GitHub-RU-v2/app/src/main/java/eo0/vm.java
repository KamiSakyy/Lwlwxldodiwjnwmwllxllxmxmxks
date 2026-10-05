package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vm implements aa.a {
    public static final vm a = new vm();
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
        uu0.k3 c = uu0.r3.c(eVar, wVar);
        eVar.s0();
        uu0.o c2 = uu0.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.yw(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yw ywVar = (jn0.yw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ywVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ywVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ywVar.b);
        List list = uu0.r3.a;
        uu0.r3.d(fVar, wVar, ywVar.c);
        List list2 = uu0.t.a;
        uu0.t.d(fVar, wVar, ywVar.d);
    }
}
