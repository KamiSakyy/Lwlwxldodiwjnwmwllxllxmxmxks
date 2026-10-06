package com.github.rudroid.shortcuts.activities;

import android.os.Bundle;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.advancedsearch.AdvancedSearchPageFragment;
import com.github.rudroid.advancedsearch.n;
import com.github.rudroid.discussions.DiscussionsTabFragment;
import com.github.rudroid.discussions.RepositoryDiscussionsTabFragment;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.fragments.RepoIssuesPageFragment;
import com.github.rudroid.fragments.RepoPullRequestsPageFragment;
import com.github.rudroid.fragments.ShortcutIssuesPageFragment;
import com.github.rudroid.fragments.ShortcutPullRequestPageFragment;
import com.github.rudroid.shortcuts.activities.ShortcutViewFragment;
import com.github.rudroid.viewmodels.e2;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ShortcutViewFragment$onViewCreated$1", f = "ShortcutViewFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ShortcutViewFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ShortcutViewFragment shortcutViewFragment, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutViewFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        r0 r0Var = new r0(this.w, cVar);
        r0Var.v = obj;
        return r0Var;
    }

    public final Object s(Object obj, Object obj2) {
        r0 r = r((a71.c) obj2, (fl.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        StoredShortcutModel storedShortcutModel;
        AdvancedSearchPageFragment repoIssuesPageFragment;
        fl.f fVar = (fl.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (i21.a.y(fVar) && (storedShortcutModel = (StoredShortcutModel) fVar.b) != null) {
            ShortcutType shortcutType = storedShortcutModel.y;
            ShortcutScope.SpecificRepository specificRepository = storedShortcutModel.x;
            ShortcutViewFragment shortcutViewFragment = this.w;
            ((com.github.rudroid.searchandfilter.q) shortcutViewFragment.I0.getValue()).W(storedShortcutModel.u, x61.rShadow.r);
            BindingFragment.D4(shortcutViewFragment, shortcutViewFragment.M0, storedShortcutModel.t, com.github.rudroid.shortcuts.r.i(specificRepository, shortcutViewFragment.i4(), shortcutType), 8);
            if (sy.u.i(storedShortcutModel)) {
                AdvancedSearchPageFragment.a aVar2 = AdvancedSearchPageFragment.Companion;
                String str = storedShortcutModel.s;
                aVar2.getClass();
                k71.k.g(str, "query");
                repoIssuesPageFragment = new AdvancedSearchPageFragment();
                n.a aVar3 = com.github.rudroid.advancedsearch.n.Companion;
                Bundle bundle = new Bundle();
                aVar3.getClass();
                bundle.putString("extra_query", str);
                repoIssuesPageFragment.n4(bundle);
            } else if (specificRepository instanceof ShortcutScope.AllRepositories) {
                int i = ShortcutViewFragment.a.a[shortcutType.ordinal()];
                if (i == 1) {
                    ShortcutIssuesPageFragment.Companion.getClass();
                    repoIssuesPageFragment = new ShortcutIssuesPageFragment();
                } else if (i == 2) {
                    ShortcutPullRequestPageFragment.Companion.getClass();
                    repoIssuesPageFragment = new ShortcutPullRequestPageFragment();
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    repoIssuesPageFragment = null;
                } else {
                    DiscussionsTabFragment.Companion.getClass();
                    repoIssuesPageFragment = new DiscussionsTabFragment();
                }
            } else {
                if (!(specificRepository instanceof ShortcutScope.SpecificRepository)) {
                    throw new NoWhenBranchMatchedException();
                }
                ShortcutScope.SpecificRepository specificRepository2 = specificRepository;
                String str2 = specificRepository2.t;
                String str3 = specificRepository2.s;
                int i2 = ShortcutViewFragment.a.a[shortcutType.ordinal()];
                if (i2 == 1) {
                    RepoIssuesPageFragment.Companion.getClass();
                    k71.k.g(str3, "repositoryOwner");
                    k71.k.g(str2, "repositoryName");
                    repoIssuesPageFragment = new RepoIssuesPageFragment();
                    e2.a aVar4 = e2.Companion;
                    Bundle bundle2 = new Bundle();
                    aVar4.getClass();
                    e2.a.a(str3, str2, bundle2);
                    repoIssuesPageFragment.n4(bundle2);
                } else if (i2 == 2) {
                    RepoPullRequestsPageFragment.Companion.getClass();
                    k71.k.g(str3, "repositoryOwner");
                    k71.k.g(str2, "repositoryName");
                    repoIssuesPageFragment = new RepoPullRequestsPageFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("EXTRA_REPO_OWNER", str3);
                    bundle3.putString("EXTRA_REPO_NAME", str2);
                    bundle3.putBoolean("EXTRA_HIDE_CREATE_PR_ENTRY", true);
                    repoIssuesPageFragment.n4(bundle3);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    repoIssuesPageFragment = null;
                } else {
                    RepositoryDiscussionsTabFragment.Companion.getClass();
                    repoIssuesPageFragment = RepositoryDiscussionsTabFragment.a.a(str3, str2, (DiscussionCategoryData) null);
                }
            }
            if (repoIssuesPageFragment != null) {
                androidx.fragment.app.a1 x3 = shortcutViewFragment.x3();
                k71.k.f(x3, "getChildFragmentManager(...)");
                androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(x3);
                aVar5.l(2131362366, repoIssuesPageFragment, (String) null);
                aVar5.g();
            }
            shortcutViewFragment.J4(storedShortcutModel);
        }
        return w61.a0.a;
    }
}
