package mz0;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"hasValidDeviceAuthKey", "hasExpiredAuthRequest"});

    public final Object a(ea.e eVar, w wVar) {
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
            k41.b.B(eVar, "hasValidDeviceAuthKey");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new lz0.o(booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "hasExpiredAuthRequest");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lz0.o oVar = (lz0.o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("hasValidDeviceAuthKey");
        aa.b bVar = aa.c.f;
        f4.C(oVar.a, bVar, fVar, wVar, "hasExpiredAuthRequest");
        bVar.b(fVar, wVar, Boolean.valueOf(oVar.b));
    }
}
