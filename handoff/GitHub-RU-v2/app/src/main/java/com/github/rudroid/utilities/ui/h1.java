package com.github.rudroid.utilities.ui;

import com.github.rudroid.utilities.ui.g1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public static final boolean a(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof h0;
    }

    public static final boolean b(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return (g1Var instanceof n0) || (g1Var instanceof u1);
    }

    public static final boolean c(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof s0;
    }

    public static final boolean d(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof r0;
    }

    public static final boolean e(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof u0;
    }

    public static final boolean f(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof y0;
    }

    public static final boolean g(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        return g1Var instanceof t1;
    }

    public static final g1 h(g1 g1Var, j71.c cVar) {
        k71.k.g(g1Var, "<this>");
        if (g1Var instanceof n0) {
            n0 n0Var = (n0) g1Var;
            Object obj = n0Var.a;
            return new n0(n0Var.b, obj != null ? cVar.k(obj) : null);
        }
        if (g1Var instanceof u1) {
            u1 u1Var = (u1) g1Var;
            Object obj2 = u1Var.a;
            return new u1(obj2 != null ? cVar.k(obj2) : null, u1Var.b);
        }
        if (g1Var instanceof h0) {
            Object obj3 = ((h0) g1Var).a;
            return new h0(obj3 != null ? cVar.k(obj3) : null);
        }
        if (g1Var instanceof t1) {
            return new t1(cVar.k(((t1) g1Var).a));
        }
        if (g1Var instanceof t0) {
            return new t0(cVar.k(((t0) g1Var).a));
        }
        if (g1Var instanceof u0) {
            Object obj4 = ((u0) g1Var).a;
            return new u0(obj4 != null ? cVar.k(obj4) : null);
        }
        if (g1Var instanceof x0) {
            return new x0(cVar.k(((x0) g1Var).a));
        }
        if (g1Var instanceof y0) {
            return new y0(cVar.k(((y0) g1Var).a));
        }
        if (g1Var instanceof r0) {
            return new r0(cVar.k(((r0) g1Var).a));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final fl.f i(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        if (g1Var instanceof h0) {
            return new fl.f(fl.g.s, ((h0) g1Var).a, null);
        }
        if (g1Var instanceof n0) {
            fl.e eVar = fl.f.Companion;
            n0 n0Var = (n0) g1Var;
            fl.b bVar = n0Var.b;
            Object obj = n0Var.a;
            eVar.getClass();
            return fl.e.a(bVar, obj);
        }
        if (g1Var instanceof u1) {
            fl.e eVar2 = fl.f.Companion;
            u1 u1Var = (u1) g1Var;
            fl.b a = u1Var.b.a();
            Object obj2 = u1Var.a;
            eVar2.getClass();
            return fl.e.a(a, obj2);
        }
        if ((g1Var instanceof t0) || (g1Var instanceof u0) || (g1Var instanceof x0) || (g1Var instanceof y0) || (g1Var instanceof r0)) {
            fl.e eVar3 = fl.f.Companion;
            Object data = ((s0) g1Var).getData();
            eVar3.getClass();
            return fl.e.b(data);
        }
        if (!(g1Var instanceof t1)) {
            throw new NoWhenBranchMatchedException();
        }
        fl.e eVar4 = fl.f.Companion;
        Object obj3 = ((t1) g1Var).a;
        eVar4.getClass();
        return fl.e.c(obj3);
    }

    public static final s0 j(g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        if (g1Var instanceof h0) {
            g1.a aVar = g1.Companion;
            Object obj = ((h0) g1Var).a;
            aVar.getClass();
            return new u0(obj);
        }
        if (g1Var instanceof t0) {
            g1.a aVar2 = g1.Companion;
            Object obj2 = ((t0) g1Var).a;
            aVar2.getClass();
            return new y0(obj2);
        }
        if (g1Var instanceof u0) {
            g1.a aVar3 = g1.Companion;
            Object obj3 = ((u0) g1Var).a;
            aVar3.getClass();
            return new u0(obj3);
        }
        if (g1Var instanceof x0) {
            g1.a aVar4 = g1.Companion;
            Object obj4 = ((x0) g1Var).a;
            aVar4.getClass();
            return new y0(obj4);
        }
        if (g1Var instanceof y0) {
            g1.a aVar5 = g1.Companion;
            Object obj5 = ((y0) g1Var).a;
            aVar5.getClass();
            return new y0(obj5);
        }
        if (g1Var instanceof r0) {
            g1.a aVar6 = g1.Companion;
            Object obj6 = ((r0) g1Var).a;
            aVar6.getClass();
            return new y0(obj6);
        }
        if (g1Var instanceof t1) {
            g1.a aVar7 = g1.Companion;
            Object obj7 = ((t1) g1Var).a;
            aVar7.getClass();
            return new y0(obj7);
        }
        if (g1Var instanceof n0) {
            Object obj8 = ((n0) g1Var).a;
            if (obj8 == null) {
                return g1.a.c(g1.Companion);
            }
            g1.Companion.getClass();
            return new y0(obj8);
        }
        if (!(g1Var instanceof u1)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj9 = ((u1) g1Var).a;
        if (obj9 == null) {
            return g1.a.c(g1.Companion);
        }
        g1.Companion.getClass();
        return new y0(obj9);
    }

    public static final n0 k(g1 g1Var, fl.b bVar) {
        k71.k.g(bVar, "executionError");
        g1.a aVar = g1.Companion;
        Object data = g1Var.getData();
        aVar.getClass();
        return g1.a.b(bVar, data);
    }
}
