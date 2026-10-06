package com.github.rudroid.widget;

import androidx.compose.runtime.d0;
import androidx.compose.runtime.j3;
import androidx.compose.runtime.t;
import com.github.rudroid.issueorpullrequest.navigation.IssueOrPullRequestEntryPointRoute;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.contribution.ContributionWidgetModel;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetModel;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;
import com.github.service.models.response.ContributionLevel;
import com.github.service.models.response.PullRequestWidgetData$;
import d1.g2;
import d1.k1;
import d1.l1;
import f0.b1;
import f0.i0;
import f0.n1;
import f0.z1;
import f1.a4;
import f1.h4;
import f1.j4;
import f1.y1;
import java.lang.annotation.Annotation;
import k81.c1Shadow;
import k81.f0;
import k81.q1;
import k81.z;
import l3.v;
import v71.l0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ p(int i) {
        this.r = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return new z("com.github.rudroid.widget.WidgetUIState.SignedOut", WidgetUIState.SignedOut.INSTANCE, new Annotation[0]);
            case 1:
                return new z("com.github.rudroid.widget.WidgetUIState.Waiting", WidgetUIState.Waiting.INSTANCE, new Annotation[0]);
            case 2:
                ContributionWidgetModel.Companion companion = ContributionWidgetModel.Companion;
                return new f0(q1.a, new k81.d(new k81.d(c1Shadow.f("com.github.service.models.response.ContributionLevel", ContributionLevel.values()), 0), 0), 1);
            case 3:
                ContributionWidgetModel.Companion companion2 = ContributionWidgetModel.Companion;
                return WidgetUIState.Companion.serializer();
            case 4:
                PullRequestsWidgetModel.Companion companion3 = PullRequestsWidgetModel.Companion;
                return new f0(q1.a, PullRequestWidgetData$.serializer.INSTANCE, 1);
            case 5:
                PullRequestsWidgetModel.Companion companion4 = PullRequestsWidgetModel.Companion;
                return WidgetUIState.Companion.serializer();
            case 6:
                PullRequestsWidgetSettingsActivity.a aVar = PullRequestsWidgetSettingsActivity.Companion;
                return t.B(Boolean.FALSE);
            case 7:
                PullRequestsWidgetSettingsActivity.a aVar2 = PullRequestsWidgetSettingsActivity.Companion;
                return t.B(Boolean.FALSE);
            case 8:
                ShortcutWidgetSettingsActivity.a aVar3 = ShortcutWidgetSettingsActivity.Companion;
                return t.B(Boolean.FALSE);
            case 9:
                ShortcutWidgetSettingsActivity.a aVar4 = ShortcutWidgetSettingsActivity.Companion;
                return t.B(Boolean.FALSE);
            case 10:
                c81.e eVar = l0.a;
                return c81.d.t;
            case 11:
                return new k1(1L);
            case 12:
                d0 d0Var = l1.a;
                return null;
            case 13:
                return g2.b;
            case 14:
                d0 d0Var2 = d7.a.a;
                return null;
            case 15:
                return a0.a;
            case 16:
                d0 d0Var3 = e.e.a;
                return null;
            case 17:
                return new z("com.github.rudroid.issueorpullrequest.navigation.IssueOrPullRequestEntryPointRoute", IssueOrPullRequestEntryPointRoute.INSTANCE, new Annotation[0]);
            case 18:
                d0 d0Var4 = b1.a;
                return i0.a;
            case 19:
                return new n1();
            case 20:
                return new z1(0);
            case 21:
                float f = f1.l.a;
                return a4.a;
            case 22:
                d0 d0Var5 = f1.t.a;
                return h4.a;
            case 23:
                d0 d0Var6 = f1.t.a;
                return j4.a;
            case 24:
                long j = j1.k.z;
                return new y1(j, j1.k.j, j1.k.A, j1.k.k, j1.k.e, j1.k.E, j1.k.n, j1.k.F, j1.k.o, j1.k.R, j1.k.t, j1.k.S, j1.k.u, j1.k.a, j1.k.g, j1.k.I, j1.k.r, j1.k.Q, j1.k.s, j, j1.k.f, j1.k.d, j1.k.b, j1.k.h, j1.k.c, j1.k.i, j1.k.x, j1.k.y, j1.k.D, j1.k.J, j1.k.P, j1.k.K, j1.k.L, j1.k.M, j1.k.N, j1.k.O, j1.k.B, j1.k.C, j1.k.l, j1.k.m, j1.k.G, j1.k.H, j1.k.p, j1.k.q, j1.k.T, j1.k.U, j1.k.v, j1.k.w);
            case 25:
                j3 j3Var = f1.z1.a;
                return Boolean.TRUE;
            case 26:
                return t.B(new v(7, 0L, (String) null));
            case 27:
                return t.B(Boolean.FALSE);
            case 28:
                return Float.valueOf(0.0f);
            default:
                return Float.valueOf(1.0f);
        }
    }
}
