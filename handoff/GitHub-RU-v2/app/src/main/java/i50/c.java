package i50;

import aa.i0;
import aa.p0;
import aa.q0;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.z6;
import hc0.w8;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements i0, t6.b, bm.k, com.google.android.gms.measurement.internal.x, p.w, x41.d {
    public static final /* synthetic */ c s = new c(3);
    public static final /* synthetic */ c t = new c(4);
    public static final /* synthetic */ c u = new c(5);
    public static final /* synthetic */ c v = new c(6);
    public final /* synthetic */ int r;

    public /* synthetic */ c(int i) {
        this.r = i;
    }

    public void a() {
    }

    public void b(p.l lVar, boolean z) {
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.r.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.m.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.X.b()).longValue());
            default:
                return new Boolean(((Boolean) c8.a.b()).booleanValue());
        }
    }

    public aa.m d() {
        w8.Companion.getClass();
        q0 q0Var = w8.c;
        k71.k.g(q0Var, "type");
        List list = j50.a.a;
        List list2 = j50.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public String e() {
        return null;
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == c.class;
            default:
                return super.equals(obj);
        }
    }

    public void f(String str, long j) {
    }

    public p0 g() {
        return aa.c.c(e.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(c.class).hashCode();
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
        com.github.rudroid.common.e0 e0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            e0Var = (com.github.rudroid.common.e0) bVar.a(str, new k81.z("com.github.rudroid.common.ProjectScope", com.github.rudroid.common.e0.values()));
        }
        e0Var = ProjectScopeFilter.x;
        return new ProjectScopeFilter(e0Var);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public boolean p(p.l lVar) {
        return false;
    }

    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
