package com.github.rudroid.shortcuts.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.agents.w6;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.views.UiStateRecyclerView;
import com.github.service.models.response.shortcuts.ShortcutScope;
import ic.y1;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ChooseShortcutRepositoryFragment extends Hilt_ChooseShortcutRepositoryFragment<y1> implements com.github.rudroid.fragments.util.f, com.github.rudroid.interfaces.x0 {
    public com.github.rudroid.utilities.e E0;
    public com.github.rudroid.activities.util.c F0;
    public final int G0 = 2131558783;
    public xa.a H0;
    public final l1 I0;
    public final a J0;

    public static final class a implements a5.t {
        public a() {
        }

        public final boolean a0(MenuItem menuItem) {
            k71.k.g(menuItem, "menuItem");
            return false;
        }

        public final void o2(Menu menu, MenuInflater menuInflater) {
            k71.k.g(menu, "menu");
            k71.k.g(menuInflater, "menuInflater");
            menuInflater.inflate(2131689493, menu);
            MenuItem findItem = menu.findItem(2131363297);
            if (findItem != null) {
                ChooseShortcutRepositoryFragment chooseShortcutRepositoryFragment = ChooseShortcutRepositoryFragment.this;
                String string = chooseShortcutRepositoryFragment.B3().getString(2131953224);
                k71.k.f(string, "getString(...)");
                rc.h.a(findItem, string, new com.github.rudroid.shortcuts.activities.d(1, chooseShortcutRepositoryFragment, ChooseShortcutRepositoryFragment.class, "onItemSearch", "onItemSearch(Ljava/lang/String;)V", 0, 0), new com.github.rudroid.shortcuts.activities.e(1, chooseShortcutRepositoryFragment, ChooseShortcutRepositoryFragment.class, "onItemSearch", "onItemSearch(Ljava/lang/String;)V", 0, 0));
            }
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return ChooseShortcutRepositoryFragment.this;
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ChooseShortcutRepositoryFragment.this.f0() : f0;
        }
    }

    public ChooseShortcutRepositoryFragment() {
        w61.h s = sy.w.s(w61.i.s, new c(new b()));
        this.I0 = new l1(k71.x.a(w6.class), new d(s), new f(s), new e(s));
        this.J0 = new a();
    }

    public final void A(t7 t7Var) {
        androidx.lifecycle.a1 a2;
        k71.k.g(t7Var, "repository");
        Parcelable specificRepository = new ShortcutScope.SpecificRepository(t7Var.t, t7Var.r);
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            x6.k d2 = sy.s.i(this).d();
            if (d2 != null && (a2 = d2.a()) != null) {
                a2.c(specificRepository, "CHOOSE_SHORTCUT_REPOSITORY_RESULT_KEY");
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("CHOOSE_SHORTCUT_REPOSITORY_RESULT_KEY", specificRepository);
            g4().setResult(-1, intent);
        }
        g4().m().c();
    }

    public final int C4() {
        return this.G0;
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.F0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.github.rudroid.views.UiStateRecyclerView] */
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        BindingFragment.D4(this, this.J0, C3(2131952351), C3(2131954622), 8);
        ((TextView) ((k5.f) B4()).A.findViewById(2131363450)).setSingleLine(false);
        this.H0 = new xa.a(i4(), this);
        Object recyclerView = B4().Q.getRecyclerView();
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        l1 l1Var = this.I0;
        recyclerView.j(new vf.e((w6) l1Var.getValue()));
        xa.a aVar = this.H0;
        if (aVar == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        UiStateRecyclerView.w0(recyclerView, sy.d0.n(aVar), true, 4);
        recyclerView.u0(B4().N);
        B4().Q.q(new com.github.rudroid.shortcuts.activities.c(this, 1));
        com.github.rudroid.utilities.w0.a(((w6) l1Var.getValue()).F, F3(), androidx.lifecycle.w.u, new com.github.rudroid.shortcuts.activities.f(this, null));
    }
}
