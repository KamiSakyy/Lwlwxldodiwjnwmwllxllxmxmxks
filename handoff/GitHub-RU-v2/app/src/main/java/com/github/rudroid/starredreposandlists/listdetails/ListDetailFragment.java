package com.github.rudroid.starredreposandlists.listdetails;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.a1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.repository.RepositoryDetailActivity;
import com.github.rudroid.repository.model.PendingRepositoryInfo;
import com.github.rudroid.starredreposandlists.createoreditlist.h1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import y71.y1;
import yz0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ListDetailFragment extends Hilt_ListDetailFragment implements com.github.rudroid.fragments.util.f, com.github.rudroid.interfaces.m0 {
    public com.github.rudroid.activities.util.c D0;
    public com.github.rudroid.html.b E0;
    public com.github.rudroid.utilities.e F0;
    public final l1 G0;
    public androidx.fragment.app.t H0;
    public final w61.p I0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return ListDetailFragment.this;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public final /* synthetic */ a s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.s = aVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
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
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ListDetailFragment.this.f0() : f0;
        }
    }

    public ListDetailFragment() {
        w61.h s = sy.w.s(w61.i.s, new b(new a()));
        this.G0 = new l1(k71.x.a(s0.class), new c(s), new e(s), new d(s));
        this.I0 = sy.w.t(new l(this, 1));
    }

    public final s0 C4() {
        return (s0) this.G0.getValue();
    }

    public final void D4(xz0.h hVar) {
        a1 a2;
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (!RuntimeFeatureFlag.a(cVar)) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_USER_LIST_METADATA", (Parcelable) hVar);
            g4().setResult(-1, intent);
        } else {
            x6.k d2 = sy.s.i(this).d();
            if (d2 == null || (a2 = d2.a()) == null) {
                return;
            }
            a2.c(hVar, "EXTRA_USER_LIST_METADATA");
        }
    }

    public final void E4(xz0.h hVar) {
        s0 C4 = C4();
        String str = hVar.s;
        String str2 = hVar.t;
        String str3 = hVar.u;
        k71.k.g(str, "slug");
        k71.k.g(str2, "title");
        k71.k.g(str3, "description");
        y1 y1Var = C4.y;
        y1Var.getClass();
        y1Var.k((Object) null, str);
        y1 y1Var2 = C4.A;
        p2 p2Var = (p2) ((g1) y1Var2.getValue()).getData();
        if (p2Var != null) {
            g1.a aVar = g1.Companion;
            p2 p2Var2 = new p2(p2Var.a, str2, str3, p2Var.d, p2Var.e);
            aVar.getClass();
            y1Var2.k((Object) null, new t1(p2Var2));
        }
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
        this.H0 = f4(new h.b() { // from class: com.github.rudroid.starredreposandlists.listdetails.h
            public final void d(Object obj) {
                xz0.h hVar = (xz0.h) obj;
                if (hVar != null) {
                    ListDetailFragment listDetailFragment = ListDetailFragment.this;
                    listDetailFragment.E4(hVar);
                    listDetailFragment.D4(hVar);
                }
            }
        }, new h1(cVar2));
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new j(0, this), true, -935283581));
        return composeView;
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

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            com.github.rudroid.main.navigation.f.a(sy.s.i(this), "EXTRA_USER_LIST_METADATA", F3(), new g(0, this));
        }
    }

}
