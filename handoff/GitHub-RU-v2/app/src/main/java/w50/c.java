package w50;

import aa.p0;
import aa.q0;
import android.content.Context;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.rudroid.common.k0;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.z6;
import hc0.tb;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jn0.yf0;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import yz0.m2;
import yz0.n2;
import yz0.o2;
import yz0.r6;
import yz0.s6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, d51.e, k21.d, yf0 {
    public static final /* synthetic */ c s = new c(3);
    public static final /* synthetic */ c t = new c(4);
    public static final /* synthetic */ c u = new c(5);
    public final /* synthetic */ int r;

    public /* synthetic */ c(int i) {
        this.r = i;
    }

    public static ArrayList a(ArrayList arrayList, TimelineItem.LinkedItemConnectorType linkedItemConnectorType, String str) {
        r6 s6Var;
        k71.k.g(linkedItemConnectorType, "connectorType");
        k71.k.g(str, "actorDisplayName");
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            m2 m2Var = (o2) arrayList.get(i);
            if (m2Var instanceof m2) {
                m2 m2Var2 = m2Var;
                String str2 = m2Var2.u;
                String str3 = m2Var2.v;
                IssueState issueState = m2Var2.r;
                int i3 = m2Var2.w;
                CloseReason closeReason = m2Var2.s;
                ZonedDateTime now = ZonedDateTime.now();
                k71.k.f(now, "now(...)");
                s6Var = new r6(linkedItemConnectorType, str, i3, str2, str3, now, issueState, closeReason);
            } else {
                if (!(m2Var instanceof n2)) {
                    throw new NoWhenBranchMatchedException();
                }
                n2 n2Var = (n2) m2Var;
                PullRequestState pullRequestState = n2Var.r;
                int i4 = n2Var.x;
                String str4 = n2Var.v;
                String str5 = n2Var.w;
                boolean z = n2Var.s;
                boolean z2 = n2Var.t;
                ZonedDateTime now2 = ZonedDateTime.now();
                k71.k.f(now2, "now(...)");
                s6Var = new s6(linkedItemConnectorType, str, i4, str4, str5, now2, pullRequestState, z, z2);
            }
            arrayList2.add(s6Var);
            i = i2;
        }
        return arrayList2;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.L.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                j8.s.a();
                Long l2 = (Long) l8.b.b();
                l2.getClass();
                return l2;
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) t7.c.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        tb.Companion.getClass();
        q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List list = x50.a.a;
        List list2 = x50.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public d51.b e(c21.j jVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        p81.a aVar = jSONObject.has("session") ? new p81.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new p81.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new d51.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar, new d51.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == c.class;
            default:
                return super.equals(obj);
        }
    }

    public k21.c f(Context context, String str, k21.b bVar) {
        int a;
        k21.c cVar = new k21.c();
        int b = bVar.b(context, str);
        cVar.a = b;
        int i = 1;
        int i2 = 0;
        if (b != 0) {
            a = bVar.a(context, str, false);
            cVar.b = a;
        } else {
            a = bVar.a(context, str, true);
            cVar.b = a;
        }
        int i3 = cVar.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (a == 0) {
            i = 0;
            cVar.c = i;
            return cVar;
        }
        if (i2 >= a) {
            i = -1;
        }
        cVar.c = i;
        return cVar;
    }

    public p0 g() {
        return aa.c.c(e.a, false);
    }

    public Object h() {
        return this;
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
        k0 k0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            k0Var = (k0) bVar.a(str, new k81.z("com.github.rudroid.common.ReviewStatus", k0.values()));
        }
        k0Var = ReviewStatusFilter.x;
        return new ReviewStatusFilter(k0Var);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
