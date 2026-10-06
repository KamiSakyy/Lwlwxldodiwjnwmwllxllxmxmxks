package t00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.yf0;
import jo.mi0;
import rm0.ya;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sa implements z01.s1, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public v71.v u;
    public s01.p v;

    public sa(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        k71.k.g(jVar, "unCachedClient");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        switch (i) {
            case 1:
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new rm0.s(22), new ya(3), s01.o.r, new ya(4), new rm0.s(23), new rm0.s(24), new rm0.s(25), new rm0.s(26), null, null, 126976);
                break;
            default:
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new np.h(7), new n0.x(15), s01.o.r, new n0.x(16), new np.h(8), new np.h(9), new np.h(10), new np.h(11), null, null, 126976);
                ga.h hVar = ga.h.r;
                Set set = in.r.b;
                k71.k.g(set, "partialNodeErrorTypes");
                k71.k.g(set, "partialNodeErrorTypes");
                break;
        }
    }

    public final y71.i a() {
        switch (this.r) {
            case 0:
                ArrayList M = x61.m.M(r10.b.v, 25);
                ArrayList arrayList = new ArrayList(x61.n.F(M, 10));
                int size = M.size();
                int i = 0;
                while (i < size) {
                    Object obj = M.get(i);
                    i++;
                    List list = (List) obj;
                    ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((r10.b) it.next()).r);
                    }
                    arrayList.add(new h7(com.github.service.wrapper.a.o(this.s, new up.e(arrayList2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 16));
                }
                return com.github.rudroid.common.v.b(new c00.p((y71.i[]) x61.m.F0(arrayList).toArray(new y71.i[0]), 2), this.u);
            default:
                ArrayList M2 = x61.m.M(r10.b.v, 25);
                ArrayList arrayList3 = new ArrayList(x61.n.F(M2, 10));
                int size2 = M2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = M2.get(i2);
                    i2++;
                    List list2 = (List) obj2;
                    ArrayList arrayList4 = new ArrayList(x61.n.F(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((r10.b) it2.next()).r);
                    }
                    arrayList3.add(new wy0.d6(com.github.service.wrapper.a.o(this.s, new so0.e(arrayList4), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 19));
                }
                return com.github.rudroid.common.v.b(new c00.p((y71.i[]) x61.m.F0(arrayList3).toArray(new y71.i[0]), 3), this.u);
        }
    }

    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                return ((jy.d) this.v).b(new o10.a(str));
            default:
                return ((jy.d) this.v).b(new rz0.a(str));
        }
    }

    public final y71.i c() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new h7(com.github.service.wrapper.a.o(this.t, new ox.d(), ga.h.r, false, (LinkedHashSet) null, (Set) null, 60), 17), this.u);
            default:
                return y71.n1.y(new wy0.d6(com.github.service.wrapper.a.o(this.t, new dw0.d(), ga.h.r, false, (LinkedHashSet) null, (Set) null, 60), 20), this.u);
        }
    }

    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                return ((jy.d) this.v).e(new o10.a(str));
            default:
                return ((jy.d) this.v).e(new rz0.a(str));
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
