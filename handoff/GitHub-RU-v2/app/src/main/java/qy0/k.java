package qy0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import py0.u;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.o(new String[]{"endCursor", "hasNextPage", "hasPreviousPage"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new u(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        u uVar = (u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("endCursor");
        aa.c.i.b(fVar, wVar, uVar.a);
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        f4Shadow.C(uVar.b, bVar, fVar, wVar, "hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(uVar.c));
    }
}
