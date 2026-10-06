package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import java.util.ArrayList;
import java.util.List;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableNotificationRepositoryFilterFragment extends Hilt_SelectableNotificationRepositoryFilterFragment<k> {
    public static final a Companion = new a();
    public final l1 H0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.h0.class), new c(), new e(), new d());
    public final l1 I0;
    public final l J0;

    public static final class a {
    }

    public static final class b implements androidx.lifecycle.q0, k71.g {
        public final /* synthetic */ n r;

        public b(n nVar) {
            this.r = nVar;
        }

        public final /* synthetic */ void a(Object obj) {
            this.r.k(obj);
        }

        public final w61.e b() {
            return this.r;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.q0) || !(obj instanceof k71.g)) {
                return false;
            }
            return this.r.equals(((k71.g) obj).b());
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return SelectableNotificationRepositoryFilterFragment.this.g4().K0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return SelectableNotificationRepositoryFilterFragment.this.g4().g0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public e() {
            super(0);
        }

        public final Object a() {
            return SelectableNotificationRepositoryFilterFragment.this.g4().f0();
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ o s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o oVar) {
            super(0);
            this.s = oVar;
        }

        public final Object a() {
            return ((SelectableNotificationRepositoryFilterFragment) this.s.s).j4();
        }
    }

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class i extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableNotificationRepositoryFilterFragment.this.f0() : f0;
        }
    }

    public SelectableNotificationRepositoryFilterFragment() {
        w61.h s = sy.w.s(w61.i.s, new f(new o(this, 1)));
        this.I0 = new l1(k71.x.a(s0.class), new g(s), new i(s), new h(s));
        this.J0 = new l(this);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment
    public final com.github.rudroid.searchandfilter.complexfilter.e0 H4() {
        return this.J0;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment
    public final com.github.rudroid.searchandfilter.complexfilter.d0 I4() {
        return (s0) this.I0.getValue();
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        l1 l1Var = this.I0;
        s0 s0Var = (s0) l1Var.getValue();
        d1.a(n1.y(new y00.l(s0Var.t.b, 10), s0Var.D)).e(F3(), new b(new n(this, 1)));
        if (bundle == null) {
            s0 s0Var2 = (s0) l1Var.getValue();
            List R = ((com.github.rudroid.searchandfilter.h0) this.H0.getValue()).R();
            ArrayList arrayList = new ArrayList();
            for (Object obj : R) {
                if (obj instanceof NotificationIsUnreadFilter) {
                    arrayList.add(obj);
                }
            }
            s0Var2.E = ((NotificationIsUnreadFilter) x61.m.U(arrayList)).v;
            s0Var2.S();
        }
    }


    public static  g4(Object... a) {
        return null;
    }

    public static  j4(Object... a) {
        return null;
    }

    public static  F3(Object... a) {
        return null;
    }
}
