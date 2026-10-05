package com.github.rudroid.views.refreshableviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import b8.j;
import com.github.rudroid.actions.checklog.c;
import com.github.rudroid.activities.h0;
import com.github.rudroid.activities.m0;
import com.github.rudroid.activities.p2;
import com.github.rudroid.utilities.q;
import com.github.rudroid.views.UiStateRecyclerView;
import com.github.rudroid.views.listemptystate.a;
import com.github.rudroid.views.listemptystate.h;
import com.github.rudroid.views.listemptystate.i;
import com.github.rudroid.views.n;
import ic.bh;
import ic.d1;
import ic.s7;
import java.util.Collection;
import k5.b;
import k5.f;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import xh.d;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SwipeRefreshUiStateRecyclerView extends d<bh> {
    public static final /* synthetic */ int o0 = 0;
    public final int k0;
    public UiStateRecyclerView l0;
    public ScrollView m0;
    public NestedScrollView n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshUiStateRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.g(context, "context");
        this.k0 = 2131559286;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEmptyState(a aVar) {
        String str;
        getRecyclerView().setVisibility(8);
        getBackground().setVisibility(0);
        getNestedScrollView().setVisibility(0);
        s7 b = b.b(LayoutInflater.from(getContext()), 2131559164, this, false, b.b);
        k.f(b, "inflate(...)");
        s7 s7Var = b;
        ImageView imageView = s7Var.Q;
        TextView textView = s7Var.P;
        Button button = s7Var.O;
        TextView textView2 = s7Var.R;
        Context context = getContext();
        k.f(context, "getContext(...)");
        textView2.setText(com.github.rudroid.views.listemptystate.b.a(aVar, context));
        Context context2 = getContext();
        k.f(context2, "getContext(...)");
        boolean z = aVar instanceof h;
        Drawable drawable = null;
        if (z) {
            Integer num = ((h) aVar).b;
            str = num != null ? context2.getString(num.intValue()) : null;
        } else {
            if (!(aVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((i) aVar).b;
        }
        if (str != null) {
            textView.setText(str);
        } else {
            k.f(textView, "emptyStateDescription");
            textView.setVisibility(8);
        }
        Integer a = aVar.a();
        if (a != null) {
            button.setText(a.intValue());
            button.setOnClickListener(new c(29, aVar));
        } else {
            k.f(button, "emptyButton");
            button.setVisibility(8);
        }
        Context context3 = getContext();
        k.f(context3, "getContext(...)");
        if (z) {
            Integer num2 = ((h) aVar).c;
            if (num2 != null) {
                drawable = q.c(context3, num2.intValue());
            }
        } else {
            if (!(aVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = ((i) aVar).c;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            k.f(imageView, "emptyStateImage");
            imageView.setVisibility(8);
        }
        getBackground().removeAllViews();
        getBackground().addView(((f) s7Var).A);
        Context context4 = getContext();
        k.f(context4, "getContext(...)");
        com.github.rudroid.utilities.b bVar = new com.github.rudroid.utilities.b(context4);
        Context context5 = getContext();
        k.f(context5, "getContext(...)");
        bVar.b(com.github.rudroid.views.listemptystate.b.a(aVar, context5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setErrorSwitchScreen(p2 p2Var) {
        getRecyclerView().setVisibility(8);
        getBackground().setVisibility(0);
        getNestedScrollView().setVisibility(0);
        d1 b = b.b(LayoutInflater.from(getContext()), 2131558755, this, false, b.b);
        k.f(b, "inflate(...)");
        d1 d1Var = b;
        d1Var.N.setContent(new r1.d(new xh.b(p2Var, 0), true, -1875415719));
        getBackground().removeAllViews();
        getBackground().addView(((f) d1Var).A);
    }

    public final boolean a() {
        return getDataBinding().Q.canScrollVertically(-1);
    }

    public final ScrollView getBackground() {
        ScrollView scrollView = this.m0;
        if (scrollView != null) {
            return scrollView;
        }
        k.m("background");
        throw null;
    }

    @Override // xh.d
    public int getLayoutResId() {
        return this.k0;
    }

    public final NestedScrollView getNestedScrollView() {
        NestedScrollView nestedScrollView = this.n0;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        k.m("nestedScrollView");
        throw null;
    }

    public final UiStateRecyclerView getRecyclerView() {
        UiStateRecyclerView uiStateRecyclerView = this.l0;
        if (uiStateRecyclerView != null) {
            return uiStateRecyclerView;
        }
        k.m("recyclerView");
        throw null;
    }

    @Override // xh.d
    public final void onFinishInflate() {
        super.onFinishInflate();
        UiStateRecyclerView uiStateRecyclerView = getDataBinding().Q;
        k.f(uiStateRecyclerView, "recyclerView");
        setRecyclerView(uiStateRecyclerView);
        ScrollView scrollView = getDataBinding().N;
        k.f(scrollView, "background");
        setBackground(scrollView);
        NestedScrollView nestedScrollView = getDataBinding().P;
        k.f(nestedScrollView, "nestedScrollView");
        setNestedScrollView(nestedScrollView);
    }

    public final void q(j71.a aVar) {
        super.setOnRefreshListener(new n(1, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(fl.f fVar, Activity activity, j71.a aVar, a aVar2) {
        boolean z;
        m0 m0Var;
        h0 c0;
        k.g(fVar, "model");
        k.g(aVar2, "emptyScreen");
        if (!i21.a.x(fVar)) {
            setRefreshing(false);
        }
        if (!xh.c.a(fVar) && !i21.a.v(fVar)) {
            getRecyclerView().setVisibility(0);
            getBackground().setVisibility(8);
            getNestedScrollView().setVisibility(8);
            getBackground().removeAllViews();
            UiStateRecyclerView uiStateRecyclerView = getDataBinding().Q;
            uiStateRecyclerView.getClass();
            com.github.rudroid.views.i iVar = uiStateRecyclerView.e1;
            if (iVar != null) {
                iVar.d.y(fVar, com.github.rudroid.views.i.e[0]);
            }
            uiStateRecyclerView.d1.G(fVar, aVar2);
            return;
        }
        if (!i21.a.v(fVar)) {
            if (xh.c.a(fVar)) {
                setEmptyState(aVar2);
                return;
            }
            return;
        }
        Object obj = fVar.b;
        fl.b bVar = fVar.c;
        if (obj != null) {
            Collection collection = obj instanceof Collection ? (Collection) obj : null;
            if (collection == null || !collection.isEmpty()) {
                z = false;
                if ((!(activity instanceof m0) ? (m0) activity : null) != null || (c0 = (m0Var = (m0) activity).c0(bVar)) == null) {
                }
                boolean z2 = activity instanceof p2;
                if (z2) {
                    if ((bVar != null ? bVar.a : null) == fl.c.B) {
                        getRecyclerView().setVisibility(8);
                        getBackground().setVisibility(0);
                        getNestedScrollView().setVisibility(0);
                        d1 b = b.b(LayoutInflater.from(getContext()), 2131558755, this, false, b.b);
                        k.f(b, "inflate(...)");
                        d1 d1Var = b;
                        d1Var.N.setContent(new r1.d(new xh.a((p2) activity, bVar, 0), true, 1923701692));
                        getBackground().removeAllViews();
                        getBackground().addView(((f) d1Var).A);
                        return;
                    }
                }
                if (z2) {
                    p2 p2Var = (p2) activity;
                    if (p2Var.l(bVar)) {
                        setErrorSwitchScreen(p2Var);
                        return;
                    }
                }
                if (!z) {
                    m0.p0(m0Var, c0, this, (ComposeView) null, 22);
                    return;
                } else if (bVar == null || !bVar.a() || aVar == null) {
                    setEmptyState(aVar2);
                    return;
                } else {
                    setEmptyState(new i(c0.a, null, null, 2131954905, aVar));
                    return;
                }
            }
        }
        z = true;
        if ((!(activity instanceof m0) ? (m0) activity : null) != null) {
        }
    }

    public final void setBackground(ScrollView scrollView) {
        k.g(scrollView, "<set-?>");
        this.m0 = scrollView;
    }

    public final void setNestedScrollView(NestedScrollView nestedScrollView) {
        k.g(nestedScrollView, "<set-?>");
        this.n0 = nestedScrollView;
    }

    @w61.c
    public void setOnRefreshListener(j jVar) {
        super.setOnRefreshListener(jVar);
    }

    public final void setRecyclerView(UiStateRecyclerView uiStateRecyclerView) {
        k.g(uiStateRecyclerView, "<set-?>");
        this.l0 = uiStateRecyclerView;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class NestedScrollView<T1,T2,T3,T4> {
        public NestedScrollView() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p2<T1,T2,T3,T4> {
        public p2() {
        }
    }
}
