package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bo implements aaShadow.a {
    public static final bo a = new bo();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.ty tyVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            tyVar = co.c(eVar, wVar);
        } else {
            tyVar = null;
        }
        if (str2 != null) {
            return new jo.sy(str, str2, tyVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sy syVar = (jo.sy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(syVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, syVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, syVar.b);
        jo.ty tyVar = syVar.c;
        if (tyVar != null) {
            co.d(fVar, wVar, tyVar);
        }
    }
}
