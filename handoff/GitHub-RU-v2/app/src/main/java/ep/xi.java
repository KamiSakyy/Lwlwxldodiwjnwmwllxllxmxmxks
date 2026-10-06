package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xi implements aaShadow.a {
    public static final xi a = new xi();
    public static final List b = sy.d0.o("__typename", "url", "state", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        m10.fz fzVar = null;
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
                m10.fz.Companion.getClass();
                Iterator it = m10.fz.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.fz) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.fz fzVar2 = (m10.fz) obj;
                fzVar = fzVar2 == null ? m10.fz.t : fzVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ar.c c = ar.e.c(eVar, wVar);
        eVar.s0();
        pv.f fVar = pv.f.a;
        pv.c c2 = pv.f.c(eVar, wVar);
        eVar.s0();
        mx.c c3 = mx.d.c(eVar, wVar);
        eVar.s0();
        pu.a c4 = puShadow.b.c(eVar, wVar);
        eVar.s0();
        ju.d dVar = ju.d.a;
        ju.a c5 = ju.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (fzVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new jo.wr(str, str2, fzVar, str3, c, c2, c3, c4, c5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wr wrVar = (jo.wr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wrVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wrVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, wrVar.b);
        fVar.z0("state");
        fVar.I(wrVar.c.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, wrVar.d);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, wrVar.e);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, wrVar.f);
        List list2 = mx.d.a;
        mx.d.d(fVar, wVar, wrVar.g);
        List list3 = puShadow.b.a;
        puShadow.b.d(fVar, wVar, wrVar.h);
        ju.d dVar = ju.d.a;
        ju.d.d(fVar, wVar, wrVar.i);
    }
}
