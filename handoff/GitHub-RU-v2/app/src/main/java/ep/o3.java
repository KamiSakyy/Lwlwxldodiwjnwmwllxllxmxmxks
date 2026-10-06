package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o3 implements aaShadow.a {
    public static final o3 a = new o3();
    public static final List b = sy.d0.o("id", "state", "viewerCanReopen", "viewerCanDeleteHeadRef", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        m10.b00 b00Var = null;
        Boolean bool3 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                Boolean bool4 = bool2;
                Boolean bool5 = bool3;
                String u = eVar.u();
                k71.k.d(u);
                m10.b00.Companion.getClass();
                Iterator it = m10.b00.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.b00) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.b00 b00Var2 = (m10.b00) obj;
                b00Var = b00Var2 == null ? m10.b00.v : b00Var2;
                bool2 = bool4;
                bool3 = bool5;
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                bool3 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool6 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (b00Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (bool6 == null) {
            k41.b.B(eVar, "viewerCanReopen");
            throw null;
        }
        Boolean bool7 = bool3;
        boolean booleanValue = bool6.booleanValue();
        if (bool7 == null) {
            k41.b.B(eVar, "viewerCanDeleteHeadRef");
            throw null;
        }
        boolean booleanValue2 = bool7.booleanValue();
        if (str2 != null) {
            return new jo.o5(str, b00Var, booleanValue, booleanValue2, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.o5 o5Var = (jo.o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o5Var.a);
        fVar.z0("state");
        fVar.I(o5Var.b.r);
        fVar.z0("viewerCanReopen");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(o5Var.c, bVar2, fVar, wVar, "viewerCanDeleteHeadRef");
        jo.f4.C(o5Var.d, bVar2, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, o5Var.e);
    }
}
