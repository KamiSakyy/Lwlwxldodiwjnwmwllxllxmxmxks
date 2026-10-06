package o40;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0Shadow.o("__typename", "id", "name", "owner", "isPrivate");

    public final Object a(ea.e eVar, w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        d dVar = null;
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
                dVar = (d) aa.c.c(n.a, true).a(eVar, wVar);
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
        if (dVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 != null) {
            return new f(str, str2, str3, dVar, bool3.booleanValue());
        }
        k41.b.B(eVar, "isPrivate");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f fVar2 = (f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fVar2.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, fVar2.c);
        fVar.z0("owner");
        aa.c.c(n.a, true).b(fVar, wVar, fVar2.d);
        fVar.z0("isPrivate");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(fVar2.e));
    }
}
