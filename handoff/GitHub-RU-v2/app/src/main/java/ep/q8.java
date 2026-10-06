package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q8 implements aaShadow.a {
    public static final q8 a = new q8();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.xc xcVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            xcVar = r8.c(eVar, wVar);
        } else {
            xcVar = null;
        }
        if (str2 != null) {
            return new jo.wc(str, str2, xcVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wc wcVar = (jo.wc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wcVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wcVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, wcVar.b);
        jo.xc xcVar = wcVar.c;
        if (xcVar != null) {
            r8.d(fVar, wVar, xcVar);
        }
    }
}
