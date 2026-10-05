package da1;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
final class r extends b0 {
    public r() {
        super("ForeignContent", 23);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        ca1.b bVar2;
        ca1.b bVar3;
        ca1.b bVar4;
        ca1.j h;
        int b = y3.a.b(s0Var.a);
        if (b == 0) {
            bVar.k(this);
            return true;
        }
        if (b == 1) {
            p0 p0Var = (p0) s0Var;
            if (ba1.h.b(p0Var.e, a0.L)) {
                return bVar.l.d(s0Var, bVar);
            }
            if (p0Var.e.equals("font") && (((bVar2 = p0Var.g) != null && bVar2.j("color") != -1) || (((bVar3 = p0Var.g) != null && bVar3.j("face") != -1) || ((bVar4 = p0Var.g) != null && bVar4.j("size") != -1)))) {
                return bVar.l.d(s0Var, bVar);
            }
            String str = bVar.h().u.r;
            bVar.y(p0Var, str);
            l3 e = bVar.i.d(p0Var.d.G(), p0Var.e, str, bVar.h.a).e();
            if (e != null) {
                if (p0Var.e.equals("script")) {
                    bVar.c.o(l3.w);
                    return true;
                }
                bVar.c.o(e);
            }
        } else {
            if (b == 2) {
                o0 o0Var = (o0) s0Var;
                if (o0Var.e.equals("br") || o0Var.e.equals("p")) {
                    return bVar.l.d(s0Var, bVar);
                }
                if (o0Var.e.equals("script") && bVar.e.size() != 0 && (h = bVar.h()) != null && h.u.t.equals("script") && h.u.r.equals("http://www.w3.org/2000/svg")) {
                    bVar.E();
                    return true;
                }
                ArrayList arrayList = bVar.e;
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Stack unexpectedly empty");
                }
                int size = arrayList.size() - 1;
                ca1.j jVar = (ca1.j) arrayList.get(size);
                if (!jVar.p(o0Var.e)) {
                    bVar.k(this);
                }
                do {
                    if (size != 0) {
                        if (jVar.p(o0Var.e)) {
                            String str2 = jVar.u.t;
                            for (int size2 = bVar.e.size() - 1; size2 >= 0 && !bVar.E().p(str2); size2--) {
                            }
                        } else {
                            size--;
                            jVar = (ca1.j) arrayList.get(size);
                        }
                    }
                } while (!jVar.u.r.equals("http://www.w3.org/1999/xhtml"));
                return bVar.l.d(s0Var, bVar);
            }
            if (b == 3) {
                bVar.v((l0) s0Var);
                return true;
            }
            if (b == 4) {
                k0 k0Var = (k0) s0Var;
                if (k0Var.d.G().equals(b0.P)) {
                    bVar.k(this);
                    return true;
                }
                if (b0.a(k0Var)) {
                    bVar.t(k0Var);
                    return true;
                }
                bVar.t(k0Var);
                bVar.u = false;
                return true;
            }
            if (b != 6) {
                throw new IllegalStateException("Unexpected state: ".concat(com.github.rudroid.copilot.h1.G(s0Var.a)));
            }
        }
        return true;
    }
}
