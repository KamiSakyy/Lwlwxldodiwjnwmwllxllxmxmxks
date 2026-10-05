package qs0;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "teamName", "teamLogin", "teamAvatarUrl", "id"});

    public static b c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "teamName");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "teamLogin");
            throw null;
        }
        if (str5 != null) {
            return new b(str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("teamName");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("teamLogin");
        bVar2.b(fVar, wVar, bVar.c);
        fVar.z0("teamAvatarUrl");
        aa.c.i.b(fVar, wVar, bVar.d);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.e);
    }
}
