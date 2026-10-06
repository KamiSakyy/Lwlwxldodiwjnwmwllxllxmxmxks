package com.github.rudroid.utilities;

import com.github.rudroid.utilities.ui.g1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public static final v71.q1 a(y71.i iVar, androidx.lifecycle.c0 c0Var, androidx.lifecycle.w wVar, j71.e eVar) {
        k71.k.g(iVar, "<this>");
        k71.k.g(c0Var, "lifecycleOwner");
        k71.k.g(eVar, "action");
        return v71.b0.z(androidx.lifecycle.d1.i(c0Var), (a71.h) null, (v71.a0Shadow) null, new n0(c0Var, wVar, iVar, eVar, null), 3);
    }

    public static final y71.i1 c(y71.y1 y1Var, v6.a aVar, y71.y1 y1Var2, com.github.rudroid.issueorpullrequest.mergebox.ui.e0 e0Var) {
        k71.k.g(y1Var, "<this>");
        k71.k.g(y1Var2, "combineWith");
        return y71.n1Shadow.G(new c00.g(y1Var, y1Var2, new s0(3, e0Var, k71.j.class, "suspendConversion0", "combineStateFlow$suspendConversion0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 27), aVar, y71.q1.b, e0Var.s(y1Var.getValue(), y1Var2.getValue()));
    }

    public static final void d(y71.y1 y1Var, fl.b bVar) {
        Object value;
        Object obj;
        k71.k.g(y1Var, "<this>");
        k71.k.g(bVar, "executionError");
        do {
            value = y1Var.getValue();
            fl.e eVar = fl.f.Companion;
            obj = ((fl.f) value).b;
            eVar.getClass();
        } while (!y1Var.i(value, fl.e.a(bVar, obj)));
    }

    public static final void e(y71.y1 y1Var) {
        Object value;
        Object obj;
        k71.k.g(y1Var, "<this>");
        do {
            value = y1Var.getValue();
            fl.e eVar = fl.f.Companion;
            obj = ((fl.f) value).b;
            eVar.getClass();
        } while (!y1Var.i(value, fl.e.b(obj)));
    }

    public static y71.i1 f(y71.w1 w1Var, v71.z zVar, j71.c cVar) {
        k71.k.g(w1Var, "<this>");
        return y71.n1Shadow.G(y71.n1Shadow.B(new u0(cVar, null), w1Var), zVar, y71.q1.a, cVar.k(w1Var.getValue()));
    }

    public static final void g(y71.g1 g1Var) {
        Object c;
        k71.k.g(g1Var, "<this>");
        y71.y1 y1Var = (y71.y1) g1Var;
        com.github.rudroid.utilities.ui.g1 g1Var2 = (com.github.rudroid.utilities.ui.g1) y1Var.getValue();
        if (g1Var2 instanceof com.github.rudroid.utilities.ui.h0) {
            g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj = ((com.github.rudroid.utilities.ui.h0) g1Var2).a;
            aVar.getClass();
            c = new com.github.rudroid.utilities.ui.u0(obj);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.t0) {
            g1.a aVar2 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj2 = ((com.github.rudroid.utilities.ui.t0) g1Var2).a;
            aVar2.getClass();
            c = new com.github.rudroid.utilities.ui.t0(obj2);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.u0) {
            g1.a aVar3 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj3 = ((com.github.rudroid.utilities.ui.u0) g1Var2).a;
            aVar3.getClass();
            c = new com.github.rudroid.utilities.ui.u0(obj3);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.x0) {
            g1.a aVar4 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj4 = ((com.github.rudroid.utilities.ui.x0) g1Var2).a;
            aVar4.getClass();
            c = new com.github.rudroid.utilities.ui.t0(obj4);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.y0) {
            g1.a aVar5 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj5 = ((com.github.rudroid.utilities.ui.y0) g1Var2).a;
            aVar5.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj5);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.r0) {
            g1.a aVar6 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj6 = ((com.github.rudroid.utilities.ui.r0) g1Var2).a;
            aVar6.getClass();
            c = new com.github.rudroid.utilities.ui.t0(obj6);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.t1) {
            g1.a aVar7 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj7 = ((com.github.rudroid.utilities.ui.t1) g1Var2).a;
            aVar7.getClass();
            c = new com.github.rudroid.utilities.ui.t0(obj7);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.n0) {
            Object obj8 = ((com.github.rudroid.utilities.ui.n0) g1Var2).a;
            if (obj8 != null) {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                c = new com.github.rudroid.utilities.ui.t0(obj8);
            } else {
                c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            }
        } else {
            if (!(g1Var2 instanceof com.github.rudroid.utilities.ui.u1)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj9 = ((com.github.rudroid.utilities.ui.u1) g1Var2).a;
            if (obj9 != null) {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                c = new com.github.rudroid.utilities.ui.t0(obj9);
            } else {
                c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            }
        }
        y1Var.k((Object) null, c);
    }

    public static final void h(y71.g1 g1Var) {
        Object c;
        k71.k.g(g1Var, "<this>");
        y71.y1 y1Var = (y71.y1) g1Var;
        com.github.rudroid.utilities.ui.g1 g1Var2 = (com.github.rudroid.utilities.ui.g1) y1Var.getValue();
        if (g1Var2 instanceof com.github.rudroid.utilities.ui.h0) {
            g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj = ((com.github.rudroid.utilities.ui.h0) g1Var2).a;
            aVar.getClass();
            c = new com.github.rudroid.utilities.ui.u0(obj);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.t0) {
            g1.a aVar2 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj2 = ((com.github.rudroid.utilities.ui.t0) g1Var2).a;
            aVar2.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj2);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.u0) {
            g1.a aVar3 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj3 = ((com.github.rudroid.utilities.ui.u0) g1Var2).a;
            aVar3.getClass();
            c = new com.github.rudroid.utilities.ui.u0(obj3);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.x0) {
            g1.a aVar4 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj4 = ((com.github.rudroid.utilities.ui.x0) g1Var2).a;
            aVar4.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj4);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.y0) {
            g1.a aVar5 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj5 = ((com.github.rudroid.utilities.ui.y0) g1Var2).a;
            aVar5.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj5);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.r0) {
            g1.a aVar6 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj6 = ((com.github.rudroid.utilities.ui.r0) g1Var2).a;
            aVar6.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj6);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.t1) {
            g1.a aVar7 = com.github.rudroid.utilities.ui.g1.Companion;
            Object obj7 = ((com.github.rudroid.utilities.ui.t1) g1Var2).a;
            aVar7.getClass();
            c = new com.github.rudroid.utilities.ui.y0(obj7);
        } else if (g1Var2 instanceof com.github.rudroid.utilities.ui.n0) {
            Object obj8 = ((com.github.rudroid.utilities.ui.n0) g1Var2).a;
            if (obj8 != null) {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                c = new com.github.rudroid.utilities.ui.y0(obj8);
            } else {
                c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            }
        } else {
            if (!(g1Var2 instanceof com.github.rudroid.utilities.ui.u1)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj9 = ((com.github.rudroid.utilities.ui.u1) g1Var2).a;
            if (obj9 != null) {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                c = new com.github.rudroid.utilities.ui.y0(obj9);
            } else {
                c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            }
        }
        y1Var.k((Object) null, c);
    }

    public static final void i(y71.g1 g1Var) {
        com.github.rudroid.utilities.ui.r0 r0Var;
        k71.k.g(g1Var, "<this>");
        y71.y1 y1Var = (y71.y1) g1Var;
        Object obj = (com.github.rudroid.utilities.ui.g1) y1Var.getValue();
        if (!(obj instanceof com.github.rudroid.utilities.ui.h0) && !(obj instanceof com.github.rudroid.utilities.ui.t0) && !(obj instanceof com.github.rudroid.utilities.ui.u0) && !(obj instanceof com.github.rudroid.utilities.ui.x0) && !(obj instanceof com.github.rudroid.utilities.ui.y0) && !(obj instanceof com.github.rudroid.utilities.ui.r0)) {
            if (obj instanceof com.github.rudroid.utilities.ui.t1) {
                r0Var = new com.github.rudroid.utilities.ui.r0(((com.github.rudroid.utilities.ui.t1) obj).a);
            } else if (obj instanceof com.github.rudroid.utilities.ui.n0) {
                Object obj2 = ((com.github.rudroid.utilities.ui.n0) obj).a;
                if (obj2 != null) {
                    r0Var = new com.github.rudroid.utilities.ui.r0(obj2);
                } else {
                    obj = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
                }
            } else {
                if (!(obj instanceof com.github.rudroid.utilities.ui.u1)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj3 = ((com.github.rudroid.utilities.ui.u1) obj).a;
                if (obj3 != null) {
                    r0Var = new com.github.rudroid.utilities.ui.r0(obj3);
                } else {
                    obj = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
                }
            }
            obj = r0Var;
        }
        y1Var.j(obj);
    }

    public static final void j(y71.g1 g1Var) {
        y71.y1 y1Var;
        Object value;
        Object a;
        k71.k.g(g1Var, "<this>");
        do {
            y1Var = (y71.y1) g1Var;
            value = y1Var.getValue();
            Object data = ((com.github.rudroid.utilities.ui.g1) value).getData();
            if (data != null) {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                a = new com.github.rudroid.utilities.ui.t1(data);
            } else {
                com.github.rudroid.utilities.ui.g1.Companion.getClass();
                a = g1.a.a();
            }
        } while (!y1Var.i(value, a));
    }

    public static final void k(y71.g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        ((y71.y1) g1Var).k((Object) null, g1.a.a());
    }

    public static final void l(y71.g1 g1Var, Object obj) {
        k71.k.g(g1Var, "<this>");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        ((y71.y1) g1Var).k((Object) null, new com.github.rudroid.utilities.ui.h0(obj));
    }

    public static final void m(y71.g1 g1Var, fl.b bVar) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        y71.y1 y1Var = (y71.y1) g1Var;
        Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        aVar.getClass();
        y1Var.k((Object) null, g1.a.b(bVar, data));
    }

    public static final void n(y71.g1 g1Var) {
        k71.k.g(g1Var, "<this>");
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        y71.y1 y1Var = (y71.y1) g1Var;
        Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        aVar.getClass();
        y1Var.k((Object) null, new com.github.rudroid.utilities.ui.u0(data));
    }

    public static final void o(y71.g1 g1Var, Object obj) {
        k71.k.g(g1Var, "<this>");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        ((y71.y1) g1Var).k((Object) null, new com.github.rudroid.utilities.ui.u0(obj));
    }

    public static final void p(y71.g1 g1Var, Object obj) {
        k71.k.g(g1Var, "<this>");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        ((y71.y1) g1Var).k((Object) null, new com.github.rudroid.utilities.ui.t1(obj));
    }

    public static final void q(y71.g1 g1Var, rh.f fVar) {
        k71.k.g(g1Var, "<this>");
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        y71.y1 y1Var = (y71.y1) g1Var;
        Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        aVar.getClass();
        y1Var.k((Object) null, new com.github.rudroid.utilities.ui.u1(data, fVar));
    }

    public static final void r(y71.g1 g1Var, j71.c cVar) {
        k71.k.g(g1Var, "<this>");
        y71.y1 y1Var = (y71.y1) g1Var;
        y1Var.k((Object) null, com.github.rudroid.utilities.ui.h1.h((com.github.rudroid.utilities.ui.g1) y1Var.getValue(), cVar));
    }
}
