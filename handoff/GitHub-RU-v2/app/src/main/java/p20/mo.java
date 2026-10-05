package p20;

import java.util.List;
import u10.rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mo implements aa.a {
    public static final mo a = new mo();
    public static final List b = sy.d0.o("name", "code");

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
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 != null) {
            return new rz(str, str2);
        }
        k41.b.B(eVar, "code");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz rzVar = (rz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rzVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rzVar.a);
        fVar.z0("code");
        bVar.b(fVar, wVar, rzVar.b);
    }
}
