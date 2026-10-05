package mz0;

import aa.w;
import java.time.ZonedDateTime;
import java.util.List;
import pz0.o7;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("expiresAt");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        while (eVar.r0(b) == 0) {
            o7.Companion.getClass();
            zonedDateTime = (ZonedDateTime) no.a.h(wVar, o7.a, eVar, wVar);
        }
        return new lz0.a(zonedDateTime);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lz0.a aVar = (lz0.a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("expiresAt");
        o7.Companion.getClass();
        aa.c.b(wVar.e(o7.a)).b(fVar, wVar, aVar.a);
    }
}
