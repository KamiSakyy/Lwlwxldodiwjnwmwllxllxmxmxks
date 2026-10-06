package xx;

import aa.c;
import aa.o0;
import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"endCursor", "hasNextPage", "hasPreviousPage", "startCursor"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) c.i.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasNextPage");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new a(str, str2, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasPreviousPage");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("endCursor");
        o0 o0Var = c.i;
        o0Var.b(fVar, wVar, aVar.a);
        fVar.z0("hasNextPage");
        aa.b bVar = c.f;
        f4Shadow.C(aVar.b, bVar, fVar, wVar, "hasPreviousPage");
        f4Shadow.C(aVar.c, bVar, fVar, wVar, "startCursor");
        o0Var.b(fVar, wVar, aVar.d);
    }
}
