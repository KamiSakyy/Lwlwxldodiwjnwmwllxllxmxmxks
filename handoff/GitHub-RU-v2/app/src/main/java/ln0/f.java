package ln0;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.o(new String[]{"endCursor", "hasNextPage", "hasPreviousPage"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
            return new kn0.g(str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        kn0.g gVar = (kn0.g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("endCursor");
        aa.c.i.b(fVar, wVar, gVar.a);
        fVar.z0("hasNextPage");
        aa.b bVar = aa.c.f;
        f4.C(gVar.b, bVar, fVar, wVar, "hasPreviousPage");
        bVar.b(fVar, wVar, Boolean.valueOf(gVar.c));
    }
}
