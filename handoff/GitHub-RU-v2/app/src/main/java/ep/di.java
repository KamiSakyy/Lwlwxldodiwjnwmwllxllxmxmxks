package ep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class di implements aaShadow.a {
    public static final di a = new di();
    public static final List b = sy.d0Shadow.o("id", "discussion", "pattern", "gradientStopColors", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.tq tqVar = null;
        m10.ks ksVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                tqVar = (jo.tq) aa.c.c(ci.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                m10.ks.Companion.getClass();
                Iterator it = m10.ks.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.ks) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.ks ksVar2 = (m10.ks) obj;
                ksVar = ksVar2 == null ? m10.ks.t : ksVar2;
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
        if (tqVar == null) {
            k41.b.B(eVar, "discussion");
            throw null;
        }
        if (ksVar == null) {
            k41.b.B(eVar, "pattern");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "gradientStopColors");
            throw null;
        }
        if (str2 != null) {
            return new jo.uq(str, tqVar, ksVar, arrayList, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.uq uqVar = (jo.uq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uqVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uqVar.a);
        fVar.z0("discussion");
        aa.c.c(ci.a, false).b(fVar, wVar, uqVar.b);
        fVar.z0("pattern");
        fVar.I(uqVar.c.r);
        fVar.z0("gradientStopColors");
        aa.c.a(bVar).e(fVar, wVar, uqVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, uqVar.e);
    }
}
