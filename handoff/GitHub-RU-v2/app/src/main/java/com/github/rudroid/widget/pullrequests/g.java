package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.m2;
import androidx.compose.runtime.f1;
import androidx.lifecycle.d1;
import androidx.lifecycle.x;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker;
import com.github.service.models.response.PullsWidgetFilter;
import com.google.android.gms.internal.measurement.i4;
import v71.a0;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.f {
    public final /* synthetic */ f1 r;
    public final /* synthetic */ PullRequestsWidgetSettingsActivity s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ SharedPreferences u;
    public final /* synthetic */ f1 v;
    public final /* synthetic */ b6.c w;

    public /* synthetic */ g(f1 f1Var, PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity, Context context, SharedPreferences sharedPreferences, f1 f1Var2, b6.c cVar) {
        this.r = f1Var;
        this.s = pullRequestsWidgetSettingsActivity;
        this.t = context;
        this.u = sharedPreferences;
        this.v = f1Var2;
        this.w = cVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int intValue = ((Integer) obj3).intValue();
        PullRequestsWidgetSettingsActivity.a aVar = PullRequestsWidgetSettingsActivity.Companion;
        k71.k.g((m2) obj, "$this$PrimaryTopAppBar");
        if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
            String p0 = i4.p0(2131953209, sVar);
            final f1 f1Var = this.r;
            boolean z = f1Var.getValue() != null;
            boolean f = sVar.f(f1Var);
            final PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity = this.s;
            boolean h = f | sVar.h(pullRequestsWidgetSettingsActivity);
            final Context context = this.t;
            boolean h2 = h | sVar.h(context);
            final SharedPreferences sharedPreferences = this.u;
            boolean h3 = h2 | sVar.h(sharedPreferences);
            final f1 f1Var2 = this.v;
            boolean f2 = h3 | sVar.f(f1Var2);
            final b6.c cVar = this.w;
            boolean h4 = f2 | sVar.h(cVar);
            Object N = sVar.N();
            if (h4 || N == androidx.compose.runtime.n.a) {
                j71.a aVar2 = new j71.a() { // from class: com.github.rudroid.widget.pullrequests.f
                    public final Object a() {
                        PullRequestsWidgetSettingsActivity.a aVar3 = PullRequestsWidgetSettingsActivity.Companion;
                        String str = (String) f1Var.getValue();
                        if (str != null) {
                            PullsWidgetFilter pullsWidgetFilter = (PullsWidgetFilter) f1Var2.getValue();
                            PullRequestsWidgetSettingsActivity.Companion.getClass();
                            SharedPreferences sharedPreferences2 = sharedPreferences;
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            StringBuilder sb = new StringBuilder("selected_pulls_user");
                            b6.c cVar2 = cVar;
                            sb.append(cVar2);
                            edit.putString(sb.toString(), str);
                            edit.apply();
                            k71.k.g(pullsWidgetFilter, "filter");
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            edit2.putString("selected_pulls_filter" + cVar2, pullsWidgetFilter.name());
                            edit2.apply();
                            PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity2 = pullRequestsWidgetSettingsActivity;
                            x i = d1.i(pullRequestsWidgetSettingsActivity2);
                            Context context2 = context;
                            b0.z(i, (a71.h) null, (a0) null, new h(pullRequestsWidgetSettingsActivity2, context2, null), 3).o0(new com.github.rudroid.support.u(14, pullRequestsWidgetSettingsActivity2));
                            PullRequestsWidgetWorker.Companion.getClass();
                            PullRequestsWidgetWorker.a.a(context2);
                        }
                        return w61.a0.a;
                    }
                };
                sVar.n0(aVar2);
                N = aVar2;
            }
            qg.u.a(null, 2131231159, p0, 0L, 0L, false, z, (j71.a) N, sVar, 0, 57);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
