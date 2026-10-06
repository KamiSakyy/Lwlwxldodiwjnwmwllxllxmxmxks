package com.github.rudroid.starredreposandlists.createoreditlist;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.github.rudroid.starredreposandlists.navigation.EditListRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public final class EditListActivity extends d1<ic.d0> {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] x0;
    public int v0;
    public com.github.rudroid.activities.util.g w0;

    public static final class a {
    }

    static {
        r71.e mVar = new k71.m(EditListActivity.class, "slug", "getSlug()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        x0 = new r71.e[]{mVar};
        Companion = new a();
    }

    public EditListActivity() {
        this.u0 = false;
        C(new c1(this));
        this.v0 = 2131558443;
        this.w0 = new com.github.rudroid.activities.util.g("EXTRA_SLUG");
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
        x6.y yVar = new x6.y(s4.b.s, new EditListRoute((String) this.w0.c(this, x0[0])), (k71.e) null);
        com.github.rudroid.m0.D(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), k71.x.a(EditListRoute.class), x61.s.r, k71.x.a(EditListFragment.class)), yVar.j, yVar, s4);
    }

    public static Object C(Object... a) {
        return null;
    }
}
