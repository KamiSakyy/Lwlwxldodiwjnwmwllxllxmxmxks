package fd0;

import java.util.List;
import kc0.xy;
import kc0.zy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zn implements aa.a {
    public static final zn a = new zn();
    public static final List b = sy.d0.o(new String[]{"issue", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xy xyVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xyVar = (xy) aa.c.c(xn.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (xyVar == null) {
            k41.b.B(eVar, "issue");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new zy(xyVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zy zyVar = (zy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zyVar, "value");
        fVar.z0("issue");
        aa.c.c(xn.a, true).b(fVar, wVar, zyVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zyVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, zyVar.c);
    }
}
