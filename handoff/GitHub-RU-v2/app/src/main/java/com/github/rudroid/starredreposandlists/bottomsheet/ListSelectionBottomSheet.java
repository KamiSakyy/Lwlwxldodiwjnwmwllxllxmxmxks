package com.github.rudroid.starredreposandlists.bottomsheet;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.rudroid.starredreposandlists.bottomsheet.ListSelectionBottomSheet;
import com.github.rudroid.starredreposandlists.bottomsheet.b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import v71.q1;
import yz0.f8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ListSelectionBottomSheet extends Hilt_ListSelectionBottomSheet implements com.github.rudroid.fragments.util.f {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] X0;
    public final l1 S0;
    public final l1 T0;
    public final w61.p U0;
    public androidx.fragment.app.t V0;
    public final com.github.rudroid.fragments.util.c W0;

    public static final class a {
        public static ListSelectionBottomSheet a(String str, String str2, String str3) {
            k71.k.g(str, "repoId");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "repoOwner");
            ListSelectionBottomSheet listSelectionBottomSheet = new ListSelectionBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString("repo_id", str);
            bundle.putString("repo_name", str2);
            bundle.putString("repo_owner", str3);
            listSelectionBottomSheet.n4(bundle);
            return listSelectionBottomSheet;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return ListSelectionBottomSheet.this.g4().K0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return ListSelectionBottomSheet.this.g4().g0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return ListSelectionBottomSheet.this.g4().f0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public e() {
            super(0);
        }

        public final Object a() {
            return ListSelectionBottomSheet.this;
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ e s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.s = eVar;
        }

        public final Object a() {
            return (u1) this.s.a();
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ListSelectionBottomSheet.this.f0() : f0;
        }
    }

    static {
        r71.e pVar = new k71.p(ListSelectionBottomSheet.class, "repoName", "getRepoName()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        X0 = new r71.e[]{pVar};
        Companion = new a();
    }

    public ListSelectionBottomSheet() {
        w61.h s = sy.w.s(w61.i.s, new f(new e()));
        this.S0 = new l1(k71.x.a(w.class), new g(s), new i(s), new h(s));
        this.T0 = new l1(k71.x.a(g0.class), new b(), new d(), new c());
        this.U0 = sy.w.t(new com.github.rudroid.starredreposandlists.bottomsheet.c(0, this));
        this.W0 = new com.github.rudroid.fragments.util.c("repo_name", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(7));
    }

    public final com.github.rudroid.fragments.g0 D4() {
        com.github.rudroid.fragments.g0.Companion.getClass();
        return com.github.rudroid.fragments.g0.w;
    }

    public final r1.d E4() {
        return new r1.d(new com.github.rudroid.starredreposandlists.bottomsheet.e(0, this), true, 1285077902);
    }

    public final w I4() {
        return (w) this.S0.getValue();
    }

    public final com.github.rudroid.activities.util.c J2() {
        return I4().u;
    }

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        com.github.rudroid.activities.util.c cVar = I4().u;
        k71.k.g(cVar, "activityAccountHolder");
        this.V0 = f4(new h.b() { // from class: com.github.rudroid.starredreposandlists.bottomsheet.d
            public final void d(Object obj) {
                b.C0006b c0006b = (b.C0006b) obj;
                ListSelectionBottomSheet.a aVar = ListSelectionBottomSheet.Companion;
                k71.k.g(c0006b, "result");
                if (c0006b.a) {
                    w I4 = ListSelectionBottomSheet.this.I4();
                    q1 q1Var = I4.B;
                    if (q1Var != null) {
                        q1Var.m((CancellationException) null);
                    }
                    I4.B = v71.b0.z(d1.k(I4), (a71.h) null, (v71.a0) null, new z(I4, null), 3);
                }
            }
        }, new com.github.rudroid.starredreposandlists.bottomsheet.b(cVar));
    }

    public final void Y3() {
        super.Y3();
        String D3 = D3(2131953852, new Object[]{(String) this.W0.a(this, X0[0])});
        k71.k.f(D3, "getString(...)");
        ((com.github.rudroid.utilities.b) this.U0.getValue()).b(D3);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        k71.k.g(dialogInterface, "dialog");
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        ArrayList arrayList = I4().x;
        ArrayList arrayList2 = x61.r.r;
        if (arrayList == null) {
            arrayList = arrayList2;
        }
        Bundle bundle = ((androidx.fragment.app.a0) this).x;
        String string = bundle != null ? bundle.getString("repo_id") : null;
        if (string == null) {
            string = "";
        }
        f8 f8Var = I4().A;
        Boolean valueOf = f8Var != null ? Boolean.valueOf(f8Var.a) : null;
        boolean b2 = k71.k.b(valueOf, Boolean.TRUE);
        l1 l1Var = this.T0;
        if (b2) {
            ((g0) l1Var.getValue()).P(string, arrayList, arrayList2);
        } else if (k71.k.b(valueOf, Boolean.FALSE)) {
            ((g0) l1Var.getValue()).P(string, arrayList2, arrayList);
        } else if (valueOf != null) {
            throw new NoWhenBranchMatchedException();
        }
    }


    public static  n4(Object... a) {
        return null;
    }

    public static  g4(Object... a) {
        return null;
    }

    public static  f0(Object... a) {
        return null;
    }

    public static  D3(Object... a) {
        return null;
    }

    public static  A4(Object... a) {
        return null;
    }
    public Object A4() { return null; }
}
