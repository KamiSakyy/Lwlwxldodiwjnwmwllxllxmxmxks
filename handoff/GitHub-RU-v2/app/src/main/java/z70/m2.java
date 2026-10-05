package z70;

import com.github.domain.searchandfilter.filters.data.IsDraftFilter;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class m2 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, yn.a {
    public static final /* synthetic */ m2 s = new m2(2);
    public static final /* synthetic */ m2 t = new m2(3);
    public static final /* synthetic */ m2 u = new m2(4);
    public static final /* synthetic */ m2 v = new m2(5);
    public final /* synthetic */ int r;

    public /* synthetic */ m2(int i) {
        this.r = i;
    }

    public boolean a(CharSequence charSequence) {
        return false;
    }

    public Object c() {
        switch (this.r) {
            case 2:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.n7.a.b()).booleanValue());
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.f0.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.b7.j0.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool = (Boolean) o8.f.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.h.a;
        List list2 = a80.h.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == m2.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(w2.a, true);
    }

    public Object h() {
        return this;
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(m2.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        boolean z;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            z = ((Boolean) bVar.a(str, k81.g.a)).booleanValue();
        } else {
            z = false;
        }
        return new IsDraftFilter(z);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public String toString() {
        switch (this.r) {
            case 7:
                return "inter";
            default:
                return super.toString();
        }
    }
}
