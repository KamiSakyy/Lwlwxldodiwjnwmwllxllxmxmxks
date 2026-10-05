package wc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0.o(new String[]{"id", "abbreviatedOid", "associatedPullRequests", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        e eVar2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                eVar2 = (e) aa.c.b(aa.c.c(y.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "abbreviatedOid");
            throw null;
        }
        if (str3 != null) {
            return new h(str, str2, eVar2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h hVar = (h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("abbreviatedOid");
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("associatedPullRequests");
        aa.c.b(aa.c.c(y.a, false)).b(fVar, wVar, hVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hVar.d);
    }
}
