package z70;

import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ a3 s = new a3(2);
    public static final /* synthetic */ a3 t = new a3(3);
    public static final /* synthetic */ a3 u = new a3(4);
    public static final /* synthetic */ a3 v = new a3(5);
    public final /* synthetic */ int r;

    public /* synthetic */ a3(int i) {
        this.r = i;
    }

    public Object c() {
        switch (this.r) {
            case 2:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.w7.a.b()).booleanValue());
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.v0.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.b7.x.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.b7.m0.b()).longValue());
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.i.a;
        List list2 = a80.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == a3.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(b3.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(a3.class).hashCode();
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
        com.github.rudroid.common.w wVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            wVar = (com.github.rudroid.common.w) bVar.a(str, new k81.z("com.github.rudroid.common.IssueStatus", com.github.rudroid.common.w.values()));
        }
        wVar = IssueStatusFilter.x;
        return new IssueStatusFilter(wVar);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
