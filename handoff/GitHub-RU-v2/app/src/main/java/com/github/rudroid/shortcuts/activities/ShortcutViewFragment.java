package com.github.rudroid.shortcuts.activities;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.shortcuts.activities.ConfigureShortcutActivity;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.service.models.response.shortcuts.ShortcutType;
import ic.th;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutViewFragment extends Hilt_ShortcutViewFragment<th> implements com.github.rudroid.fragments.util.f {
    public final int E0 = 2131559951;
    public com.github.rudroid.activities.util.c F0;
    public final l1 G0;
    public final l1 H0;
    public final l1 I0;
    public SearchView J0;
    public Menu K0;
    public k.g L0;
    public final b M0;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShortcutType.values().length];
            try {
                iArr[ShortcutType.ISSUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutType.PULL_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortcutType.DISCUSSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortcutType.REPOSITORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b implements a5.t {
        public b() {
        }

        public final boolean a0(MenuItem menuItem) {
            k71.k.g(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            final ShortcutViewFragment shortcutViewFragment = ShortcutViewFragment.this;
            if (itemId != 2131362284) {
                if (itemId != 2131362214) {
                    return false;
                }
                b21.v vVar = new b21.v(shortcutViewFragment.i4());
                ((k.d) vVar.t).d = shortcutViewFragment.C3(2131954610);
                vVar.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.rudroid.shortcuts.activities.n0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ShortcutViewFragment shortcutViewFragment2 = ShortcutViewFragment.this;
                        com.github.rudroid.utilities.w0.a(((com.github.rudroid.shortcuts.w) shortcutViewFragment2.H0.getValue()).P(), shortcutViewFragment2.F3(), androidx.lifecycle.w.u, new o0(shortcutViewFragment2, null));
                    }
                });
                vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                shortcutViewFragment.L0 = vVar.A();
                return true;
            }
            StoredShortcutModel storedShortcutModel = (StoredShortcutModel) ((fl.f) ((com.github.rudroid.shortcuts.w) shortcutViewFragment.H0.getValue()).w.r.getValue()).b;
            if (storedShortcutModel != null) {
                RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                ei.c cVar = ei.c.w;
                runtimeFeatureFlag.getClass();
                if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(shortcutViewFragment)) {
                    x6.a0 i = sy.s.i(shortcutViewFragment);
                    k71.k.g(i, "<this>");
                    com.github.rudroid.main.navigation.f.c(i, new ConfigureShortcutRoute(storedShortcutModel, true, true, false, true), (x6.d0) null, 6);
                    return true;
                }
                ConfigureShortcutActivity.a aVar = ConfigureShortcutActivity.Companion;
                Context i4 = shortcutViewFragment.i4();
                aVar.getClass();
                Intent intent = new Intent(i4, (Class<?>) ConfigureShortcutActivity.class);
                ConfigureShortcutActivity.a.a(aVar, intent, storedShortcutModel, true, 8);
                shortcutViewFragment.E(intent, (Bundle) null);
            }
            return true;
        }

        public final void o2(Menu menu, MenuInflater menuInflater) {
            k71.k.g(menu, "menu");
            k71.k.g(menuInflater, "menuInflater");
            menuInflater.inflate(2131689497, menu);
            p.l lVar = menu instanceof p.l ? (p.l) menu : null;
            if (lVar != null) {
                lVar.s = true;
            }
            ShortcutViewFragment shortcutViewFragment = ShortcutViewFragment.this;
            shortcutViewFragment.K0 = menu;
            MenuItem findItem = menu.findItem(2131362214);
            if (findItem != null) {
                rc.h.c(findItem, shortcutViewFragment.i4(), 2131100991);
            }
            MenuItem findItem2 = menu.findItem(2131363297);
            k71.k.f(findItem2, "findItem(...)");
            shortcutViewFragment.J0 = rc.h.a(findItem2, "", new p0(shortcutViewFragment, 0), new p0(shortcutViewFragment, 1));
            com.github.rudroid.utilities.w0.a(((com.github.rudroid.viewmodels.search.c) shortcutViewFragment.G0.getValue()).u, shortcutViewFragment.F3(), androidx.lifecycle.w.u, new q0(shortcutViewFragment, null));
            StoredShortcutModel storedShortcutModel = (StoredShortcutModel) ((fl.f) ((com.github.rudroid.shortcuts.w) shortcutViewFragment.H0.getValue()).w.r.getValue()).b;
            if (storedShortcutModel != null) {
                shortcutViewFragment.J4(storedShortcutModel);
            }
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ShortcutViewFragment.this.f0() : f0;
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return ShortcutViewFragment.this;
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ d s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.s = dVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
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
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ShortcutViewFragment.this.f0() : f0;
        }
    }

    public static final class i extends k71.l implements j71.a {
        public i() {
            super(0);
        }

        public final Object a() {
            return ShortcutViewFragment.this;
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ i s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.s = iVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class k extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class l extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w61.h hVar) {
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

    public static final class m implements j71.a {
        public final /* synthetic */ Object s;
        public final /* synthetic */ com.github.rudroid.searchandfilter.complexfilter.explore.a0 t;

        public m(w61.h hVar, com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var) {
            this.s = hVar;
            this.t = a0Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return new t0(this.t, new s0(ShortcutViewFragment.this, this.s));
        }
    }

    public ShortcutViewFragment() {
        d dVar = new d();
        w61.i iVar = w61.i.s;
        w61.h s = sy.w.s(iVar, new e(dVar));
        this.G0 = new l1(k71.x.a(com.github.rudroid.viewmodels.search.c.class), new f(s), new h(s), new g(s));
        w61.h s2 = sy.w.s(iVar, new j(new i()));
        this.H0 = new l1(k71.x.a(com.github.rudroid.shortcuts.w.class), new k(s2), new c(s2), new l(s2));
        com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(26);
        kc.k kVar = new kc.k(this);
        m mVar = new m(sy.w.s(iVar, new kc.o(kVar)), a0Var);
        w61.h s3 = sy.w.s(iVar, new kc.g(kVar));
        this.I0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.q.class), new kc.h(s3), mVar, new kc.i(s3));
        this.M0 = new b();
    }

    public static final void I4(ShortcutViewFragment shortcutViewFragment, boolean z) {
        Menu menu = shortcutViewFragment.K0;
        if (menu != null) {
            menu.setGroupVisible(2131363194, z);
            menu.setGroupVisible(2131362936, !z);
        }
    }

    public final int C4() {
        return this.E0;
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.F0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final void J4(StoredShortcutModel storedShortcutModel) {
        int i2;
        MenuItem findItem;
        Menu menu = this.K0;
        if (menu != null && (findItem = menu.findItem(2131362284)) != null) {
            findItem.setVisible(!sy.u.i(storedShortcutModel));
        }
        int i3 = a.a[storedShortcutModel.y.ordinal()];
        if (i3 == 1) {
            i2 = 2131953577;
        } else if (i3 == 2) {
            i2 = 2131953580;
        } else if (i3 == 3) {
            i2 = 2131952464;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2131954339;
        }
        SearchView searchView = this.J0;
        if (searchView != null) {
            searchView.setQueryHint(C3(i2));
        }
    }

    public final void T3() {
        k.g gVar = this.L0;
        if (gVar != null) {
            gVar.dismiss();
        }
        super.T3();
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        com.github.rudroid.utilities.w0.a(((com.github.rudroid.shortcuts.w) this.H0.getValue()).w, F3(), androidx.lifecycle.w.u, new r0(this, null));
    }



    public Object L0;
    public Object x3() { return null; }
}
