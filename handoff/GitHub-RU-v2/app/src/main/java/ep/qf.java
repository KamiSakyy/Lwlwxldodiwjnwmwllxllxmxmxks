package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qf implements aa.a {
    public static final qf a = new qf();
    public static final List b = sy.d0.o("__typename", "name", "login", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        eq.g c = eq.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str4 != null) {
            return new jo.en(str, str2, str3, str4, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.en enVar = (jo.en) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(enVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, enVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, enVar.b);
        fVar.z0("login");
        bVar.b(fVar, wVar, enVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, enVar.d);
        List list = eq.h.a;
        eq.h.d(fVar, wVar, enVar.e);
    }
}
