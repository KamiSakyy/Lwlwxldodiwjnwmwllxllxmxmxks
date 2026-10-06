package z70;

import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, w21.f {
    public static final /* synthetic */ x3 s = new x3(2);
    public static final /* synthetic */ x3 t = new x3(3);
    public static final /* synthetic */ x3 u = new x3(4);
    public static final /* synthetic */ x3 v = new x3(5);
    public final /* synthetic */ int r;

    public /* synthetic */ x3(int i) {
        this.r = i;
    }

    public Object c() {
        switch (this.r) {
            case 2:
                List list = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool = (Boolean) o8.c.b();
                bool.getClass();
                return bool;
            case 3:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.i.b();
                l.getClass();
                return l;
            case 4:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return (String) com.google.android.gms.internal.measurement.b7.Y.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool2 = (Boolean) o8.g.b();
                bool2.getClass();
                return bool2;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.n.a;
        List list2 = a80.n.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == x3.class;
            default:
                return super.equals(obj);
        }
    }

    public w21.o f(Object obj) {
        return t.q.k(Boolean.TRUE);
    }

    public aa.p0 g() {
        return aa.c.c(y3.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(x3.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r6 == null) goto L6;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list;
        com.github.domain.database.serialization.c.Companion.getClass();
        if (str != null) {
            l81.n nVar = com.github.domain.database.serialization.c.b;
            list = (List) nVar.a(str, m71.a.z(new k81.d(b91.g.C(((l81.c) nVar).b, k71.x.a(yz0.k2.class)), 0)));
        }
        list = x61.r.r;
        return new LabelFilter(list);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
    public Object q = null;
    public Object a(Object) { return null; }
}
