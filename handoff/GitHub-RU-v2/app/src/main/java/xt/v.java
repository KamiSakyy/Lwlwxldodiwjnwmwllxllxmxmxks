package xt;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = d0.o("owner", "name", "isPrivate", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        i iVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                iVar = (i) aa.c.c(u.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (iVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isPrivate");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new j(iVar, str, booleanValue, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        j jVar = (j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("owner");
        aa.c.c(u.a, false).b(fVar, wVar, jVar.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("isPrivate");
        f4.C(jVar.c, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, jVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, jVar.e);
    }
}
