package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ph implements aaShadow.a {
    public static final ph a = new ph();
    public static final List b = sy.d0.o(new String[]{"__typename", "url", "state", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        pz0.kt ktVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                pz0.kt.Companion.getClass();
                Iterator it = pz0.kt.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.kt) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.kt ktVar2 = (pz0.kt) obj;
                ktVar = ktVar2 == null ? pz0.kt.t : ktVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        yp0.c c = yp0.e.c(eVar, wVar);
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c2 = gu0.f.c(eVar, wVar);
        eVar.s0();
        bw0.c c3 = bw0.d.c(eVar, wVar);
        eVar.s0();
        gt0.a c4 = gt0.b.c(eVar, wVar);
        eVar.s0();
        at0.d dVar = at0.d.a;
        at0.a c5 = at0.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (ktVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new jn0.zp(str, str2, ktVar, str3, c, c2, c3, c4, c5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.zp zpVar = (jn0.zp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zpVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zpVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, zpVar.b);
        fVar.z0("state");
        fVar.I(zpVar.c.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, zpVar.d);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, zpVar.e);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, zpVar.f);
        List list2 = bw0.d.a;
        bw0.d.d(fVar, wVar, zpVar.g);
        List list3 = gt0.b.a;
        gt0.b.d(fVar, wVar, zpVar.h);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, zpVar.i);
    }
}
