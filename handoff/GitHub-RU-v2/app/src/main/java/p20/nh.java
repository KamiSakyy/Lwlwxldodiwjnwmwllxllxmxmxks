package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nh implements aa.a {
    public static final nh a = new nh();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.cp cpVar;
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
            cpVar = ch.c(eVar, wVar);
        } else {
            cpVar = null;
        }
        if (str2 != null) {
            return new u10.np(str, str2, cpVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.np npVar = (u10.np) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(npVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, npVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, npVar.b);
        u10.cp cpVar = npVar.c;
        if (cpVar != null) {
            ch.d(fVar, wVar, cpVar);
        }
    }
}
