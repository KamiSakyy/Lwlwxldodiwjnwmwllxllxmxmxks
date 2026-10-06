package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l9 implements aaShadow.a {
    public static final l9 a = new l9();
    public static final List b = sy.d0Shadow.o(new String[]{"feed", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ge geVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                geVar = (jn0.ge) aa.c.c(n9.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (geVar == null) {
            k41.b.B(eVar, "feed");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ee(geVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ee eeVar = (jn0.ee) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eeVar, "value");
        fVar.z0("feed");
        aa.c.c(n9.a, false).b(fVar, wVar, eeVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eeVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eeVar.c);
    }
}
