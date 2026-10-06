package ep;

import java.util.Iterator;
import java.util.List;
import jo.yf0;
import jo.zf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d00 implements aaShadow.a {
    public static final d00 a = new d00();
    public static final List b = sy.d0Shadow.o("__typename", "subjectType", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m10.xz xzVar = null;
        yf0 yf0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                m10.xz.Companion.getClass();
                Iterator it = m10.xz.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.xz) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.xz xzVar2 = (m10.xz) obj;
                xzVar = xzVar2 == null ? m10.xz.v : xzVar2;
            } else if (r0 == 2) {
                yf0Var = (yf0) aa.c.c(c00.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        gv.y7 c = gv.c8.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (xzVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (yf0Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new zf0(str, xzVar, yf0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zf0 zf0Var = (zf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zf0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zf0Var.a);
        fVar.z0("subjectType");
        fVar.I(zf0Var.b.r);
        fVar.z0("pullRequest");
        aa.c.c(c00.a, false).b(fVar, wVar, zf0Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, zf0Var.d);
        List list = gv.c8.a;
        gv.c8.d(fVar, wVar, zf0Var.e);
    }
}
