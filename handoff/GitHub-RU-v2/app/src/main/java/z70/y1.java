package z70;

import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.google.android.gms.internal.measurement.g9;
import com.google.firebase.components.ComponentRegistrar;
import hc0.lk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, m51.a {
    public static final /* synthetic */ y1 s = new y1(2);
    public static final /* synthetic */ y1 t = new y1(3);
    public static final /* synthetic */ y1 u = new y1(4);
    public static final /* synthetic */ y1 v = new y1(5);
    public static final /* synthetic */ y1 w = new y1(7);
    public final /* synthetic */ int r;

    public /* synthetic */ y1(int i) {
        this.r = i;
    }

    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (p41.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new p41.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new androidx.compose.foundation.lazy.layout.q1(7, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public Object c() {
        switch (this.r) {
            case 2:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.h7.b.b()).booleanValue());
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.f.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l2 = (Long) com.google.android.gms.internal.measurement.b7.e0.b();
                l2.getClass();
                return l2;
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) g9.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.g.a;
        List list2 = a80.g.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == y1.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(z1.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(y1.class).hashCode();
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
        return new DiscussionsIsUnansweredFilter(z);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
