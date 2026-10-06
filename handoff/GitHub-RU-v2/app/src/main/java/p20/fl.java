package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fl implements aaShadow.a {
    public static final fl a = new fl();
    public static final List b = sy.d0.o("id", "gitObject", "ref", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.su suVar = null;
        u10.tu tuVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                suVar = (u10.su) aa.c.b(aa.c.c(dl.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                tuVar = (u10.tu) aa.c.b(aa.c.c(el.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.uu(str, suVar, tuVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.uu uuVar = (u10.uu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uuVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uuVar.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(dl.a, true)).b(fVar, wVar, uuVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(el.a, false)).b(fVar, wVar, uuVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uuVar.d);
    }
}
