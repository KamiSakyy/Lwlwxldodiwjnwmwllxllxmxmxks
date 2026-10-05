package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 implements aa.a {
    public static final o2 a = new o2();
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
        gs0.a c = gs0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new t1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t1 t1Var = (t1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, t1Var.b);
        List list = gs0.b.a;
        gs0.a aVar = t1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("name");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aVar.a);
        fVar.z0("spdxId");
        aa.c.i.b(fVar, wVar, aVar.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, aVar.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, aVar.d);
    }
}
