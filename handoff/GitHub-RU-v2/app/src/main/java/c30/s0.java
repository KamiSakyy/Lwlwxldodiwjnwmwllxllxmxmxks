package c30;

import androidx.core.widget.NestedScrollView;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.z6;
import hc0.kz;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, f5.e, a71.g {
    public static final /* synthetic */ s0 s = new s0(3);
    public static final /* synthetic */ s0 t = new s0(4);
    public static final /* synthetic */ s0 u = new s0(5);
    public static final /* synthetic */ s0 v = new s0(6);
    public final /* synthetic */ int r;

    public /* synthetic */ s0(int i) {
        this.r = i;
    }

    public void a(NestedScrollView nestedScrollView) {
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.l.b();
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.F.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.w0.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) k7.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List list = d30.f.a;
        List list2 = d30.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == s0.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(u0.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(s0.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            z = ((Boolean) bVar.a(str, k81.g.a)).booleanValue();
        } else {
            z = false;
        }
        return new NotificationImportantFilter(2, z, z2);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class NestedScrollView<T1,T2,T3,T4> {
        public NestedScrollView() {
        }
    }
}
