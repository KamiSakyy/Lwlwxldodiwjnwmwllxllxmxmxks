package k60;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import androidx.lifecycle.o1;
import androidx.lifecycle.r;
import androidx.lifecycle.s1;
import androidx.lifecycle.u1;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.rudroid.common.g0;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import hc0.ld;
import java.util.List;
import k81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements i0, bm.k, x, j7.b, j11.e {
    public static final /* synthetic */ f s = new f(3);
    public static final /* synthetic */ f t = new f(4);
    public static final /* synthetic */ f u = new f(5);
    public static final /* synthetic */ f v = new f(6);
    public final /* synthetic */ int r;

    public /* synthetic */ f(int i) {
        this.r = i;
    }

    public static s1 b(u1 u1Var, o1 o1Var, int i) {
        if ((i & 2) != 0) {
            o1Var = u1Var instanceof r ? ((r) u1Var).f0() : v6.b.a;
        }
        t6.d g0 = u1Var instanceof r ? ((r) u1Var).g0() : t6.a.b;
        k71.k.g(o1Var, "factory");
        k71.k.g(g0, "extras");
        return new s1(u1Var.K0(), o1Var, g0);
    }

    public void a(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    public Object apply(Object obj) {
        return ((q3) obj).b();
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                return (String) b7.M.b();
            case 4:
                List list2 = c0.a;
                z6.s.a();
                Long l = (Long) b7.G.b();
                l.getClass();
                return l;
            case 5:
                List list3 = c0.a;
                z6.s.a();
                Boolean bool = (Boolean) b7.c.b();
                bool.getClass();
                return bool;
            default:
                return new Boolean(((Boolean) d9.a.b()).booleanValue());
        }
    }

    public m d() {
        ld.Companion.getClass();
        j0 j0Var = ld.a;
        k71.k.g(j0Var, "type");
        List list = l60.a.a;
        List list2 = l60.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == f.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(g.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(f.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        g0 g0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            g0Var = (g0) bVar.a(str, new z("com.github.rudroid.common.PullRequestStatus", g0.values()));
        }
        g0Var = PullRequestStatusFilter.x;
        return new PullRequestStatusFilter(g0Var);
    }

    public void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s1<T1,T2,T3,T4> {
        public s1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
