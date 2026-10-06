package k00;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.o("getsCiFailedOnly", "getsCiActivity");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "getsCiFailedOnly");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new j00.y(booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "getsCiActivity");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.y yVar = (j00.y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("getsCiFailedOnly");
        aa.b bVar = aa.c.f;
        f4Shadow.C(yVar.a, bVar, fVar, wVar, "getsCiActivity");
        bVar.b(fVar, wVar, Boolean.valueOf(yVar.b));
    }
}
