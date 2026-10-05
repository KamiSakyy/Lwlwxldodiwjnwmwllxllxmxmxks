package fd0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tf implements aa.a {
    public static final tf a = new tf();
    public static final List b = sy.d0.o(new String[]{"id", "discussion", "pattern", "gradientStopColors", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.jn jnVar = null;
        gn0.bk bkVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                jnVar = (kc0.jn) aa.c.c(sf.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.bk.Companion.getClass();
                Iterator it = gn0.bk.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.bk) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.bk bkVar2 = (gn0.bk) obj;
                bkVar = bkVar2 == null ? gn0.bk.t : bkVar2;
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
        if (jnVar == null) {
            k41.b.B(eVar, "discussion");
            throw null;
        }
        if (bkVar == null) {
            k41.b.B(eVar, "pattern");
            throw null;
        }
        if (arrayList == null) {
            k41.b.B(eVar, "gradientStopColors");
            throw null;
        }
        if (str2 != null) {
            return new kc0.kn(str, jnVar, bkVar, arrayList, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.kn knVar = (kc0.kn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(knVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, knVar.a);
        fVar.z0("discussion");
        aa.c.c(sf.a, false).b(fVar, wVar, knVar.b);
        fVar.z0("pattern");
        fVar.I(knVar.c.r);
        fVar.z0("gradientStopColors");
        aa.c.a(bVar).e(fVar, wVar, knVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, knVar.e);
    }
}
