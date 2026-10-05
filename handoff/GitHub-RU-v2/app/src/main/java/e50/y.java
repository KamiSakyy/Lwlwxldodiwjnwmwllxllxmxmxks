package e50;

import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.z6;
import hc0.o8;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ y s = new y(3);
    public static final /* synthetic */ y t = new y(4);
    public static final /* synthetic */ y u = new y(5);
    public static final /* synthetic */ y v = new y(6);
    public final /* synthetic */ int r;

    public /* synthetic */ y(int i) {
        this.r = i;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.k0.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.s0.b()).longValue());
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.Z.b();
                l.getClass();
                return l;
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.n0.b()).longValue());
        }
    }

    public aa.m d() {
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List list = f50.d.a;
        List list2 = f50.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == y.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(z.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(y.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0019, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            list = (List) bVar.a(str, new k81.d(LegacyProjectWithNumber.Companion.serializer(), 0));
        }
        list = x61.r.r;
        return new ProjectFilter(list);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
