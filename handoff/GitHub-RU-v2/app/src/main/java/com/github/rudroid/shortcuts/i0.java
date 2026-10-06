package com.github.rudroid.shortcuts;

import android.content.Context;
import com.github.domain.database.GitHubDatabase;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.d5;
import java.util.List;
import rm0.r3Shadow;
import t00.f8;
import wy0.p4;
import y71.n1Shadow;

@c71.e(c = "com.github.rudroid.shortcuts.ShortcutsOverviewViewModel$1", f = "ShortcutsOverviewViewModel.kt", l = {54}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ n0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, a71.c cVar) {
        super(2, cVar);
        this.w = n0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        n0 n0Var = this.w;
        com.github.rudroid.activities.util.c cVar = n0Var.y;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            tm.d dVar = n0Var.u;
            Context applicationContext = n0Var.P().getApplicationContext();
            k71.k.f(applicationContext, "getApplicationContext(...)");
            dVar.getClass();
            com.github.rudroid.common.j0 j0Var = com.github.rudroid.common.j0.r;
            RepositoryVisibilityFilter repositoryVisibilityFilter = new RepositoryVisibilityFilter(j0Var);
            IssueUserRelationshipFilter issueUserRelationshipFilter = new IssueUserRelationshipFilter(com.github.rudroid.common.x.t);
            com.github.rudroid.common.w wVar = com.github.rudroid.common.w.r;
            IssueStatusFilter issueStatusFilter = new IssueStatusFilter(wVar);
            com.github.rudroid.common.m0 m0Var = com.github.rudroid.common.m0.r;
            List r = x61.l.r(new com.github.domain.searchandfilter.filters.data.d[]{repositoryVisibilityFilter, issueUserRelationshipFilter, issueStatusFilter, new SortFilter(m0Var)});
            ShortcutColor shortcutColor = ShortcutColor.GREEN;
            ShortcutIcon shortcutIcon = ShortcutIcon.EYE;
            ShortcutType shortcutType = ShortcutType.ISSUE;
            ShortcutScope.AllRepositories allRepositories = ShortcutScope.AllRepositories.INSTANCE;
            String string = applicationContext.getString(2131954612);
            k71.k.f(string, "getString(...)");
            ShortcutConfigurationModel shortcutConfigurationModel = new ShortcutConfigurationModel("is:open is:issue archived:false mentions:@me sort:created-desc", r, shortcutColor, shortcutIcon, allRepositories, shortcutType, string);
            List r2 = x61.l.r(new com.github.domain.searchandfilter.filters.data.d[]{new RepositoryVisibilityFilter(j0Var), new IssueUserRelationshipFilter(com.github.rudroid.common.x.s), new IssueStatusFilter(wVar), new SortFilter(m0Var)});
            ShortcutColor shortcutColor2 = ShortcutColor.RED;
            ShortcutIcon shortcutIcon2 = ShortcutIcon.TOOLS;
            String string2 = applicationContext.getString(2131954611);
            k71.k.f(string2, "getString(...)");
            ShortcutConfigurationModel shortcutConfigurationModel2 = new ShortcutConfigurationModel("is:open is:issue archived:false assignee:@me sort:created-desc", r2, shortcutColor2, shortcutIcon2, allRepositories, shortcutType, string2);
            List r3 = x61.l.r(new com.github.domain.searchandfilter.filters.data.d[]{new RepositoryVisibilityFilter(j0Var), new PullRequestUserRelationshipFilter(com.github.rudroid.common.h0.u), new PullRequestStatusFilter(com.github.rudroid.common.g0.r), new SortFilter(m0Var)});
            ShortcutColor shortcutColor3 = ShortcutColor.BLUE;
            ShortcutIcon shortcutIcon3 = ShortcutIcon.CODEREVIEW;
            ShortcutType shortcutType2 = ShortcutType.PULL_REQUEST;
            String string3 = applicationContext.getString(2131954615);
            k71.k.f(string3, "getString(...)");
            f8 f8Var = new f8(21, x61.l.r(new ShortcutConfigurationModel[]{shortcutConfigurationModel, shortcutConfigurationModel2, new ShortcutConfigurationModel("is:open is:pr review-requested:@me archived:false sort:created-desc", r3, shortcutColor3, shortcutIcon3, allRepositories, shortcutType2, string3)}));
            tm.g gVar = n0Var.v;
            oa.j d = cVar.d();
            gVar.getClass();
            zl.b bVar = gVar.a;
            bVar.getClass();
            r3Shadow r3Var = new r3Shadow(8, d5.B(((GitHubDatabase) bVar.a.a(d)).z().a, new String[]{"filter_bars"}, new p4(27)), gVar);
            tm.c cVar2 = n0Var.w;
            oa.j d2 = cVar.d();
            cVar2.getClass();
            um.r rVar = cVar2.a;
            rVar.getClass();
            r3Shadow l = n1Shadow.l(f8Var, r3Var, new um.j(rVar.a.b(d2), rVar, 0), new g0(4, null));
            h0 h0Var = new h0(n0Var);
            this.v = 1;
            if (l.b(h0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
