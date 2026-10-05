package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0.o("id", "oid");

    public final Object a(ea.e eVar, aa.w wVar) {
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
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new w(str, str2);
        }
        k41.b.B(eVar, "oid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w wVar2 = (w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wVar2.a);
        fVar.z0("oid");
        bVar.b(fVar, wVar, wVar2.b);
    }
}
