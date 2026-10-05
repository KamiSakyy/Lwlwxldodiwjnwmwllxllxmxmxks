package com.github.rudroid.shortcuts.activities;

import android.view.View;
import com.github.rudroid.views.listemptystate.a;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ShortcutsOverviewFragment$onSave$1", f = "ShortcutsOverviewFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ShortcutsOverviewFragment w;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[fl.g.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fl.g gVar = fl.g.r;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fl.g gVar2 = fl.g.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ShortcutsOverviewFragment shortcutsOverviewFragment, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutsOverviewFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        z0 z0Var = new z0(this.w, cVar);
        z0Var.v = obj;
        return z0Var;
    }

    public final Object s(Object obj, Object obj2) {
        z0 r = r((a71.c) obj2, (fl.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.f fVar = (fl.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        int ordinal = fVar.a.ordinal();
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.w;
        if (ordinal == 0) {
            ShortcutsOverviewFragment.I4(shortcutsOverviewFragment, true);
        } else if (ordinal == 1) {
            ShortcutsOverviewFragment.I4(shortcutsOverviewFragment, false);
            View view = ((androidx.fragment.app.a0) shortcutsOverviewFragment).a0;
            if (view != null) {
                view.post(new r(shortcutsOverviewFragment, 2));
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ShortcutsOverviewFragment.I4(shortcutsOverviewFragment, false);
            SwipeRefreshUiStateRecyclerView swipeRefreshUiStateRecyclerView = shortcutsOverviewFragment.B4().Q;
            k.i g4 = shortcutsOverviewFragment.g4();
            com.github.rudroid.views.listemptystate.a.Companion.getClass();
            swipeRefreshUiStateRecyclerView.r(fVar, g4, null, a.C0021a.b);
        }
        return w61.a0.a;
    }
}
