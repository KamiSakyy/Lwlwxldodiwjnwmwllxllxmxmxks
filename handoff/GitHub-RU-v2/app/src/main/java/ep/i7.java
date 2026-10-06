package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 implements aaShadow.a {
    public static final i7 a = new i7();
    public static final List b = sy.d0Shadow.o("owner", "name", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.wa waVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                waVar = (jo.wa) aa.c.c(g7.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (waVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.ya(waVar, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ya yaVar = (jo.ya) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yaVar, "value");
        fVar.z0("owner");
        aa.c.c(g7.a, true).b(fVar, wVar, yaVar.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yaVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, yaVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, yaVar.d);
    }
}
