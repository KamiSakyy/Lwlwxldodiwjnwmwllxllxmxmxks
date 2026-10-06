package zk;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import yz0.e2;
import yz0.f2;
import yz0.i7;
import yz0.j7;
import yz0.z7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 extends c71.j implements j71.e {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ ArrayList B;
    public /* synthetic */ Object v;
    public final /* synthetic */ Set w;
    public final /* synthetic */ o1 x;
    public final /* synthetic */ oa.j y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Set set, o1 o1Var, oa.j jVar, String str, ArrayList arrayList, ArrayList arrayList2, a71.c cVar) {
        super(2, cVar);
        this.w = set;
        this.x = o1Var;
        this.y = jVar;
        this.z = str;
        this.A = arrayList;
        this.B = arrayList2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        n1 n1Var = new n1(this.w, this.x, this.y, this.z, this.A, this.B, cVar);
        n1Var.v = obj;
        return n1Var;
    }

    public final Object s(Object obj, Object obj2) {
        n1 r = r((a71.c) obj2, (z7) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        f2 f2Var;
        String str;
        String str2;
        String str3;
        f2 f2Var2 = f2.c;
        f2 f2Var3 = f2.a;
        f2 f2Var4 = f2.d;
        f2 f2Var5 = f2.b;
        z7 z7Var = (z7) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        ArrayList arrayList = z7Var.a;
        String str4 = z7Var.d;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((e2) obj2).d);
        }
        Set set = this.w;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : set) {
            if (!arrayList2.contains(((e2) obj3).d)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (true) {
            oa.j jVar = this.y;
            if (i2 >= size2) {
                String str5 = str4;
                ArrayList arrayList5 = z7Var.a;
                ArrayList arrayList6 = new ArrayList();
                int size3 = arrayList5.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj4 = arrayList5.get(i3);
                    i3++;
                    e2 e2Var = (e2) obj4;
                    if (!this.A.contains(e2Var.d)) {
                        if (this.B.contains(e2Var.d)) {
                        }
                    }
                    arrayList6.add(obj4);
                }
                ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList6, 10));
                int size4 = arrayList6.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj5 = arrayList6.get(i4);
                    i4++;
                    e2 e2Var2 = (e2) obj5;
                    com.github.service.models.response.a a = hn.a.a(jVar);
                    String str6 = e2Var2.a.z;
                    sy.e0 e0Var = e2Var2.e;
                    if (k71.k.b(e0Var, f2Var5)) {
                        f2Var = f2Var2;
                        str = str5;
                    } else {
                        if (!k71.k.b(e0Var, f2Var4) && !k71.k.b(e0Var, f2Var3) && !k71.k.b(e0Var, f2Var2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f2Var = f2Var2;
                        str = null;
                    }
                    ZonedDateTime now = ZonedDateTime.now();
                    k71.k.f(now, "now(...)");
                    arrayList7.add(new j7(a, str6, str, now));
                    f2Var2 = f2Var;
                }
                ((cn.s) this.x.b.a(jVar)).b(this.z, x61.m.l0(arrayList4, arrayList7));
                return w61.a0.a;
            }
            Object obj6 = arrayList3.get(i2);
            i2++;
            e2 e2Var3 = (e2) obj6;
            com.github.service.models.response.a a2 = hn.a.a(jVar);
            String str7 = e2Var3.a.z;
            sy.e0 e0Var2 = e2Var3.e;
            if (k71.k.b(e0Var2, f2Var5)) {
                str3 = str4;
                str2 = str3;
            } else {
                if (!k71.k.b(e0Var2, f2Var4) && !k71.k.b(e0Var2, f2Var3) && !k71.k.b(e0Var2, f2Var2)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = str4;
                str3 = null;
            }
            ZonedDateTime now2 = ZonedDateTime.now();
            k71.k.f(now2, "now(...)");
            arrayList4.add(new i7(a2, str7, str3, now2));
            str4 = str2;
        }
    }
}
