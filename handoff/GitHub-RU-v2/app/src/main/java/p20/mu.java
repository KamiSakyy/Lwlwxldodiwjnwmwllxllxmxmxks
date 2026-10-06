package p20;

import hc0.wz;
import java.util.Iterator;
import java.util.List;
import u10.k80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mu implements aaShadow.a {
    public static final mu a = new mu();
    public static final List b = sy.d0Shadow.o("identifier", "hidden");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wz wzVar = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                wz.Companion.getClass();
                Iterator it = wz.C.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((wz) obj).r.equals(u)) {
                        break;
                    }
                }
                wz wzVar2 = (wz) obj;
                wzVar = wzVar2 == null ? wz.A : wzVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (wzVar == null) {
            k41.b.B(eVar, "identifier");
            throw null;
        }
        if (bool != null) {
            return new k80(wzVar, bool.booleanValue());
        }
        k41.b.B(eVar, "hidden");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k80 k80Var = (k80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k80Var, "value");
        fVar.z0("identifier");
        fVar.I(k80Var.a.r);
        fVar.z0("hidden");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(k80Var.b));
    }
}
