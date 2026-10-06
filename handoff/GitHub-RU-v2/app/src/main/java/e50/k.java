package e50;

import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.service.models.response.organizations.Organization;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.z6;
import hc0.o8;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x {
    public static k s;
    public static final /* synthetic */ k t = new k(3);
    public static final /* synthetic */ k u = new k(4);
    public static final /* synthetic */ k v = new k(5);
    public static final /* synthetic */ k w = new k(6);
    public final /* synthetic */ int r;

    public /* synthetic */ k(int i) {
        this.r = i;
    }

    public static final c21.h0 a(char c) {
        k kVar = o91.b.m;
        return c == '\"' ? j91.a.J : c == '\'' ? j91.a.I : c == '(' ? j91.a.K : c == ')' ? j91.a.L : c == '[' ? j91.a.M : c == ']' ? j91.a.N : c == '<' ? j91.a.O : c == '>' ? j91.a.P : j91.a.p0;
    }

    public static final int b(int i) {
        k kVar = o91.b.m;
        int i2 = i & 255;
        return i2 == i ? o91.b.p[i2] : o91.b.p[o91.b.o[i >> 8] | i2];
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.o0.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.t0.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.r0.b()).longValue());
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) u8.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List list = f50.b.a;
        List list2 = f50.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == k.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(l.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(k.class).hashCode();
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
            list = (List) bVar.a(str, new k81.d(Organization.Companion.serializer(), 0));
        }
        list = x61.rShadow.r;
        return new OrganizationFilter(list);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
