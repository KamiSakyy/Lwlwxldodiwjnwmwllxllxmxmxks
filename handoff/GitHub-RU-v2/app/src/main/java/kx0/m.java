package kx0;

import fw0.c1;
import java.util.ArrayList;
import java.util.List;
import jn0.a3;
import jn0.b3;
import jn0.c3;
import jn0.v2;
import jn0.w2;
import sy.d0;
import x61.r;
import yz0.b2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements yz0.e {
    public static final l Companion = new l();
    public int a;
    public Object b;
    public x01.i c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public m(v2 v2Var, b3 b3Var, c3 c3Var, boolean z) {
        java.util.ArrayList r1;
        k71.k.g(v2Var, "data");
        int i = b3Var.b;
        Companion.getClass();
        c1 c1Var = v2Var.a.c;
        List<w2> list = c3Var.c;
        if (list != null) {
            r1 = new ArrayList();
            for (w2 w2Var : list) {
                b2 a = (w2Var != null ? w2Var.c : null) != null ? bx0.c.a(w2Var.c) : null;
                if (a != null) {
                    r1.add(a);
                }
            }
        } else {
            r1 = r.r;
        }
        if (z) {
            List n = d0.n(bx0.c.a(c1Var));
            ArrayList arrayList = new ArrayList();
            for (Object obj : r1) {
                if (!k71.k.b(((b2) obj).t, c1Var.b)) {
                    arrayList.add(obj);
                }
            }
            r1 = x61.m.l0(n, arrayList);
        }
        Companion.getClass();
        a3 a3Var = c3Var.a;
        x01.i iVar = new x01.i(a3Var.b, a3Var.a, false);
        this.a = i;
        this.b = r1;
        this.c = iVar;
    }

    @Override // yz0.e
    public final int a() {
        return this.a;
    }

    @Override // yz0.e
    public final x01.i b() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // yz0.e
    public final List c() {
        return this.b;
    }
}
