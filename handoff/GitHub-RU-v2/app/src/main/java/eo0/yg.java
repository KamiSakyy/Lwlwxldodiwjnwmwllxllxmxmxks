package eo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yg implements aa.a {
    public static final yg a = new yg();
    public static final List b = sy.d0.o(new String[]{"id", "discussion", "pattern", "gradientStopColors", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.bp bpVar = null;
        pz0.dn dnVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bpVar = (jn0.bp) aa.c.c(xg.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                pz0.dn.Companion.getClass();
                Iterator it = pz0.dn.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.dn) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.dn dnVar2 = (pz0.dn) obj;
                dnVar = dnVar2 == null ? pz0.dn.t : dnVar2;
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
        if (bpVar == null) {
            k41.b.B(eVar, "discussion");
            throw null;
        }
        if (dnVar == null) {
            k41.b.B(eVar, "pattern");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "gradientStopColors");
            throw null;
        }
        if (str2 != null) {
            return new jn0.cp(str, bpVar, dnVar, arrayList, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.cp cpVar = (jn0.cp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cpVar.a);
        fVar.z0("discussion");
        aa.c.c(xg.a, false).b(fVar, wVar, cpVar.b);
        fVar.z0("pattern");
        fVar.I(cpVar.c.r);
        fVar.z0("gradientStopColors");
        aa.c.a(bVar).e(fVar, wVar, cpVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cpVar.e);
    }
}
