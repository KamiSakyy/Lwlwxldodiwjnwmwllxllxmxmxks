package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0.o(new String[]{"about", "name", "url"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "about");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 != null) {
            return new i(str, str2, str3);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i iVar = (i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("about");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, iVar.c);
    }
}
