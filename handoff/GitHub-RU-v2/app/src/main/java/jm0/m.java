package jm0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = sy.d0.o(new String[]{"getsCiFailedOnly", "getsCiActivity"});

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
            return new im0.t(booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "getsCiActivity");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        im0.t tVar = (im0.t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("getsCiFailedOnly");
        aa.b bVar = aa.c.f;
        f4.C(tVar.a, bVar, fVar, wVar, "getsCiActivity");
        bVar.b(fVar, wVar, Boolean.valueOf(tVar.b));
    }
}
