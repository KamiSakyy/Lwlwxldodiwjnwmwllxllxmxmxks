package com.github.rudroid.starredreposandlists.listdetails;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.GitHubFragment;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.starredreposandlists.listdetails.ListDetailFragment$deleteList$1", f = "ListDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ListDetailFragment w;

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
    public n(ListDetailFragment listDetailFragment, a71.c cVar) {
        super(2, cVar);
        this.w = listDetailFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        n nVar = new n(this.w, cVar);
        nVar.v = obj;
        return nVar;
    }

    public final Object s(Object obj, Object obj2) {
        n r = r((a71.c) obj2, (fl.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.f fVar = (fl.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        int ordinal = fVar.a.ordinal();
        final ListDetailFragment listDetailFragment = this.w;
        if (ordinal == 0) {
            listDetailFragment.C4().P(true);
        } else if (ordinal == 1) {
            ((com.github.rudroid.utilities.b) listDetailFragment.I0.getValue()).b(listDetailFragment.C3(2131953846));
            listDetailFragment.C4().P(false);
            View view = ((androidx.fragment.app.a0) listDetailFragment).a0;
            if (view != null) {
                view.post(new Runnable() { // from class: com.github.rudroid.starredreposandlists.listdetails.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.y m;
                        k.i w3 = ListDetailFragment.this.w3();
                        if (w3 == null || (m = w3.m()) == null) {
                            return;
                        }
                        m.c();
                    }
                });
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listDetailFragment.C4().P(false);
            GitHubFragment.y4(this.w, 2131952512, (m0.b) null, (ViewGroup) null, (ComposeView) null, 62);
        }
        return w61.a0.a;
    }
}
