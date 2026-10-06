package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma implements aaShadow.a {
    public static final ma a = new ma();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.rf rfVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            rfVar = na.c(eVar, wVar);
        } else {
            rfVar = null;
        }
        if (str2 != null) {
            return new jn0.qf(str, str2, rfVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qf qfVar = (jn0.qf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qfVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qfVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, qfVar.b);
        jn0.rf rfVar = qfVar.c;
        if (rfVar != null) {
            na.d(fVar, wVar, rfVar);
        }
    }
}
