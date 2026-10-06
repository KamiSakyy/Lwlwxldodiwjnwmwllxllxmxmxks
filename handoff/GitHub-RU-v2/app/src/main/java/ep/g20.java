package ep;

import java.util.Iterator;
import java.util.List;
import jo.nj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g20 implements aaShadow.a {
    public static final g20 a = new g20();
    public static final List b = sy.d0.o("allowableStatus", "name", "isDefault");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.ry ryVar = null;
        m10.py pyVar = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                m10.ry.Companion.getClass();
                Iterator it = m10.ry.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((m10.ry) obj2).r.equals(u)) {
                        break;
                    }
                }
                m10.ry ryVar2 = (m10.ry) obj2;
                ryVar = ryVar2 == null ? m10.ry.t : ryVar2;
            } else if (r0 == 1) {
                String u2 = eVar.u();
                k71.k.d(u2);
                m10.py.Companion.getClass();
                Iterator it2 = m10.py.y.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((m10.py) obj).r.equals(u2)) {
                        break;
                    }
                }
                m10.py pyVar2 = (m10.py) obj;
                pyVar = pyVar2 == null ? m10.py.w : pyVar2;
            } else {
                if (r0 != 2) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (ryVar == null) {
            k41.b.B(eVar, "allowableStatus");
            throw null;
        }
        if (pyVar == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool != null) {
            return new nj0(ryVar, pyVar, bool.booleanValue());
        }
        k41.b.B(eVar, "isDefault");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nj0 nj0Var = (nj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nj0Var, "value");
        fVar.z0("allowableStatus");
        fVar.I(nj0Var.a.r);
        fVar.z0("name");
        fVar.I(nj0Var.b.r);
        fVar.z0("isDefault");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(nj0Var.c));
    }
}
