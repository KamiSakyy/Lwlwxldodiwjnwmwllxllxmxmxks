package com.github.rudroid.views;

import a0.s0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.commonandroid.views.ScrollableTitleToolbar;
import com.github.rudroid.activities.d0;
import com.github.rudroid.activities.h0;
import com.github.rudroid.activities.m0;
import com.github.rudroid.p0;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import sy.w;

@SuppressLint({"InvalidSetHasFixedSize"})
/* loaded from: /home/user/work/p/classes3.dex */
public final class LoadingViewFlipper extends ViewAnimator {
    public static final a Companion = new a();
    public final ImageView A;
    public final Button B;
    public final ComposeView C;
    public final w61.p D;
    public final ViewGroup r;
    public final View s;
    public final RecyclerView t;
    public final SwipeRefreshLayout u;
    public final SwipeRefreshLayout v;
    public n w;
    public vf.a x;
    public final TextView y;
    public final TextView z;

    public static final class a {
    }

    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public final int r;
        public final Parcelable s;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new c(parcel.readInt(), parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(int i, Parcelable parcelable) {
            this.r = i;
            this.s = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.r == cVar.r && k71.k.b(this.s, cVar.s);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.r) * 31;
            Parcelable parcelable = this.s;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public final String toString() {
            return "ViewFlipperState(displayedChild=" + this.r + ", baseState=" + this.s + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeInt(this.r);
            parcel.writeParcelable(this.s, i);
        }
    }

    public static final /* synthetic */ class d {
        static {
            int[] iArr = new int[fl.g.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fl.g gVar = fl.g.r;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fl.g gVar2 = fl.g.r;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k71.k.g(context, "context");
        this.D = w.t(new m(context, 0));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p0.a, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(1, 2131558758);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
            LayoutInflater from = LayoutInflater.from(context);
            from.inflate(2131558757, (ViewGroup) this, true);
            View inflate = from.inflate(resourceId, (ViewGroup) this, true);
            k71.k.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.r = viewGroup;
            RecyclerView findViewById = viewGroup.findViewById(2131363222);
            this.t = findViewById;
            if (dimensionPixelSize != -1) {
                setContentPaddingBottom(dimensionPixelSize);
            }
            if (findViewById != null) {
                findViewById.setHasFixedSize(true);
            }
            SwipeRefreshLayout findViewById2 = viewGroup.findViewById(2131363374);
            this.u = findViewById2;
            if (findViewById2 != null) {
                c(findViewById2);
            }
            View inflate2 = from.inflate(2131558756, (ViewGroup) this, true);
            k71.k.f(inflate2, "inflate(...)");
            this.s = inflate2;
            View findViewById3 = inflate2.findViewById(2131362296);
            k71.k.f(findViewById3, "findViewById(...)");
            this.y = (TextView) findViewById3;
            View findViewById4 = inflate2.findViewById(2131362293);
            k71.k.f(findViewById4, "findViewById(...)");
            this.z = (TextView) findViewById4;
            View findViewById5 = inflate2.findViewById(2131362294);
            k71.k.f(findViewById5, "findViewById(...)");
            this.A = (ImageView) findViewById5;
            View findViewById6 = inflate2.findViewById(2131362292);
            k71.k.f(findViewById6, "findViewById(...)");
            this.B = (Button) findViewById6;
            ComposeView findViewById7 = from.inflate(2131558755, (ViewGroup) this, true).findViewById(2131362160);
            k71.k.f(findViewById7, "findViewById(...)");
            this.C = findViewById7;
            SwipeRefreshLayout findViewById8 = inflate2.findViewById(2131362297);
            this.v = findViewById8;
            if (findViewById8 != null) {
                c(findViewById8);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            setInAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            setOutAnimation(alphaAnimation2);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static void c(SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setEnabled(false);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(2131100986);
        swipeRefreshLayout.setColorSchemeResources(new int[]{R.color.white});
        int progressViewStartOffset = swipeRefreshLayout.getProgressViewStartOffset();
        int progressViewEndOffset = swipeRefreshLayout.getProgressViewEndOffset();
        swipeRefreshLayout.J = true;
        swipeRefreshLayout.P = progressViewStartOffset;
        swipeRefreshLayout.Q = progressViewEndOffset;
        swipeRefreshLayout.d0 = true;
        swipeRefreshLayout.l();
        swipeRefreshLayout.t = false;
    }

    private final com.github.rudroid.utilities.b getAccessibilityHandler() {
        return (com.github.rudroid.utilities.b) this.D.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(LoadingViewFlipper loadingViewFlipper, fl.f fVar, Activity activity, b bVar, j71.e eVar, int i) {
        b bVar2;
        boolean z;
        int ordinal;
        m0 m0Var;
        h0 c0;
        int i2 = 30;
        String str = null;
        if ((i & 4) != 0) {
            String string = loadingViewFlipper.getContext().getString(2131952423);
            k71.k.f(string, "getString(...)");
            bVar2 = new b(string, str, (j71.a) str, i2);
        } else {
            bVar2 = bVar;
        }
        j71.e eVar2 = (i & 8) != 0 ? p.r : eVar;
        ComposeView composeView = loadingViewFlipper.C;
        k71.k.g(fVar, "model");
        fl.b bVar3 = fVar.c;
        Object obj = fVar.b;
        if (obj != null) {
            Collection collection = obj instanceof Collection ? (Collection) obj : null;
            if (collection == null || !collection.isEmpty()) {
                z = false;
                ordinal = fVar.a.ordinal();
                if (ordinal != 0) {
                    if (z) {
                        loadingViewFlipper.g();
                        return;
                    } else {
                        loadingViewFlipper.e(true);
                        return;
                    }
                }
                if (ordinal == 1) {
                    if (!z) {
                        loadingViewFlipper.e(false);
                        return;
                    } else {
                        loadingViewFlipper.f(bVar2);
                        loadingViewFlipper.getAccessibilityHandler().b(bVar2.a);
                        return;
                    }
                }
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(activity instanceof m0) || (c0 = (m0Var = (m0) activity).c0(bVar3)) == null) {
                    return;
                }
                String str2 = c0.a;
                d0 d0Var = activity instanceof d0 ? (d0) activity : null;
                if (d0Var != null) {
                    if ((bVar3 != null ? bVar3.a : null) == fl.c.B) {
                        composeView.setContent(new r1.d(new k(d0Var, bVar3, 0), true, 218587594));
                        if (loadingViewFlipper.getDisplayedChild() != 3) {
                            loadingViewFlipper.setDisplayedChild(3);
                            return;
                        }
                        return;
                    }
                }
                if (d0Var != null && d0Var.l(bVar3)) {
                    composeView.setContent(new r1.d(new l(d0Var, 0), true, -985498175));
                    if (loadingViewFlipper.getDisplayedChild() != 3) {
                        loadingViewFlipper.setDisplayedChild(3);
                        return;
                    }
                    return;
                }
                if (!z) {
                    loadingViewFlipper.e(false);
                    m0.p0(m0Var, c0, loadingViewFlipper, (ComposeView) null, 22);
                    return;
                }
                n nVar = loadingViewFlipper.w;
                if (bVar3 != null && bVar3.a() && nVar != null) {
                    loadingViewFlipper.f(new b(str2, (String) null, (Integer) 2131954905, (j71.a) new o(0, nVar, b8.j.class, "onRefresh", "onRefresh()V", 0, 0)));
                    return;
                }
                b bVar4 = (b) eVar2.s(bVar3, c0);
                if (bVar4 == null) {
                    bVar4 = new b(str2, str, (j71.a) str, i2);
                }
                loadingViewFlipper.f(bVar4);
                return;
            }
        }
        z = true;
        ordinal = fVar.a.ordinal();
        if (ordinal != 0) {
        }
    }

    public final void a(AppBarLayout appBarLayout) {
        if (appBarLayout != null) {
            vf.a aVar = new vf.a(appBarLayout);
            this.x = aVar;
            RecyclerView recyclerView = this.t;
            if (recyclerView != null) {
                recyclerView.j(aVar);
            }
        }
    }

    public final void b(ScrollableTitleToolbar scrollableTitleToolbar) {
        if (scrollableTitleToolbar != null) {
            vf.f fVar = new vf.f(scrollableTitleToolbar);
            RecyclerView recyclerView = this.t;
            if (recyclerView != null) {
                recyclerView.j(fVar);
            }
        }
    }

    public final void d(j71.a aVar) {
        n nVar = new n(0, aVar);
        this.w = nVar;
        SwipeRefreshLayout swipeRefreshLayout = this.u;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(nVar);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.v;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(this.w);
        }
        setSwipeToRefreshState(true);
    }

    public final void e(boolean z) {
        if (!z) {
            SwipeRefreshLayout swipeRefreshLayout = this.u;
            if (swipeRefreshLayout != null && swipeRefreshLayout.isEnabled()) {
                swipeRefreshLayout.setRefreshing(false);
            }
            SwipeRefreshLayout swipeRefreshLayout2 = this.v;
            if (swipeRefreshLayout2 != null && swipeRefreshLayout2.isEnabled()) {
                swipeRefreshLayout2.setRefreshing(false);
            }
        }
        if (getDisplayedChild() != 1) {
            setDisplayedChild(1);
        }
    }

    public final void f(b bVar) {
        this.y.setText(bVar.a);
        this.A.setVisibility(8);
        String str = bVar.b;
        TextView textView = this.z;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        Integer num = bVar.c;
        Button button = this.B;
        if (num != null) {
            button.setText(num.intValue());
            button.setVisibility(0);
            button.setOnClickListener(new com.github.rudroid.actions.checklog.c(6, bVar));
        } else {
            button.setVisibility(8);
        }
        vf.a aVar = this.x;
        if (aVar != null) {
            aVar.a.setElevation(aVar.c);
            aVar.b = -1.0f;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.u;
        if (swipeRefreshLayout != null && swipeRefreshLayout.isEnabled()) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.v;
        if (swipeRefreshLayout2 != null && swipeRefreshLayout2.isEnabled()) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        if (getDisplayedChild() != 2) {
            setDisplayedChild(2);
        }
    }

    public final void g() {
        vf.a aVar = this.x;
        if (aVar != null) {
            aVar.a.setElevation(aVar.c);
            aVar.b = -1.0f;
        }
        if (getDisplayedChild() != 0) {
            setDisplayedChild(0);
        }
    }

    public final ViewGroup getContentView() {
        return this.r;
    }

    public final View getEmptyView() {
        return this.s;
    }

    public final RecyclerView getRecyclerView() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.n();
        }
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setInAnimation(null);
        setOutAnimation(null);
        c cVar = (c) parcelable;
        setDisplayedChild(cVar.r);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(200L);
        setOutAnimation(alphaAnimation2);
        super.onRestoreInstanceState(cVar.s);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new c(getDisplayedChild(), super.onSaveInstanceState());
    }

    public final void setContentPaddingBottom(int i) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
        }
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
        }
    }

    public final void setFancyAppBarElevated(boolean z) {
        if (z) {
            vf.a aVar = this.x;
            if (aVar != null) {
                aVar.a.setElevation(aVar.c);
                aVar.b = -1.0f;
                return;
            }
            return;
        }
        vf.a aVar2 = this.x;
        if (aVar2 != null) {
            aVar2.a.setElevation(0.0f);
            aVar2.b = -1.0f;
        }
    }

    public final void setRefreshing(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.u;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(z);
        }
    }

    public final void setSwipeToRefreshState(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.u;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(z);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.v;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setEnabled(z);
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final Integer c;
        public final j71.a d;

        public b(String str, String str2, Integer num, j71.a aVar) {
            k71.k.g(str, "title");
            k71.k.g(aVar, "buttonAction");
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
            Integer num = this.c;
            return this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder o = s0.o("EmptyModel(title=", this.a, ", description=", this.b, ", imageDrawable=null, buttonTextResId=");
            o.append(this.c);
            o.append(", buttonAction=");
            o.append(this.d);
            o.append(")");
            return o.toString();
        }

        public /* synthetic */ b(String str, String str2, j71.a aVar, int i) {
            this(str, (i & 2) != 0 ? null : str2, (i & 8) != 0 ? null : 2131953542, (i & 16) != 0 ? new com.github.rudroid.widget.p(15) : aVar);
        }
    }















}
