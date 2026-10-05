package gw;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o("__typename", "id", "name", "owner", "isPrivate");

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        a aVar = null;
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
                aVar = (a) aa.c.c(e.a, true).a(eVar, wVar);
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
        if (aVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 != null) {
            return new b(str, str2, str3, aVar, bool3.booleanValue());
        }
        k41.b.B(eVar, "isPrivate");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("name");
        bVar2.b(fVar, wVar, bVar.c);
        fVar.z0("owner");
        aa.c.c(e.a, true).b(fVar, wVar, bVar.d);
        fVar.z0("isPrivate");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(bVar.e));
    }

}
