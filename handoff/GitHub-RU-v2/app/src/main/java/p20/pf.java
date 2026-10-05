package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pf implements aa.a {
    public static final pf a = new pf();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.fn fnVar;
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
            fnVar = qf.c(eVar, wVar);
        } else {
            fnVar = null;
        }
        if (str2 != null) {
            return new u10.en(str, str2, fnVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.en enVar = (u10.en) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(enVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, enVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, enVar.b);
        u10.fn fnVar = enVar.c;
        if (fnVar != null) {
            qf.d(fVar, wVar, fnVar);
        }
    }
}
