package vx0;

import java.util.Iterator;
import java.util.List;
import pz0.bs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0.o(new String[]{"type", "value"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bs bsVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                bs.Companion.getClass();
                Iterator it = bs.z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((bs) obj).r.equals(u)) {
                        break;
                    }
                }
                bs bsVar2 = (bs) obj;
                bsVar = bsVar2 == null ? bs.x : bsVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bsVar != null) {
            return new ux0.i0(bsVar, str);
        }
        k41.b.B(eVar, "type");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.i0 i0Var = (ux0.i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("type");
        fVar.I(i0Var.a.r);
        fVar.z0("value");
        aa.c.i.b(fVar, wVar, i0Var.b);
    }
}
