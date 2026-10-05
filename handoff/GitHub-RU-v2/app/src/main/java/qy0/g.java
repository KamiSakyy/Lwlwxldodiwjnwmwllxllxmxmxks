package qy0;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o(new String[]{"id", "isArchived", "isEmpty", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 == null) {
            k41.b.B(eVar, "isEmpty");
            throw null;
        }
        boolean booleanValue2 = bool2.booleanValue();
        if (str2 != null) {
            return new py0.m(str, str2, booleanValue, booleanValue2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        py0.m mVar = (py0.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("isArchived");
        aa.b bVar2 = aa.c.f;
        f4.C(mVar.b, bVar2, fVar, wVar, "isEmpty");
        f4.C(mVar.c, bVar2, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, mVar.d);
    }
}
