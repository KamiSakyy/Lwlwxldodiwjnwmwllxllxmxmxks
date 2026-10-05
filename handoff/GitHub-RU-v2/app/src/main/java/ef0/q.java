package ef0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0.o(new String[]{"__typename", "id", "name", "owner", "isPrivate"});

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        e eVar2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                eVar2 = (e) aa.c.c(o.a, true).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (eVar2 == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 != null) {
            return new g(str, str2, str3, eVar2, bool3.booleanValue());
        }
        k41.b.B(eVar, "isPrivate");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, gVar.c);
        fVar.z0("owner");
        aa.c.c(o.a, true).b(fVar, wVar, gVar.d);
        fVar.z0("isPrivate");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(gVar.e));
    }
}
