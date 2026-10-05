package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "login", "name", "avatarUrl", "__typename"});

    public static j c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "avatarUrl");
            throw null;
        }
        if (str5 != null) {
            return new j(str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, jVar.c);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, jVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jVar.e);
    }
}
