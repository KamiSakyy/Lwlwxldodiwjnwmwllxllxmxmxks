package p20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class we implements aaShadow.a {
    public static final we a = new we();
    public static final List b = sy.d0Shadow.o("id", "discussion", "pattern", "gradientStopColors", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.fm fmVar = null;
        hc0.bj bjVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fmVar = (u10.fm) aa.c.c(ve.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                hc0.bj.Companion.getClass();
                Iterator it = hc0.bj.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.bj) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.bj bjVar2 = (hc0.bj) obj;
                bjVar = bjVar2 == null ? hc0.bj.t : bjVar2;
            } else if (r0 == 3) {
                arrayList = aa.c.a(aa.c.a).c(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (fmVar == null) {
            k41.b.B(eVar, "discussion");
            throw null;
        }
        if (bjVar == null) {
            k41.b.B(eVar, "pattern");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "gradientStopColors");
            throw null;
        }
        if (str2 != null) {
            return new u10.gm(str, fmVar, bjVar, arrayList, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.gm gmVar = (u10.gm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gmVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gmVar.a);
        fVar.z0("discussion");
        aa.c.c(ve.a, false).b(fVar, wVar, gmVar.b);
        fVar.z0("pattern");
        fVar.I(gmVar.c.r);
        fVar.z0("gradientStopColors");
        aa.c.a(bVar).e(fVar, wVar, gmVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gmVar.e);
    }
}
