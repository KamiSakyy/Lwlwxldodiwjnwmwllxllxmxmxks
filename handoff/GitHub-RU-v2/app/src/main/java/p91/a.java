package p91;

import b21.v;
import c21.h0;
import h0.q1;
import java.util.ArrayList;
import k71.k;
import q71.g;
import s91.c;
import sy.a0;
import sy.d0Shadow;
import t71.p;
import t91.d;
import x61.m;
import x91.e;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a extends u91.b {
    public q1 e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, d dVar, q1 q1Var, int i) {
        super(dVar, new v(q1Var));
        k.g(dVar, "constraints");
        this.e = q1Var;
        this.f = i;
        q1Var.a(d0Shadow.n(new e(new g(cVar.c, cVar.d(), 1), n91.b.c)));
        q1Var.a(g(cVar));
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(c cVar) {
        return cVar.d();
    }

    @Override // u91.b
    public final u91.a d(c cVar, d dVar) {
        k.g(dVar, "currentConstraints");
        int i = this.g + 1;
        this.g = i;
        q1 q1Var = this.e;
        if (i == 1) {
            q1Var.a(d0Shadow.n(new e(new g(cVar.c + 1, cVar.d(), 1), n91.c.b)));
            return u91.a.e;
        }
        if (!p.J(cVar.d, '|')) {
            return u91.a.f;
        }
        ArrayList g = g(cVar);
        if (g.isEmpty()) {
            return u91.a.f;
        }
        q1Var.a(m.l0(d0Shadow.n(new e(new g(((q71.e) ((e) m.U(g)).a).r, ((q71.e) ((e) m.e0(g)).a).s, 1), n91.b.d)), g));
        return u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return n91.b.b;
    }

    @Override // u91.b
    public final boolean f(c cVar) {
        return cVar.b == -1;
    }

    public final ArrayList g(c cVar) {
        ArrayList arrayList = new ArrayList();
        int i = cVar.c;
        String str = cVar.d;
        int i2 = cVar.b;
        d dVar = this.a;
        if (i2 == -1) {
            i += a0.l(dVar, str) + 1;
        }
        ArrayList K = t1.K(a0.i(dVar, str));
        int size = K.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            String str2 = (String) K.get(i3);
            if (!p.T(str2) || (1 <= i3 && i3 <= d0Shadow.m(K) - 1)) {
                arrayList.add(new e(new g(i, str2.length() + i, 1), n91.c.e));
                i4++;
            }
            int length = str2.length() + i;
            if (i3 < d0Shadow.m(K)) {
                arrayList.add(new e(new g(length, length + 1, 1), n91.c.b));
            }
            i = length + 1;
            if (i4 < this.f) {
                i3++;
            } else if (i < cVar.d()) {
                arrayList.add(new e(new g(i, cVar.d(), 1), n91.c.b));
                return arrayList;
            }
        }
        return arrayList;
    }
    public static Object z(Object p1, Object p2) { return null; }
}
