package com.github.rudroid.users;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.domain.users.FetchUsersParams$FetchContributorsParams;
import com.github.domain.users.FetchUsersParams$FetchFollowersParams;
import com.github.domain.users.FetchUsersParams$FetchReacteesParams;
import com.github.domain.users.FetchUsersParams$FetchStargazersParams;
import com.github.domain.users.UserViewType$Contributors;
import com.github.domain.users.UserViewType$Followers;
import com.github.domain.users.UserViewType$Reactees;
import com.github.domain.users.UserViewType$Stargazers;
import com.github.rudroid.m0;
import com.github.rudroid.repository.navigation.UsersRoute;
import com.github.rudroid.viewmodels.za;
import ic.d0;
import java.util.Map;
import k71.xShadow;
import x6.a0;
import x6.y;
import yz0.u3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class UsersActivity extends b<d0> {
    public com.github.rudroid.activities.util.g v0;
    public com.github.rudroid.activities.util.g w0;
    public com.github.rudroid.activities.util.g x0;
    public int y0;
    public static final /* synthetic */ r71.e[] z0 = {new k71.p(UsersActivity.class, "userParams", "getUserParams()Lcom/github/domain/users/FetchUsersParams;", 0), m0.q(xShadow.a, UsersActivity.class, "userViewType", "getUserViewType()Lcom/github/domain/users/UserViewType;", 0), new k71.p(UsersActivity.class, "sourceEntity", "getSourceEntity()Ljava/lang/String;", 0)};
    public static final a Companion = new a();

    public static final class a {
        public static Intent a(Context context, String str, String str2) {
            k71.k.g(str, "repoId");
            za.a aVar = za.Companion;
            Intent intent = new Intent(context, (Class<?>) UsersActivity.class);
            FetchUsersParams$FetchContributorsParams fetchUsersParams$FetchContributorsParams = new FetchUsersParams$FetchContributorsParams(str);
            UserViewType$Contributors userViewType$Contributors = UserViewType$Contributors.INSTANCE;
            aVar.getClass();
            za.a.a(intent, fetchUsersParams$FetchContributorsParams, userViewType$Contributors, str2);
            return intent;
        }

        public static Intent b(Context context, String str, String str2) {
            k71.k.g(str, "userId");
            za.a aVar = za.Companion;
            Intent intent = new Intent(context, (Class<?>) UsersActivity.class);
            FetchUsersParams$FetchFollowersParams fetchUsersParams$FetchFollowersParams = new FetchUsersParams$FetchFollowersParams(str);
            UserViewType$Followers userViewType$Followers = UserViewType$Followers.INSTANCE;
            aVar.getClass();
            za.a.a(intent, fetchUsersParams$FetchFollowersParams, userViewType$Followers, str2);
            return intent;
        }

        public static Intent c(Context context, String str, u3 u3Var) {
            k71.k.g(str, "subject");
            za.a aVar = za.Companion;
            Intent intent = new Intent(context, (Class<?>) UsersActivity.class);
            FetchUsersParams$FetchReacteesParams fetchUsersParams$FetchReacteesParams = new FetchUsersParams$FetchReacteesParams(str, u3Var.a);
            UserViewType$Reactees userViewType$Reactees = UserViewType$Reactees.INSTANCE;
            String str2 = u3Var.b;
            aVar.getClass();
            za.a.a(intent, fetchUsersParams$FetchReacteesParams, userViewType$Reactees, str2);
            return intent;
        }

        public static Intent d(Context context, String str, String str2) {
            k71.k.g(str, "repoId");
            za.a aVar = za.Companion;
            Intent intent = new Intent(context, (Class<?>) UsersActivity.class);
            FetchUsersParams$FetchStargazersParams fetchUsersParams$FetchStargazersParams = new FetchUsersParams$FetchStargazersParams(str);
            UserViewType$Stargazers userViewType$Stargazers = UserViewType$Stargazers.INSTANCE;
            aVar.getClass();
            za.a.a(intent, fetchUsersParams$FetchStargazersParams, userViewType$Stargazers, str2);
            return intent;
        }
    }

    public UsersActivity() {
        this.u0 = false;
        C(new com.github.rudroid.users.a(this));
        this.v0 = new com.github.rudroid.activities.util.g("EXTRA_PARAMS", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(13));
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_VIEW_TYPE", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(14));
        this.x0 = new com.github.rudroid.activities.util.g("EXTRA_SOURCE_ENTITY", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(15));
        this.y0 = 2131558443;
    }

    public final int L0() {
        return this.y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavHostFragment E = H().E(2131363076);
        k71.k.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        a0 s4 = E.s4();
        r71.e[] eVarArr = z0;
        y yVar = new y(s4.b.s, new UsersRoute((gn.n) this.v0.c(this, eVarArr[0]), (com.github.domain.users.a) this.w0.c(this, eVarArr[1]), (String) this.x0.c(this, eVarArr[2])), (k71.e) null);
        yVar.j.add(new z6.i(m0.r(yVar.g, z6.e.class), xShadow.a(UsersRoute.class), (Map) ze.e.a, xShadow.a(UsersFragment.class)).a());
        ze.b.a(yVar);
        s4.g(yVar.h());
    }

    public static Object C(Object... a) {
        return null;
    }
}
