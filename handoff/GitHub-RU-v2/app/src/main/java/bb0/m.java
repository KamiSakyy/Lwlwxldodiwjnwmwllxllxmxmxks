package bb0;

import com.github.service.models.response.Avatar;
import ea0.c1;
import java.util.ArrayList;
import java.util.List;
import sy.d0Shadow;
import t.q;
import u10.p2;
import u10.q2;
import u10.u2;
import u10.v2;
import u10.w2;
import x61.n;
import x61.rShadow;
import yz0.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements yz0.e {
    public static final l Companion = new l();
    public int a;
    public ArrayList b;
    public x01.i c;

    public m(p2 p2Var, v2 v2Var, w2 w2Var, boolean z) {
        k71.k.g(p2Var, "data");
        int i = v2Var.b;
        Companion.getClass();
        c1 c1Var = p2Var.a.c;
        r rVar = w2Var.c;
        ArrayList S = x61.m.S(rVar == null ? r.r : rVar);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            arrayList.add(((q2) obj).c);
        }
        if (z) {
            List n = d0.n(c1Var);
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if (!((c1) obj2).b.equals(c1Var.b)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = x61.m.l0(n, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(n.F(arrayList, 10));
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList.get(i4);
            i4++;
            c1 c1Var2 = (c1) obj3;
            k71.k.g(c1Var2, "<this>");
            String str = c1Var2.d;
            Avatar q = q.q(c1Var2.g);
            String str2 = c1Var2.b;
            String str3 = c1Var2.c;
            if (str3 == null) {
                str3 = "";
            }
            arrayList3.add(new b2(str, q, str2, str3, false, false, 112));
        }
        Companion.getClass();
        u2 u2Var = w2Var.a;
        x01.i iVar = new x01.i(u2Var.b, u2Var.a, false);
        this.a = i;
        this.b = arrayList3;
        this.c = iVar;
    }

    public final int a() {
        return this.a;
    }

    public final x01.i b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }
}
