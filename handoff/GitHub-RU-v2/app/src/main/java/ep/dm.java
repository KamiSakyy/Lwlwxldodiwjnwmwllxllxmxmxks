package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dm implements aaShadow.a {
    public static final dm a = new dm();
    public static final List b = sy.d0.o("__typename", "id", "url", "parent");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        jo.dwShadow dwVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                dwVar = (jo.dw) aa.c.b(aa.c.c(fm.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        dw.e6 c = dw.n6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.bw(str, str2, str3, dwVar, c);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.bw bwVar = (jo.bw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bwVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bwVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bwVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, bwVar.c);
        fVar.z0("parent");
        aa.c.b(aa.c.c(fm.a, true)).b(fVar, wVar, bwVar.d);
        List list = dw.n6.a;
        dw.n6.d(fVar, wVar, bwVar.e);
    }
}
