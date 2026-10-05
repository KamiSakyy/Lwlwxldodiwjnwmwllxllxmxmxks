package vo;

import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.ah0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 implements aa.a {
    public static final i2 a = new i2();
    public static final List b = sy.d0.o("choices", "description", "required", "type", "defaultValue", "titleId");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        List list = null;
        String str = null;
        ah0 ah0Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                list = (List) aa.c.b(aa.c.a(aa.c.a)).a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                ah0.Companion.getClass();
                Iterator it = ah0.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ah0) obj).r.equals(u)) {
                        break;
                    }
                }
                ah0 ah0Var2 = (ah0) obj;
                ah0Var = ah0Var2 == null ? ah0.t : ah0Var2;
            } else if (r0 == 4) {
                bool = bool2;
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (bool3 == null) {
            k41.b.B(eVar, "required");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (ah0Var == null) {
            k41.b.B(eVar, "type");
            throw null;
        }
        if (str3 != null) {
            return new g2(list, str, booleanValue, ah0Var, str2, str3);
        }
        k41.b.B(eVar, "titleId");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g2 g2Var = (g2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g2Var, "value");
        fVar.z0("choices");
        aa.b bVar = aa.c.a;
        aa.c.b(aa.c.a(bVar)).b(fVar, wVar, g2Var.a);
        fVar.z0("description");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, g2Var.b);
        fVar.z0("required");
        f4.C(g2Var.c, aa.c.f, fVar, wVar, "type");
        fVar.I(g2Var.d.r);
        fVar.z0("defaultValue");
        o0Var.b(fVar, wVar, g2Var.e);
        fVar.z0("titleId");
        bVar.b(fVar, wVar, g2Var.f);
    }
}
