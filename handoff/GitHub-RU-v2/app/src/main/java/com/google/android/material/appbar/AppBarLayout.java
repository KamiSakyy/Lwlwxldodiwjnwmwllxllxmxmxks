package com.google.android.material.appbar;

import a5.c1;
import a5.p2;
import a5.t0;
import a5.u;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.a2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import jo.f4;
import o31.o;
import sy.w;
import v2.t;
import w8.s;
import x.i;
import x.q0;
import y3.j;
import z21.e;
import z21.g;
import z21.h;
import z21.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class AppBarLayout extends LinearLayout implements l4.a {
    public static final /* synthetic */ int S = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public ColorStateList D;
    public int E;
    public WeakReference F;
    public ValueAnimator G;
    public ValueAnimator.AnimatorUpdateListener H;
    public ArrayList I;
    public LinkedHashSet J;
    public long K;
    public TimeInterpolator L;
    public int[] M;
    public int N;
    public Drawable O;
    public Integer P;
    public float Q;
    public Behavior R;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public p2 x;
    public ArrayList y;
    public boolean z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends h {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            l4.b bVar = view2.getLayoutParams().a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).j) + this.e) - y(view2);
                WeakHashMap weakHashMap = c1.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.C) {
                return false;
            }
            appBarLayout.f(appBarLayout.g(view));
            return false;
        }

        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                c1.p(coordinatorLayout, (a5.b) null);
            }
        }

        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout z2 = z(coordinatorLayout.l(view));
            if (z2 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    z2.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.F);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130968639, 2132018223), attributeSet, 2130968639);
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.w = 0;
        this.I = new ArrayList();
        this.J = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray f = o.f(context3, attributeSet, k.a, 2130968639, 2132018223, new int[0]);
        try {
            if (f.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, f.getResourceId(0, 0)));
            }
            f.recycle();
            TypedArray f2 = o.f(context2, attributeSet, x21.a.a, 2130968639, 2132018223, new int[0]);
            this.D = i4.W(context2, f2, 6);
            this.K = k41.b.J(2130969538, getResources().getInteger(2131427330), context2);
            this.L = k41.b.K(context2, 2130969556, y21.a.a);
            if (f2.hasValue(4)) {
                e(f2.getBoolean(4, false), false, false);
            }
            if (f2.hasValue(3)) {
                k.a(this, f2.getDimensionPixelSize(3, 0));
            }
            setBackground(f2.getDrawable(0));
            if (f2.hasValue(2)) {
                setKeyboardNavigationCluster(f2.getBoolean(2, false));
            }
            if (f2.hasValue(1)) {
                setTouchscreenBlocksFocus(f2.getBoolean(1, false));
            }
            this.Q = getResources().getDimension(2131165327);
            this.C = f2.getBoolean(5, false);
            this.E = f2.getResourceId(7, -1);
            setStatusBarForeground(f2.getDrawable(8));
            f2.recycle();
            j jVar = new j(4, this);
            WeakHashMap weakHashMap = c1.a;
            t0.m(this, jVar);
        } catch (Throwable th) {
            f.recycle();
            throw th;
        }
    }

    public static z21.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            z21.c cVar = new z21.c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            z21.c cVar2 = new z21.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        z21.c cVar3 = new z21.c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z21.c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        z21.c cVar = new z21.c(context, attributeSet);
        cVar.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.b);
        cVar.a = obtainStyledAttributes.getInt(1, 0);
        cVar.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new t(23);
        if (obtainStyledAttributes.hasValue(2)) {
            cVar.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.R;
        d F = (behavior == null || this.s == -1 || this.w != 0) ? null : behavior.F(i5.b.s, this);
        this.s = -1;
        this.t = -1;
        this.u = -1;
        if (F != null) {
            Behavior behavior2 = this.R;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = F;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z21.c;
    }

    public final void d(int i) {
        this.r = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = (e) this.y.get(i2);
                if (eVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = eVar.a;
                    collapsingToolbarLayout.S = i;
                    o31.d dVar = collapsingToolbarLayout.D;
                    o31.d dVar2 = collapsingToolbarLayout.C;
                    p2 p2Var = collapsingToolbarLayout.V;
                    int d = p2Var != null ? p2Var.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        z21.d dVar3 = (z21.d) childAt.getLayoutParams();
                        z21.j b = CollapsingToolbarLayout.b(childAt);
                        int i4 = dVar3.a;
                        if (i4 == 1) {
                            b.b(sy.o.b(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((z21.d) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            b.b(Math.round((-i) * dVar3.b));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.J != null && d > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
                    int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    int i5 = collapsingToolbarLayout.S + minimumHeight;
                    float f = minimumHeight;
                    float abs = Math.abs(i) / f;
                    float f2 = scrimVisibleHeightTrigger / f;
                    float min = Math.min(1.0f, f2);
                    dVar2.d = min;
                    dVar2.e = i.a(1.0f, min, 0.5f, min);
                    dVar2.f = i5;
                    dVar2.A(abs);
                    float min2 = Math.min(1.0f, f2);
                    dVar.d = min2;
                    dVar.e = i.a(1.0f, min2, 0.5f, min2);
                    dVar.f = i5;
                    dVar.A(abs);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.O == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.r);
        this.O.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.O;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        this.w = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z) {
        if (this.z || this.B == z) {
            return false;
        }
        this.B = z;
        refreshDrawableState();
        if (!(getBackground() instanceof u31.j)) {
            return true;
        }
        if (this.D != null) {
            h(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.C) {
            return true;
        }
        float f = this.Q;
        h(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final boolean g(View view) {
        int i;
        if (this.F == null && (i = this.E) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.E);
            }
            if (findViewById != null) {
                this.F = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.F;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        z21.c cVar = new z21.c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    public l4.b getBehavior() {
        Behavior behavior = new Behavior();
        this.R = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                z21.c cVar = (z21.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.t = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                z21.c cVar = (z21.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.u = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.E;
    }

    public u31.j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof u31.j) {
            return (u31.j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.w;
    }

    public Drawable getStatusBarForeground() {
        return this.O;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        p2 p2Var = this.x;
        if (p2Var != null) {
            return p2Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.s;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                z21.c cVar = (z21.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i3;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.s = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f, float f2) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.G = ofFloat;
        ofFloat.setDuration(this.K);
        this.G.setInterpolator(this.L);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.H;
        if (animatorUpdateListener != null) {
            this.G.addUpdateListener(animatorUpdateListener);
        }
        this.G.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof u31.j) {
            w.u(this, (u31.j) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.M == null) {
            this.M = new int[4];
        }
        int[] iArr = this.M;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.A;
        iArr[0] = z ? 2130969815 : -2130969815;
        iArr[1] = (z && this.B) ? 2130969816 : -2130969816;
        iArr[2] = z ? 2130969811 : -2130969811;
        iArr[3] = (z && this.B) ? 2130969810 : -2130969810;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.F;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.F = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = c1.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.v = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((z21.c) getChildAt(i5).getLayoutParams()).c != null) {
                this.v = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.z) {
            return;
        }
        if (!this.C) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((z21.c) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.A != z2) {
            this.A = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = sy.o.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final u31.j jVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer num = null;
        if (drawable instanceof u31.j) {
            jVar = (u31.j) drawable;
        } else {
            ColorStateList c = a2.c(drawable);
            if (c == null) {
                jVar = null;
            } else {
                u31.j jVar2 = new u31.j();
                jVar2.q(c);
                jVar = jVar2;
            }
        }
        if (jVar != null && (colorStateList = jVar.s.d) != null) {
            this.N = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.D;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue c0 = b4.c0(context2, 2130968896);
                if (c0 != null) {
                    int i = c0.resourceId;
                    num = Integer.valueOf(i != 0 ? context2.getColor(i) : c0.data);
                }
                this.H = new ValueAnimator.AnimatorUpdateListener() { // from class: z21.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num2;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.J;
                        ArrayList arrayList = appBarLayout.I;
                        int q = a.a.q(appBarLayout.N, ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(q);
                        u31.j jVar3 = jVar;
                        jVar3.q(valueOf);
                        if (appBarLayout.O != null && (num2 = appBarLayout.P) != null && num2.equals(num)) {
                            appBarLayout.O.setTint(q);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                if (jVar3.s.d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw f4.g(it);
                        }
                    }
                };
            } else {
                jVar.m(context);
                this.H = new ValueAnimator.AnimatorUpdateListener() { // from class: z21.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i2 = AppBarLayout.S;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        jVar.p(floatValue);
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        Drawable drawable2 = appBarLayout.O;
                        if (drawable2 instanceof u31.j) {
                            ((u31.j) drawable2).p(floatValue);
                        }
                        Iterator it = appBarLayout.I.iterator();
                        if (it.hasNext()) {
                            throw f4.g(it);
                        }
                        Iterator it2 = appBarLayout.J.iterator();
                        if (it2.hasNext()) {
                            throw f4.g(it2);
                        }
                    }
                };
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof u31.j) {
            ((u31.j) background).p(f);
        }
    }

    public void setExpanded(boolean z) {
        e(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.C = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.E = -1;
        if (view != null) {
            this.F = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.F;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.F = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.E = i;
        WeakReference weakReference = this.F;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.F = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.z = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setPendingAction(int i) {
        this.w = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.O = mutate;
            if (mutate instanceof u31.j) {
                num = Integer.valueOf(((u31.j) mutate).M);
            } else {
                ColorStateList c = a2.c(mutate);
                if (c != null) {
                    num = Integer.valueOf(c.getDefaultColor());
                }
            }
            this.P = num;
            Drawable drawable3 = this.O;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.O.setState(getDrawableState());
                }
                this.O.setLayoutDirection(getLayoutDirection());
                this.O.setVisible(getVisibility() == 0, false);
                this.O.setCallback(this);
            }
            if (this.O != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(s.o(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        k.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.O;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends g {
        public int j;
        public int k;
        public ValueAnimator l;
        public d m;
        public WeakReference n;

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt.getLayoutParams().a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof u) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((z21.c) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.C) {
                z2 = appBarLayout.g(D(coordinatorLayout));
            }
            boolean f = appBarLayout.f(z2);
            if (!z) {
                if (f) {
                    List list = (List) ((q0) coordinatorLayout.s.t).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.u;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        l4.b bVar = ((View) arrayList.get(i5)).getLayoutParams().a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(y() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            if (y == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(y21.a.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(y, i);
            this.l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i, i4, i5);
                    if (appBarLayout2.C) {
                        return;
                    }
                    appBarLayout2.f(appBarLayout2.g(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.C) {
            }
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int w = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + w;
                if (childAt.getTop() + w <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = i5.b.s;
                    }
                    d dVar = new d(parcelable);
                    boolean z = w == 0;
                    dVar.u = z;
                    dVar.t = !z && (-w) >= appBarLayout.getTotalScrollRange();
                    dVar.v = i;
                    dVar.x = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.w = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int y = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                z21.c cVar = (z21.c) childAt.getLayoutParams();
                if ((cVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i2 = -y;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                z21.c cVar2 = (z21.c) childAt2.getLayoutParams();
                int i3 = cVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (y < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (y < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    C(coordinatorLayout, appBarLayout, sy.o.b(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // z21.i
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            C(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.t) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.u) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.v);
                int i3 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.m.x ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.m.w) + i3);
            }
            appBarLayout.w = 0;
            this.m = null;
            int b = sy.o.b(w(), -appBarLayout.getTotalScrollRange(), 0);
            z21.j jVar = this.a;
            if (jVar != null) {
                jVar.b(b);
            } else {
                this.b = b;
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.d(w());
            if (c1.e(coordinatorLayout) != null) {
                return true;
            }
            c1.p(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && c1.e(coordinatorLayout2) == null) {
                c1.p(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.m = (d) parcelable;
            } else {
                this.m = null;
            }
        }

        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            i5.b F = F(absSavedState, (AppBarLayout) view);
            return F == null ? absSavedState : F;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.C || appBarLayout.B || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.C) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // z21.g
        public final int y() {
            return w() + this.j;
        }

        @Override // z21.g
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            List list;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            int i6 = 0;
            if (i2 == 0 || y < i2 || y > i3) {
                this.j = 0;
            } else {
                int b = sy.o.b(i, i2, i3);
                if (y != b) {
                    if (appBarLayout.v) {
                        int abs = Math.abs(b);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            z21.c cVar = (z21.c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = cVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(b);
                                }
                            }
                        }
                    }
                    i4 = b;
                    z21.j jVar = this.a;
                    if (jVar != null) {
                        z = jVar.b(i4);
                    } else {
                        this.b = i4;
                        z = false;
                    }
                    int i9 = y - b;
                    this.j = b - i4;
                    int i10 = 1;
                    if (z) {
                        int i12 = 0;
                        while (i12 < appBarLayout.getChildCount()) {
                            z21.c cVar2 = (z21.c) appBarLayout.getChildAt(i12).getLayoutParams();
                            t tVar = cVar2.b;
                            if (tVar != null && (cVar2.a & i10) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i12);
                                float w = w();
                                Rect rect = (Rect) tVar.t;
                                Rect rect2 = (Rect) tVar.s;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect2.top - Math.abs(w);
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / rect2.height());
                                    if (abs3 < 0.0f) {
                                        abs3 = 0.0f;
                                    } else if (abs3 > 1.0f) {
                                        abs3 = 1.0f;
                                    }
                                    float f2 = 1.0f - abs3;
                                    float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (f2 * f2)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-height));
                                    if (height >= rect.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i12++;
                            i10 = 1;
                        }
                    }
                    if (!z && appBarLayout.v && (list = (List) ((q0) coordinatorLayout.s.t).get(appBarLayout)) != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            View view2 = (View) list.get(i13);
                            l4.b bVar = view2.getLayoutParams().a;
                            if (bVar != null) {
                                bVar.h(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.d(w());
                    H(coordinatorLayout, appBarLayout, b, b < y ? -1 : 1, false);
                    i6 = i9;
                }
            }
            if (c1.e(coordinatorLayout) != null) {
                return i6;
            }
            c1.p(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams_dup() {
        z21.c cVar = new z21.c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams_dup(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

}
