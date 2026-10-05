package zx0;

import aa.w;
import java.util.List;
import yx0.z;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "groups"});

    public static z c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        yx0.w wVar2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                wVar2 = (yx0.w) aa.c.c(p.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (wVar2 != null) {
            return new z(str, wVar2);
        }
        k41.b.B(eVar, "groups");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, z zVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, zVar.a);
        fVar.z0("groups");
        aa.c.c(p.a, false).b(fVar, wVar, zVar.b);
    }
}
