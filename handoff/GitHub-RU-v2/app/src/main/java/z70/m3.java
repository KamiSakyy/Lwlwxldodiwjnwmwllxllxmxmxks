package z70;

import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, v11.a {
    public static final /* synthetic */ m3 s = new m3(2);
    public static final /* synthetic */ m3 t = new m3(3);
    public static final /* synthetic */ m3 u = new m3(4);
    public static final /* synthetic */ m3 v = new m3(5);
    public final /* synthetic */ int r;

    public /* synthetic */ m3(int i) {
        this.r = i;
    }

    public long b() {
        return System.currentTimeMillis();
    }

    public Object c() {
        switch (this.r) {
            case 2:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.b.b();
                l.getClass();
                return l;
            case 3:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l2 = (Long) com.google.android.gms.internal.measurement.b7.E.b();
                l2.getClass();
                return l2;
            case 4:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return (String) com.google.android.gms.internal.measurement.b7.c0.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool = (Boolean) o8.h.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.l.a;
        List list2 = a80.l.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == m3.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(n3.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(m3.class).hashCode();
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
        com.github.rudroid.common.xShadow xVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            xVar = (com.github.rudroid.common.x) bVar.a(str, new k81.z("com.github.rudroid.common.IssueUserRelationship", com.github.rudroid.common.x.values()));
        }
        xVar = IssueUserRelationshipFilter.x;
        return new IssueUserRelationshipFilter(xVar);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
