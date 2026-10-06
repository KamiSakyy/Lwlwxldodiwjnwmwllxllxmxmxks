package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yi implements aaShadow.a {
    public static final yi a = new yi();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.yr yrVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReview"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            yrVar = zi.c(eVar, wVar);
        } else {
            yrVar = null;
        }
        if (str2 != null) {
            return new jo.xr(str, str2, yrVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xr xrVar = (jo.xr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xrVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xrVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xrVar.b);
        jo.yr yrVar = xrVar.c;
        if (yrVar != null) {
            zi.d(fVar, wVar, yrVar);
        }
    }
}
