package fz;

import java.util.ArrayList;
import java.util.List;
import jo.a3;
import jo.b3;
import jo.e3;
import jo.i3;
import jo.j3;
import jo.k3;
import qx.c1;
import sy.d0;
import w8.s;
import x61.r;
import yz0.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements yz0.e {
    public static final l Companion = new l();
    public final int a;
    public final Object b;
    public final x01.i c;

    public m(a3 a3Var, j3 j3Var, k3 k3Var, boolean z) {
        ArrayList arrayList;
        e3 e3Var;
        k71.k.g(a3Var, "data");
        int i = j3Var.b;
        Companion.getClass();
        c1 c1Var = a3Var.a.c;
        List<b3> list = k3Var.c;
        if (list != null) {
            arrayList = new ArrayList();
            for (b3 b3Var : list) {
                b2 b2Var = null;
                if ((b3Var != null ? b3Var.e : null) != null) {
                    b2Var = sy.c.a(b3Var.e);
                } else if ((b3Var != null ? b3Var.b : null) != null && (e3Var = b3Var.b) != null) {
                    b2Var = new b2(e3Var.e, s.A(e3Var.g), e3Var.b, e3Var.c, true, e3Var.d, e3Var.f);
                }
                if (b2Var != null) {
                    arrayList.add(b2Var);
                }
            }
        } else {
            arrayList = r.r;
        }
        if (z) {
            List n = d0.n(sy.c.a(c1Var));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!k71.k.b(((b2) obj).t, c1Var.b)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = x61.m.l0(n, arrayList2);
        }
        Companion.getClass();
        i3 i3Var = k3Var.a;
        x01.i iVar = new x01.i(i3Var.b, i3Var.a, false);
        this.a = i;
        this.b = arrayList;
        this.c = iVar;
    }

    public final int a() {
        return this.a;
    }

    public final x01.i b() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List c() {
        return this.b;
    }
}
