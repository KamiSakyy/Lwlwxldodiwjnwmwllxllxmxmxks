package mz0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import lz0.r;
import lz0.u;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = d0Shadow.o(new String[]{"hasValidDeviceAuthKey", "hasExpiredAuthRequest", "activeAuthRequest"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        r rVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                rVar = (r) aa.c.b(aa.c.c(j.a, false)).a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasValidDeviceAuthKey");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new u(booleanValue, bool2.booleanValue(), rVar);
        }
        k41.b.B(eVar, "hasExpiredAuthRequest");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        u uVar = (u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("hasValidDeviceAuthKey");
        aa.b bVar = aa.c.f;
        f4Shadow.C(uVar.a, bVar, fVar, wVar, "hasExpiredAuthRequest");
        f4Shadow.C(uVar.b, bVar, fVar, wVar, "activeAuthRequest");
        aa.c.b(aa.c.c(j.a, false)).b(fVar, wVar, uVar.c);
    }
}
