package com.github.rudroid.shortcuts.activities;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.GitHubFragment;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ShortcutViewFragment$deleteShortcut$1", f = "ShortcutViewFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ShortcutViewFragment w;

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
    public o0(ShortcutViewFragment shortcutViewFragment, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutViewFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        o0 o0Var = new o0(this.w, cVar);
        o0Var.v = obj;
        return o0Var;
    }

    public final Object s(Object obj, Object obj2) {
        o0 r = r((a71.c) obj2, (fl.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.f fVar = (fl.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        int ordinal = fVar.a.ordinal();
        ShortcutViewFragment shortcutViewFragment = this.w;
        if (ordinal == 0) {
            ShortcutViewFragment.I4(shortcutViewFragment, true);
        } else if (ordinal == 1) {
            ShortcutViewFragment.I4(shortcutViewFragment, false);
            View view = ((androidx.fragment.app.a0) shortcutViewFragment).a0;
            if (view != null) {
                view.post(new r(shortcutViewFragment, 1));
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ShortcutViewFragment.I4(shortcutViewFragment, false);
            GitHubFragment.y4(shortcutViewFragment, 2131952512, (m0.b) null, (ViewGroup) null, (ComposeView) null, 62);
        }
        return w61.a0.a;
    }
}
