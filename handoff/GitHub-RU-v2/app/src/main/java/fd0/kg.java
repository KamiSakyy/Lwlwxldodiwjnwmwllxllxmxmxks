package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kg implements aaShadow.a {
    public static final kg a = new kg();
    public static final List b = sy.d0.o(new String[]{"__typename", "url", "state", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        gn0.lm lmVar = null;
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
                gn0.lm.Companion.getClass();
                Iterator it = gn0.lm.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.lm) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.lm lmVar2 = (gn0.lm) obj;
                lmVar = lmVar2 == null ? gn0.lm.t : lmVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        se0.c c = se0.e.c(eVar, wVar);
        eVar.s0();
        aj0.f fVar = aj0.f.a;
        aj0.c c2 = aj0.f.c(eVar, wVar);
        eVar.s0();
        sk0.c c3 = sk0.d.c(eVar, wVar);
        eVar.s0();
        yh0.a c4 = yh0.b.c(eVar, wVar);
        eVar.s0();
        qh0.d dVar = qh0.d.a;
        qh0.a c5 = qh0.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (lmVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new kc0.io(str, str2, lmVar, str3, c, c2, c3, c4, c5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.io ioVar = (kc0.io) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ioVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ioVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, ioVar.b);
        fVar.z0("state");
        fVar.I(ioVar.c.r);
        fVar.z0("id");
        bVar.b(fVar, wVar, ioVar.d);
        List list = se0.e.a;
        se0.e.d(fVar, wVar, ioVar.e);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, ioVar.f);
        List list2 = sk0.d.a;
        sk0.d.d(fVar, wVar, ioVar.g);
        List list3 = yh0.b.a;
        yh0.b.d(fVar, wVar, ioVar.h);
        qh0.d dVar = qh0.d.a;
        qh0.d.d(fVar, wVar, ioVar.i);
    }
}
