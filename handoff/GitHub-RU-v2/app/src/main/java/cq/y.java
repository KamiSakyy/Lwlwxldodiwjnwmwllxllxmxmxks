package cq;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y implements aa.a {
    public static final List a = x61.l.r(new String[]{"actor", "createdAt", "dismissable", "identifier", "previewImageUrl", "discussion"});

    public static w c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        u uVar = null;
        ZonedDateTime zonedDateTime = null;
        String str = null;
        String str2 = null;
        v vVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                uVar = (u) aa.c.c(xShadow.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                vVar = (v) aa.c.c(z.a, true).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (uVar == null) {
            k41.b.B(eVar, "actor");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "dismissable");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (vVar != null) {
            return new w(uVar, zonedDateTime, booleanValue, str, str2, vVar);
        }
        k41.b.B(eVar, "discussion");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w wVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("actor");
        aa.c.c(xShadow.a, true).b(fVar, wVar, wVar2.a);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, wVar2.b);
        fVar.z0("dismissable");
        jo.f4Shadow.C(wVar2.c, aa.c.f, fVar, wVar, "identifier");
        aa.c.a.b(fVar, wVar, wVar2.d);
        fVar.z0("previewImageUrl");
        aa.c.i.b(fVar, wVar, wVar2.e);
        fVar.z0("discussion");
        aa.c.c(z.a, true).b(fVar, wVar, wVar2.f);
    }
}
