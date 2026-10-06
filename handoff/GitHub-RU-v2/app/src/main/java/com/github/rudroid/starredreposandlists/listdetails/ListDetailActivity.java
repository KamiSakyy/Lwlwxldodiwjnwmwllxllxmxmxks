package com.github.rudroid.starredreposandlists.listdetails;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.starredreposandlists.navigation.ListDetailRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ListDetailActivity extends e<ic.d0> {
    public final int v0;
    public final com.github.rudroid.activities.util.g w0;
    public final com.github.rudroid.activities.util.g x0;
    public static final /* synthetic */ r71.e[] y0 = {new k71.m(ListDetailActivity.class, "login", "getLogin()Ljava/lang/String;", 0), h1.w(k71.x.a, ListDetailActivity.class, "slug", "getSlug()Ljava/lang/String;", 0)};
    public static final a Companion = new a();

    public static final class a {
    }

    public ListDetailActivity() {
        this.u0 = false;
        C(new d(this));
        this.v0 = 2131558443;
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_LOGIN");
        this.x0 = new com.github.rudroid.activities.util.g("EXTRA_SLUG");
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
        r71.e[] eVarArr = y0;
        x6.y yVar = new x6.y(s4.b.s, new ListDetailRoute((String) this.w0.c(this, eVarArr[0]), (String) this.x0.c(this, eVarArr[1])), (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.x.a(ListDetailRoute.class), x61.s.r, k71.x.a(ListDetailFragment.class)), yVar.j, yVar, s4);
    }
}
