package com.github.rudroid.shortcuts.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyboardShortcutGroup;
import android.view.KeyboardShortcutInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.fragments.GitHubFragment;
import com.github.rudroid.shortcuts.activities.ConfigureShortcutActivity;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.rudroid.shortcuts.q;
import com.github.rudroid.utilities.k2;
import com.github.rudroid.views.ProgressActionView;
import com.github.rudroid.views.UiStateRecyclerView;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import jg.e;
import jg.j;
import l7.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutsOverviewFragment extends Hilt_ShortcutsOverviewFragment<ic.l0> implements jf.b<q.e>, e.a, j.a, com.github.rudroid.fragments.util.f {
    public final int E0 = 2131558447;
    public com.github.rudroid.activities.util.c F0;
    public com.github.rudroid.utilities.e G0;
    public l1 H0;
    public com.github.rudroid.shortcuts.d0 I0;
    public l7.x J0;
    public MenuItem K0;
    public androidx.fragment.app.t L0;

    public static final class a extends com.github.rudroid.activities.util.e<wm.b, ig.a> {
        public final Intent R(Context context, Object obj) {
            wm.b bVar = (wm.b) obj;
            if (bVar != null) {
                ConfigureShortcutActivity.a aVar = ConfigureShortcutActivity.Companion;
                aVar.getClass();
                Intent intent = new Intent(context, (Class<?>) ConfigureShortcutActivity.class);
                ConfigureShortcutActivity.a.a(aVar, intent, bVar, false, 8);
                return intent;
            }
            ConfigureShortcutActivity.a aVar2 = ConfigureShortcutActivity.Companion;
            aVar2.getClass();
            Intent intent2 = new Intent(context, (Class<?>) ConfigureShortcutActivity.class);
            ConfigureShortcutActivity.a.a(aVar2, intent2, null, false, 15);
            return intent2;
        }

        public final Object y(Intent intent, int i) {
            Parcelable parcelable;
            if (intent == null || i != -1) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) intent.getParcelableExtra("CONFIGURE_SHORTCUT_RESULT_KEY", ig.a.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("CONFIGURE_SHORTCUT_RESULT_KEY");
                parcelable = (ig.a) (parcelableExtra instanceof ig.a ? parcelableExtra : null);
            }
            return (ig.a) parcelable;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return ShortcutsOverviewFragment.this;
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ b s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.s = bVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
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

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ShortcutsOverviewFragment.this.f0() : f0;
        }
    }

    public ShortcutsOverviewFragment() {
        w61.h s = sy.w.s(w61.i.s, new c(new b()));
        this.H0 = new l1(k71.xShadow.a(com.github.rudroid.shortcuts.n0.class), new d(s), new f(s), new e(s));
    }

    public static final void I4(ShortcutsOverviewFragment shortcutsOverviewFragment, boolean z) {
        MenuItem menuItem = shortcutsOverviewFragment.K0;
        if (menuItem != null) {
            menuItem.setActionView(z ? new ProgressActionView(shortcutsOverviewFragment.i4(), 0) : null);
        }
    }

    public final int C4() {
        return this.E0;
    }

    public final void H0(n1 n1Var) {
        l7.x xVar = this.J0;
        if (xVar != null) {
            xVar.t(n1Var);
        } else {
            k71.k.m("itemTouchHelper");
            throw null;
        }
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.F0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final com.github.rudroid.shortcuts.n0 J4() {
        return (com.github.rudroid.shortcuts.n0) this.H0.getValue();
    }

    public final void P3(Bundle bundle) {
        super/*com.github.rudroid.fragments.GitHubFragment*/.P3(bundle);
        com.github.rudroid.activities.util.c cVar = this.F0;
        if (cVar == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        this.L0 = f4(new x0(this), new a(cVar));
    }

    public final void T3() {
        com.github.rudroid.main.f g4 = g4();
        com.github.rudroid.main.f fVar = g4 instanceof com.github.rudroid.main.f ? g4 : null;
        if (fVar != null) {
            fVar.o((KeyboardShortcutGroup) null);
        }
        super.T3();
    }

    @Override // jg.e.a
    public final void a2(wm.b bVar) {
        k71.k.g(bVar, "item");
        y1 y1Var = J4().z;
        y1Var.k((Object) null, x61.m.j0((Iterable) y1Var.getValue(), bVar));
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.github.rudroid.views.UiStateRecyclerView] */
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            com.github.rudroid.main.navigation.f.a(sy.s.i(this), "CONFIGURE_SHORTCUT_RESULT_KEY", F3(), new p0(this, 2));
        }
        com.github.rudroid.main.f g4 = g4();
        com.github.rudroid.main.f fVar = g4 instanceof com.github.rudroid.main.f ? g4 : null;
        if (fVar != null) {
            fVar.o(new KeyboardShortcutGroup(C3(2131952989), x61.l.r(new KeyboardShortcutInfo[]{new KeyboardShortcutInfo(C3(2131952988), 19, 1), new KeyboardShortcutInfo(C3(2131952987), 20, 1)})));
        }
        com.github.rudroid.shortcuts.d0 d0Var = new com.github.rudroid.shortcuts.d0(this, this, new x0(this), this, i4());
        this.I0 = d0Var;
        this.J0 = new l7.x(new jf.a(d0Var));
        Object recyclerView = B4().Q.getRecyclerView();
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        com.github.rudroid.shortcuts.d0 d0Var2 = this.I0;
        if (d0Var2 == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        UiStateRecyclerView.w0(recyclerView, sy.d0Shadow.n(d0Var2), true, 4);
        l7.x xVar = this.J0;
        if (xVar == null) {
            k71.k.m("itemTouchHelper");
            throw null;
        }
        xVar.i((RecyclerView) recyclerView);
        B4().Q.setEnabled(false);
        B4().Q.getNestedScrollView().setFocusable(false);
        BindingFragment.D4(this, new a1(this), C3(2131954631), (String) null, 12);
        com.github.rudroid.utilities.w0.a(J4().B, F3(), androidx.lifecycle.w.u, new y0(this, null));
    }

    @Override // jg.e.a
    public final void h3(wm.b bVar) {
        k71.k.g(bVar, "item");
        if (sy.u.i(bVar)) {
            GitHubFragment.z4(this, C3(2131954623), 0, (m0.b) null, (ViewGroup) null, (k2.a) null, (ComposeView) null, 62);
            return;
        }
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            x6.a0 i = sy.s.i(this);
            k71.k.g(i, "<this>");
            com.github.rudroid.main.navigation.f.c(i, new ConfigureShortcutRoute(bVar, true, false, false, true), (x6.d0) null, 6);
        } else {
            androidx.fragment.app.t tVar = this.L0;
            if (tVar != null) {
                tVar.a(bVar);
            } else {
                k71.k.m("shortcutConfigurationLauncher");
                throw null;
            }
        }
    }

    @Override // jg.j.a
    public final void t(wm.b bVar) {
        k71.k.g(bVar, "item");
        J4().Q(bVar);
        com.github.rudroid.utilities.e eVar = this.G0;
        if (eVar == null) {
            k71.k.m("analytics");
            throw null;
        }
        com.github.rudroid.activities.util.c cVar = this.F0;
        if (cVar != null) {
            eVar.a(cVar.d(), new wj.e(MobileAppElement.SHORTCUT_SUGGESTIONS_LIST_ITEM, MobileAppAction.PRESS, com.github.rudroid.shortcuts.r.c(bVar), null, 8));
        } else {
            k71.k.m("accountHolder");
            throw null;
        }
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object i4(Object... a) {
        return null;
    }

    public static Object f4(Object... a) {
        return null;
    }

    public static Object g4(Object... a) {
        return null;
    }

    public static Object F3(Object... a) {
        return null;
    }

    public static Object C3(Object... a) {
        return null;
    }

    public static Object B4(Object... a) {
        return null;
    }
    public Object f4(Object p1, Object p2) { return null; }
}
