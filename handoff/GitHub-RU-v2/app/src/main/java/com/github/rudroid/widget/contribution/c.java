package com.github.rudroid.widget.contribution;

import android.content.Context;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetModel;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.service.models.response.PullRequestWidgetData;
import java.util.List;
import java.util.Map;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ z5.k t;

    public /* synthetic */ c(Context context, z5.k kVar, int i) {
        this.r = i;
        this.s = context;
        this.t = kVar;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    final m6.e a = com.github.rudroid.widget.o.a(sVar);
                    final int i2 = 0;
                    final Context context = this.s;
                    final z5.k kVar = this.t;
                    sy.q.a(null, r1.i.d(-1517342018, new j71.e() { // from class: com.github.rudroid.widget.contribution.d
                        public final Object s(Object obj3, Object obj4) {
                            switch (i2) {
                                case 0:
                                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        sVar2.d0(-534706435);
                                        Object j = sVar2.j(z5.g.c);
                                        if (j == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.github.rudroid.widget.contribution.ContributionWidgetModel");
                                        }
                                        ContributionWidgetModel contributionWidgetModel = (ContributionWidgetModel) j;
                                        WidgetUIState widgetUIState = contributionWidgetModel.b;
                                        sVar2.q(false);
                                        ContributionWidgetSettingsActivity.Companion.getClass();
                                        Context context2 = context;
                                        k71.k.g(context2, "context");
                                        z5.k kVar2 = kVar;
                                        k71.k.g(kVar2, "glanceId");
                                        String string = ContributionWidgetSettingsActivity.a.a(context2).getString("selected_contribution_user" + kVar2, null);
                                        String string2 = context2.getString(2131954950);
                                        k71.k.f(string2, "getString(...)");
                                        boolean b = k71.k.b(widgetUIState, WidgetUIState.Loading.INSTANCE);
                                        m6.e eVar = a;
                                        if (b || k71.k.b(widgetUIState, WidgetUIState.Retrying.INSTANCE) || k71.k.b(widgetUIState, WidgetUIState.Waiting.INSTANCE)) {
                                            sVar2.c0(1395151346);
                                            com.github.rudroid.widget.b.a(widgetUIState, eVar, sVar2, 0);
                                            sVar2.q(false);
                                        } else if (widgetUIState instanceof WidgetUIState.Error) {
                                            sVar2.c0(1395396463);
                                            boolean h = sVar2.h(context2);
                                            Object N = sVar2.N();
                                            if (h || N == androidx.compose.runtime.n.a) {
                                                N = new com.github.rudroid.views.m(context2, 4);
                                                sVar2.n0(N);
                                            }
                                            com.github.rudroid.widget.l.a(0, sVar2, (j71.a) N, string2, eVar, null);
                                            sVar2.q(false);
                                        } else if (k71.k.b(widgetUIState, WidgetUIState.SignedOut.INSTANCE)) {
                                            sVar2.c0(1395760744);
                                            com.github.rudroid.widget.n.a(eVar, sVar2, 0);
                                            sVar2.q(false);
                                        } else {
                                            if (!k71.k.b(widgetUIState, WidgetUIState.Loaded.INSTANCE)) {
                                                throw f1.e.r(2123211989, sVar2, false);
                                            }
                                            sVar2.c0(1395890045);
                                            List list = (List) contributionWidgetModel.a.get(string);
                                            if (list == null) {
                                                sVar2.c0(1396003040);
                                                com.github.rudroid.widget.n.a(eVar, sVar2, 0);
                                                sVar2.q(false);
                                            } else {
                                                sVar2.c0(1396107510);
                                                k.b(list, sVar2, 0);
                                                sVar2.q(false);
                                            }
                                            sVar2.q(false);
                                        }
                                    } else {
                                        sVar2.V();
                                    }
                                    return a0.a;
                                default:
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        sVar3.d0(-534706435);
                                        Object j2 = sVar3.j(z5.g.c);
                                        if (j2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.github.rudroid.widget.pullrequests.PullRequestsWidgetModel");
                                        }
                                        PullRequestsWidgetModel pullRequestsWidgetModel = (PullRequestsWidgetModel) j2;
                                        WidgetUIState widgetUIState2 = pullRequestsWidgetModel.b;
                                        sVar3.q(false);
                                        PullRequestsWidgetSettingsActivity.Companion.getClass();
                                        Context context3 = context;
                                        k71.k.g(context3, "context");
                                        z5.k kVar3 = kVar;
                                        k71.k.g(kVar3, "glanceId");
                                        String a2 = PullRequestsWidgetSettingsActivity.a.a(PullRequestsWidgetSettingsActivity.a.b(context3), kVar3);
                                        String string3 = context3.getString(2131954952);
                                        k71.k.f(string3, "getString(...)");
                                        boolean b2 = k71.k.b(widgetUIState2, WidgetUIState.Loading.INSTANCE);
                                        m6.e eVar2 = a;
                                        if (b2 || k71.k.b(widgetUIState2, WidgetUIState.Retrying.INSTANCE) || k71.k.b(widgetUIState2, WidgetUIState.Waiting.INSTANCE)) {
                                            sVar3.c0(1238806643);
                                            com.github.rudroid.widget.b.a(widgetUIState2, eVar2, sVar3, 0);
                                            sVar3.q(false);
                                        } else if (widgetUIState2 instanceof WidgetUIState.Error) {
                                            sVar3.c0(1239044072);
                                            boolean h2 = sVar3.h(context3);
                                            Object N2 = sVar3.N();
                                            if (h2 || N2 == androidx.compose.runtime.n.a) {
                                                N2 = new com.github.rudroid.views.m(context3, 5);
                                                sVar3.n0(N2);
                                            }
                                            com.github.rudroid.widget.l.a(0, sVar3, (j71.a) N2, string3, eVar2, null);
                                            sVar3.q(false);
                                        } else if (k71.k.b(widgetUIState2, WidgetUIState.SignedOut.INSTANCE)) {
                                            sVar3.c0(1239408353);
                                            com.github.rudroid.widget.n.a(eVar2, sVar3, 0);
                                            sVar3.q(false);
                                        } else {
                                            if (!k71.k.b(widgetUIState2, WidgetUIState.Loaded.INSTANCE)) {
                                                throw f1.e.r(-1622608951, sVar3, false);
                                            }
                                            sVar3.c0(1239542521);
                                            Map map = pullRequestsWidgetModel.a;
                                            PullRequestWidgetData pullRequestWidgetData = map != null ? (PullRequestWidgetData) map.get(a2) : null;
                                            if (pullRequestWidgetData == null) {
                                                sVar3.c0(1239664537);
                                                com.github.rudroid.widget.n.a(eVar2, sVar3, 0);
                                                sVar3.q(false);
                                            } else {
                                                sVar3.c0(1239773440);
                                                com.github.rudroid.widget.pullrequests.u.a(null, pullRequestWidgetData, eVar2, sVar3, 0);
                                                sVar3.q(false);
                                            }
                                            sVar3.q(false);
                                        }
                                    } else {
                                        sVar3.V();
                                    }
                                    return a0.a;
                            }
                        }
                    }, sVar), sVar, 48);
                } else {
                    sVar.V();
                }
                break;
            default:
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    final m6.e a2 = com.github.rudroid.widget.o.a(sVar);
                    final int i3 = 1;
                    final Context context2 = this.s;
                    final z5.k kVar2 = this.t;
                    sy.q.a(null, r1.i.d(127920325, new j71.e() { // from class: com.github.rudroid.widget.contribution.d
                        public final Object s(Object obj3, Object obj4) {
                            switch (i3) {
                                case 0:
                                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        sVar2.d0(-534706435);
                                        Object j = sVar2.j(z5.g.c);
                                        if (j == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.github.rudroid.widget.contribution.ContributionWidgetModel");
                                        }
                                        ContributionWidgetModel contributionWidgetModel = (ContributionWidgetModel) j;
                                        WidgetUIState widgetUIState = contributionWidgetModel.b;
                                        sVar2.q(false);
                                        ContributionWidgetSettingsActivity.Companion.getClass();
                                        Context context22 = context2;
                                        k71.k.g(context22, "context");
                                        z5.k kVar22 = kVar2;
                                        k71.k.g(kVar22, "glanceId");
                                        String string = ContributionWidgetSettingsActivity.a.a(context22).getString("selected_contribution_user" + kVar22, null);
                                        String string2 = context22.getString(2131954950);
                                        k71.k.f(string2, "getString(...)");
                                        boolean b = k71.k.b(widgetUIState, WidgetUIState.Loading.INSTANCE);
                                        m6.e eVar = a2;
                                        if (b || k71.k.b(widgetUIState, WidgetUIState.Retrying.INSTANCE) || k71.k.b(widgetUIState, WidgetUIState.Waiting.INSTANCE)) {
                                            sVar2.c0(1395151346);
                                            com.github.rudroid.widget.b.a(widgetUIState, eVar, sVar2, 0);
                                            sVar2.q(false);
                                        } else if (widgetUIState instanceof WidgetUIState.Error) {
                                            sVar2.c0(1395396463);
                                            boolean h = sVar2.h(context22);
                                            Object N = sVar2.N();
                                            if (h || N == androidx.compose.runtime.n.a) {
                                                N = new com.github.rudroid.views.m(context22, 4);
                                                sVar2.n0(N);
                                            }
                                            com.github.rudroid.widget.l.a(0, sVar2, (j71.a) N, string2, eVar, null);
                                            sVar2.q(false);
                                        } else if (k71.k.b(widgetUIState, WidgetUIState.SignedOut.INSTANCE)) {
                                            sVar2.c0(1395760744);
                                            com.github.rudroid.widget.n.a(eVar, sVar2, 0);
                                            sVar2.q(false);
                                        } else {
                                            if (!k71.k.b(widgetUIState, WidgetUIState.Loaded.INSTANCE)) {
                                                throw f1.e.r(2123211989, sVar2, false);
                                            }
                                            sVar2.c0(1395890045);
                                            List list = (List) contributionWidgetModel.a.get(string);
                                            if (list == null) {
                                                sVar2.c0(1396003040);
                                                com.github.rudroid.widget.n.a(eVar, sVar2, 0);
                                                sVar2.q(false);
                                            } else {
                                                sVar2.c0(1396107510);
                                                k.b(list, sVar2, 0);
                                                sVar2.q(false);
                                            }
                                            sVar2.q(false);
                                        }
                                    } else {
                                        sVar2.V();
                                    }
                                    return a0.a;
                                default:
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        sVar3.d0(-534706435);
                                        Object j2 = sVar3.j(z5.g.c);
                                        if (j2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type com.github.rudroid.widget.pullrequests.PullRequestsWidgetModel");
                                        }
                                        PullRequestsWidgetModel pullRequestsWidgetModel = (PullRequestsWidgetModel) j2;
                                        WidgetUIState widgetUIState2 = pullRequestsWidgetModel.b;
                                        sVar3.q(false);
                                        PullRequestsWidgetSettingsActivity.Companion.getClass();
                                        Context context3 = context2;
                                        k71.k.g(context3, "context");
                                        z5.k kVar3 = kVar2;
                                        k71.k.g(kVar3, "glanceId");
                                        String a22 = PullRequestsWidgetSettingsActivity.a.a(PullRequestsWidgetSettingsActivity.a.b(context3), kVar3);
                                        String string3 = context3.getString(2131954952);
                                        k71.k.f(string3, "getString(...)");
                                        boolean b2 = k71.k.b(widgetUIState2, WidgetUIState.Loading.INSTANCE);
                                        m6.e eVar2 = a2;
                                        if (b2 || k71.k.b(widgetUIState2, WidgetUIState.Retrying.INSTANCE) || k71.k.b(widgetUIState2, WidgetUIState.Waiting.INSTANCE)) {
                                            sVar3.c0(1238806643);
                                            com.github.rudroid.widget.b.a(widgetUIState2, eVar2, sVar3, 0);
                                            sVar3.q(false);
                                        } else if (widgetUIState2 instanceof WidgetUIState.Error) {
                                            sVar3.c0(1239044072);
                                            boolean h2 = sVar3.h(context3);
                                            Object N2 = sVar3.N();
                                            if (h2 || N2 == androidx.compose.runtime.n.a) {
                                                N2 = new com.github.rudroid.views.m(context3, 5);
                                                sVar3.n0(N2);
                                            }
                                            com.github.rudroid.widget.l.a(0, sVar3, (j71.a) N2, string3, eVar2, null);
                                            sVar3.q(false);
                                        } else if (k71.k.b(widgetUIState2, WidgetUIState.SignedOut.INSTANCE)) {
                                            sVar3.c0(1239408353);
                                            com.github.rudroid.widget.n.a(eVar2, sVar3, 0);
                                            sVar3.q(false);
                                        } else {
                                            if (!k71.k.b(widgetUIState2, WidgetUIState.Loaded.INSTANCE)) {
                                                throw f1.e.r(-1622608951, sVar3, false);
                                            }
                                            sVar3.c0(1239542521);
                                            Map map = pullRequestsWidgetModel.a;
                                            PullRequestWidgetData pullRequestWidgetData = map != null ? (PullRequestWidgetData) map.get(a22) : null;
                                            if (pullRequestWidgetData == null) {
                                                sVar3.c0(1239664537);
                                                com.github.rudroid.widget.n.a(eVar2, sVar3, 0);
                                                sVar3.q(false);
                                            } else {
                                                sVar3.c0(1239773440);
                                                com.github.rudroid.widget.pullrequests.u.a(null, pullRequestWidgetData, eVar2, sVar3, 0);
                                                sVar3.q(false);
                                            }
                                            sVar3.q(false);
                                        }
                                    } else {
                                        sVar3.V();
                                    }
                                    return a0.a;
                            }
                        }
                    }, sVar), sVar, 48);
                } else {
                    sVar.V();
                }
                break;
        }
        return a0.a;
    }
    public Object v(Object p1) { return null; }
    public Object v(Object p1) { return null; }
}
