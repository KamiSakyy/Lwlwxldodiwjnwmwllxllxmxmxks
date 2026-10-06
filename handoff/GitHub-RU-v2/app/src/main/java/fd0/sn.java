package fd0;

import java.util.List;
import kc0.ny;
import kc0.oy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sn implements aaShadow.a {
    public static final sn a = new sn();
    public static final List b = sy.d0.o(new String[]{"readme", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ny nyVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nyVar = (ny) aa.c.b(aa.c.c(rn.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new oy(nyVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oy oyVar = (oy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oyVar, "value");
        fVar.z0("readme");
        aa.c.b(aa.c.c(rn.a, false)).b(fVar, wVar, oyVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oyVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oyVar.c);
    }
}
