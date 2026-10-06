package z70;

import android.os.SystemClock;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, a0.f0, p41.d, v11.a {
    public static final /* synthetic */ j3 s = new j3(2);
    public static final /* synthetic */ j3 t = new j3(3);
    public static final /* synthetic */ j3 u = new j3(4);
    public static final /* synthetic */ j3 v = new j3(5);
    public static final /* synthetic */ j3 w = new j3(7);
    public final /* synthetic */ int r;

    public /* synthetic */ j3(int i) {
        this.r = i;
    }

    public float a() {
        return 0.0f;
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public Object c() {
        switch (this.r) {
            case 2:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.z7.a.b()).booleanValue());
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.h0.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.b7.p.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool = (Boolean) o8.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.k.a;
        List list2 = a80.k.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public float e(float f, long j) {
        return 0.0f;
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == j3.class;
            default:
                return super.equals(obj);
        }
    }

    public /* synthetic */ Object f(androidx.lifecycle.b bVar) {
        return AnalyticsConnectorRegistrar.zza(bVar);
    }

    public aa.p0 g() {
        return aa.c.c(k3.a, false);
    }

    public float h(float f, float f2, long j) {
        return 0.0f;
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(j3.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    public long k(float f) {
        return 0L;
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        IssueType issueType;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            issueType = (IssueType) bVar.a(str, IssueType.Companion.serializer());
        } else {
            issueType = null;
        }
        return new IssueTypeFilter(issueType);
    }

    public float m(float f, float f2) {
        return 0.0f;
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
