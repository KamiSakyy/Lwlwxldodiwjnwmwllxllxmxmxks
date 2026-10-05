package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0.o("subjectType", "pullRequest", "comments", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.xz xzVar = null;
        jo.y0 y0Var = null;
        jo.u0 u0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
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
            } else if (r0 == 1) {
                y0Var = (jo.y0) aa.c.c(h0.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                u0Var = (jo.u0) aa.c.c(e0.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (xzVar == null) {
            k41.b.B(eVar, "subjectType");
            throw null;
        }
        if (y0Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (u0Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.z0(xzVar, y0Var, u0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.z0 z0Var = (jo.z0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z0Var, "value");
        fVar.z0("subjectType");
        fVar.I(z0Var.a.r);
        fVar.z0("pullRequest");
        aa.c.c(h0.a, true).b(fVar, wVar, z0Var.b);
        fVar.z0("comments");
        aa.c.c(e0.a, false).b(fVar, wVar, z0Var.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z0Var.e);
    }
}
