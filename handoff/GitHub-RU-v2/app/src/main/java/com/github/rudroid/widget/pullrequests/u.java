package com.github.rudroid.widget.pullrequests;

import android.content.res.Resources;
import androidx.compose.runtime.b2;
import com.github.rudroid.widget.pullrequests.r;
import com.github.service.models.response.PullRequestWidgetData;
import com.github.service.models.response.PullsWidgetFilter;
import kotlin.NoWhenBranchMatchedException;
import w2.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final void a(z5.n nVar, PullRequestWidgetData pullRequestWidgetData, m6.e eVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        z5.n nVar2;
        sVar.e0(-407132493);
        int i2 = i | 6 | (sVar.h(pullRequestWidgetData) ? 32 : 16) | (sVar.f(eVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            z5.n C = i21.a.C(com.github.rudroid.widget.j.a(sVar), ih.a.n);
            z5.n nVar3 = z5.l.a;
            sVar2 = sVar;
            com.google.common.util.concurrent.a.a(C.d(nVar3), 0, 0, r1.i.d(999436413, new com.github.rudroid.settings.codeoptions.g(7, pullRequestWidgetData, eVar), sVar), sVar2, 3072, 6);
            nVar2 = nVar3;
        } else {
            sVar2 = sVar;
            sVar2.V();
            nVar2 = nVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new s(nVar2, pullRequestWidgetData, eVar, i, 0);
        }
    }

    public static final void b(z5.n nVar, PullRequestWidgetData pullRequestWidgetData, m6.e eVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        int i2;
        sVar.e0(98693266);
        int i3 = (sVar.h(pullRequestWidgetData) ? 32 : 16) | i | (sVar.f(eVar) ? 256 : 128);
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            Resources resources = (Resources) sVar.j(j0.c);
            PullsWidgetFilter pullsWidgetFilter = pullRequestWidgetData.a;
            k71.k.g(pullsWidgetFilter, "<this>");
            int i4 = r.a.a[pullsWidgetFilter.ordinal()];
            if (i4 == 1) {
                i2 = 2131820606;
            } else if (i4 == 2) {
                i2 = 2131820608;
            } else if (i4 == 3) {
                i2 = 2131820605;
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2131820607;
            }
            int i5 = pullRequestWidgetData.b;
            String quantityString = resources.getQuantityString(i2, i5, Integer.valueOf(i5));
            k71.k.f(quantityString, "getQuantityString(...)");
            sVar2 = sVar;
            k21.f.a(k41.b.t(nVar), 0, 1, r1.i.d(-942923530, new t(quantityString, eVar, 0), sVar), sVar2, 3072, 2);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new s(nVar, pullRequestWidgetData, eVar, i, 1);
        }
    }
}
