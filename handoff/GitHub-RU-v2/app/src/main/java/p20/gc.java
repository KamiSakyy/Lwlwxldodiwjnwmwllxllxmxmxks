package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gc implements aaShadow.a {
    public static final gc a = new gc();
    public static final List b = sy.d0Shadow.o("id", "pullRequestState", "isDraft", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        hc0.fm fmVar = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                hc0.fm.Companion.getClass();
                Iterator it = hc0.fm.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.fm) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.fm fmVar2 = (hc0.fm) obj;
                fmVar = fmVar2 == null ? hc0.fm.v : fmVar2;
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new u10.oi(str, fmVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.oi oiVar = (u10.oi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oiVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oiVar.a);
        fVar.z0("pullRequestState");
        fVar.I(oiVar.b.r);
        fVar.z0("isDraft");
        jo.f4Shadow.C(oiVar.c, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, oiVar.d);
    }
}
