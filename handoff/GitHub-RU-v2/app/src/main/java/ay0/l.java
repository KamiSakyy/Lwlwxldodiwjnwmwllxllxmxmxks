package ay0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i0 c = r0.c(eVar, wVar);
        if (str != null) {
            return new e(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e eVar = (e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        List list = r0.a;
        i0 i0Var = eVar.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i0Var.a);
        a0 a0Var = i0Var.b;
        if (a0Var != null) {
            j0.d(fVar, wVar, a0Var);
        }
        b0 b0Var = i0Var.c;
        if (b0Var != null) {
            k0.d(fVar, wVar, b0Var);
        }
        c0 c0Var = i0Var.d;
        if (c0Var != null) {
            List list2 = l0.a;
            fVar.z0("iterationId");
            aa.c.i.b(fVar, wVar, c0Var.a);
        }
        d0 d0Var = i0Var.e;
        if (d0Var != null) {
            List list3 = m0.a;
            fVar.z0("title");
            aa.c.i.b(fVar, wVar, d0Var.a);
        }
        e0 e0Var = i0Var.f;
        if (e0Var != null) {
            List list4 = n0.a;
            fVar.z0("number");
            aa.c.j.b(fVar, wVar, e0Var.a);
        }
        f0 f0Var = i0Var.g;
        if (f0Var != null) {
            List list5 = o0.a;
            fVar.z0("nameWithOwner");
            aa.c.i.b(fVar, wVar, f0Var.a);
        }
        g0 g0Var = i0Var.h;
        if (g0Var != null) {
            List list6 = p0.a;
            fVar.z0("optionId");
            aa.c.i.b(fVar, wVar, g0Var.a);
        }
        h0 h0Var = i0Var.i;
        if (h0Var != null) {
            List list7 = q0.a;
            fVar.z0("text");
            aa.c.i.b(fVar, wVar, h0Var.a);
        }
    }
}
