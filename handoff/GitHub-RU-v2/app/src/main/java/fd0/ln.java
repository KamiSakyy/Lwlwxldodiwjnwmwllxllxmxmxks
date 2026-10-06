package fd0;

import java.util.List;
import kc0.ay;
import kc0.zx;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ln implements aaShadow.a {
    public static final ln a = new ln();
    public static final List b = sy.d0.o(new String[]{"owner", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zx zxVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                zxVar = (zx) aa.c.c(kn.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (zxVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ay(zxVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ay ayVar = (ay) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ayVar, "value");
        fVar.z0("owner");
        aa.c.c(kn.a, true).b(fVar, wVar, ayVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ayVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ayVar.c);
    }
}
