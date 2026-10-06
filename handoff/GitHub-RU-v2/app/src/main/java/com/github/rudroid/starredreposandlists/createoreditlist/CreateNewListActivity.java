package com.github.rudroid.starredreposandlists.createoreditlist;

import android.os.Bundle;
import androidx.lifecycle.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CreateNewListActivity extends b1 {
    public static final a Companion = new a();
    public final l1 t0;
    public final w61.p u0;

    public static final class a {
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return CreateNewListActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CreateNewListActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CreateNewListActivity.this.g0();
        }
    }

    public CreateNewListActivity() {
        this.s0 = false;
        C(new a1(this));
        this.t0 = new l1(k71.x.a(r.class), new c(), new b(), new d());
        this.u0 = sy.w.t(new com.github.rudroid.starredreposandlists.createoreditlist.c(this, 0));
    }

    public final r J0() {
        return (r) this.t0.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.github.rudroid.utilities.w0.a(J0().x, this, androidx.lifecycle.w.u, new e(this, null));
        com.github.rudroid.utilities.w0.a(new y00.l(J0().s.s, 10), this, androidx.lifecycle.w.u, new f(this, null));
        e.c.a(this, new r1.d(new com.github.rudroid.starredreposandlists.createoreditlist.d(0, this), true, -108564964));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*com.github.rudroid.activities.m0*/.onResume();
        String string = getString(2131953727);
        k71.k.f(string, "getString(...)");
        ((com.github.rudroid.utilities.b) this.u0.getValue()).b(string);
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object K0(Object... a) {
        return null;
    }

    public static Object g0(Object... a) {
        return null;
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object getString(Object... a) {
        return null;
    }

    public static Object c0(Object... a) {
        return null;
    }
}
