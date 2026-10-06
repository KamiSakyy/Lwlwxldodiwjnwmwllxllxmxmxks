package com.github.rudroid.starredreposandlists;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.p1;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.repository.RepositoryDetailActivity;
import com.github.rudroid.repository.model.PendingRepositoryInfo;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes3.dex */
public final class StarredRepositoriesAndListsFragment extends Hilt_StarredRepositoriesAndListsFragment implements com.github.rudroid.interfaces.m0, com.github.rudroid.fragments.util.f, com.github.rudroid.interfaces.a {
    public com.github.rudroid.activities.util.c D0;
    public final l1 E0;
    public com.github.rudroid.utilities.e F0;
    public final l1 G0;
    public final l1 H0;
    public final p1 I0;
    public androidx.fragment.app.t J0;
    public com.github.rudroid.html.b K0;
    public final w61.p L0;

    public static final class a extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? StarredRepositoriesAndListsFragment.this.f0() : f0;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return StarredRepositoriesAndListsFragment.this;
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? StarredRepositoriesAndListsFragment.this.f0() : f0;
        }
    }

    public static final class g extends k71.l implements j71.a {
        public g() {
            super(0);
        }

        public final Object a() {
            return StarredRepositoriesAndListsFragment.this;
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ g s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.s = gVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class i extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w61.h hVar) {
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

    public StarredRepositoriesAndListsFragment() {
        kc.e eVar = new kc.e(this);
        kc.f fVar = new kc.f(this, new Bundle());
        w61.i iVar = w61.i.s;
        w61.h s = sy.w.s(iVar, new kc.a(eVar));
        this.E0 = new l1(k71.x.a(h0.class), new kc.b(s), new kc.d(this, s), new kc.c(fVar, s));
        w61.h s2 = sy.w.s(iVar, new c(new b()));
        this.G0 = new l1(k71.x.a(com.github.rudroid.starredreposandlists.bottomsheet.g0.class), new d(s2), new f(s2), new e(s2));
        w61.h s3 = sy.w.s(iVar, new h(new g()));
        this.H0 = new l1(k71.x.a(com.github.rudroid.viewmodels.search.c.class), new i(s3), new a(s3), new j(s3));
        this.I0 = androidx.compose.runtime.t.B(Boolean.FALSE);
        this.L0 = sy.w.t(new o0(this, 0));
    }

    public static void F4(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, MobileAppElement mobileAppElement, MobileAppAction mobileAppAction) {
        MobileSubjectType mobileSubjectType = MobileSubjectType.REPOSITORIES;
        starredRepositoriesAndListsFragment.getClass();
        v71.b0.z(androidx.lifecycle.d1.i(starredRepositoriesAndListsFragment), (a71.h) null, (v71.a0) null, new i1(starredRepositoriesAndListsFragment, mobileAppElement, mobileAppAction, mobileSubjectType, null), 3);
    }

    public final com.github.rudroid.viewmodels.search.c C4() {
        return (com.github.rudroid.viewmodels.search.c) this.H0.getValue();
    }

    public final h0 D4() {
        return (h0) this.E0.getValue();
    }

    public final void E4() {
        com.github.rudroid.utilities.ui.s0 c2;
        h0 D4 = D4();
        w61.k kVar = (w61.k) ((com.github.rudroid.utilities.ui.g1) D4.A.getValue()).getData();
        if (kVar != null) {
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            c2 = new com.github.rudroid.utilities.ui.y0(kVar);
        } else {
            c2 = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
        }
        D4.P(c2);
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            return;
        }
        com.github.rudroid.activities.util.c cVar2 = this.D0;
        if (cVar2 == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        this.J0 = f4(new c5.b(9, this), new com.github.rudroid.starredreposandlists.createoreditlist.g1(cVar2));
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new v0(this, composeView, 1), true, -826344427));
        return composeView;
    }

    public final void Y3() {
        super.Y3();
        String C3 = C3(2131954157);
        k71.k.f(C3, "getString(...)");
        ((com.github.rudroid.utilities.b) this.L0.getValue()).b(C3);
    }

    public final void c1(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "ownerLogin");
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            rf.h.d(sy.s.i(this), str, str2, (PendingRepositoryInfo) null, 28);
        } else {
            E(RepositoryDetailActivity.a.b(RepositoryDetailActivity.Companion, i4(), str, str2, (String) null, (String) null, (PendingRepositoryInfo) null, 56), (Bundle) null);
        }
    }

    public final void c3() {
        this.I0.setValue(Boolean.TRUE);
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        com.github.rudroid.utilities.w0.a(((com.github.rudroid.starredreposandlists.bottomsheet.g0) this.G0.getValue()).s.s, F3(), androidx.lifecycle.w.u, new h1(this, null));
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            com.github.rudroid.main.navigation.f.a(sy.s.i(this), "EXTRA_USER_LIST_METADATA", F3(), new t0(this, 0));
        }
        Collection collection = (Collection) ((com.github.rudroid.utilities.ui.g1) D4().B.r.getValue()).getData();
        if (collection == null || collection.isEmpty()) {
            D4().P(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        }
    }



    public <T0> T0 f0(Object... a) {
        return null;
    }

    public <T0> T0 f4(Object... a) {
        return null;
    }

    public <T0> T0 C3(Object... a) {
        return null;
    }

    public <T0> T0 i4(Object... a) {
        return null;
    }

    public <T0> T0 F3(Object... a) {
        return null;
    }

    public <T0> T0 g4(Object... a) {
        return null;
    }

    public <T0> T0 E(Object... a) {
        return null;
    }

    public <T0> T0 x3(Object... a) {
        return null;
    }
    public Object g4() { return null; }
    public Object x3() { return null; }
}
