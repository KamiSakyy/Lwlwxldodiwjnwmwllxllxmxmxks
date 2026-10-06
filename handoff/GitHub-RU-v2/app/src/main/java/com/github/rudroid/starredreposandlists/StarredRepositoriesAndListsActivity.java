package com.github.rudroid.starredreposandlists;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.starredreposandlists.navigation.StarredReposAndListsEntryPointRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class StarredRepositoriesAndListsActivity extends g<ic.d0> {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] x0;
    public int v0;
    public com.github.rudroid.activities.util.g w0;

    public static final class a {
    }

    static {
        r71.e pVar = new k71.p(StarredRepositoriesAndListsActivity.class, "login", "getLogin()Ljava/lang/String;", 0);
        k71.xShadow.a.getClass();
        x0 = new r71.e[]{pVar};
        Companion = new a();
    }

    public StarredRepositoriesAndListsActivity() {
        this.u0 = false;
        C(new f(this));
        this.v0 = 2131558443;
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_LOGIN", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(5));
    }

    public final int L0() {
        return this.v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavHostFragment E = H().E(2131363076);
        k71.k.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        x6.a0 s4 = E.s4();
        x6.y yVar = new x6.y(s4.b.s, new StarredReposAndListsEntryPointRoute((String) this.w0.c(this, x0[0])), (k71.e) null);
        mg.a.a(yVar);
        s4.g(yVar.h());
    }
    public Object C(Object p1) { return null; }
}
