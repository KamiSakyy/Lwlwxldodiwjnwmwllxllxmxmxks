package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ff implements aaShadow.a {
    public static final ff a = new ff();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "name", "avatarUrl"});

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
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new kc0.tm(str, str2, str3, str4);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tm tmVar = (kc0.tm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tmVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tmVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, tmVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, tmVar.c);
        fVar.z0("avatarUrl");
        aa.c.i.b(fVar, wVar, tmVar.d);
    }
}
