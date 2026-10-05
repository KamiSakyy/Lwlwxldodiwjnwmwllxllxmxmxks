package a40;

import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = d0.o("id", "name", "isPrivate", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        h hVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                hVar = (h) aa.c.c(v.a, false).a(eVar, wVar);
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
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isPrivate");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (hVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new k(str, str2, booleanValue, hVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, kVar.b);
        fVar.z0("isPrivate");
        f4.C(kVar.c, aa.c.f, fVar, wVar, "owner");
        aa.c.c(v.a, false).b(fVar, wVar, kVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kVar.e);
    }
}
