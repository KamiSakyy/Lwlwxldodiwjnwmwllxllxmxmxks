package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.a;
import androidx.viewpager.widget.d;
import androidx.viewpager.widget.h;
import b5.e;
import b6.a2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import e50.z0;
import java.util.ArrayList;
import java.util.Iterator;
import o31.o;
import sy.w;
import u31.j;
import w8.s;
import x31.b;
import x31.f;
import x31.g;
import x31.k;
import z4.c;

@d
/* loaded from: /home/user/work/p/classes4.dex */
public class TabLayout extends HorizontalScrollView {
    public static final c q0 = new c(16);
    public int A;
    public int B;
    public ColorStateList C;
    public ColorStateList D;
    public ColorStateList E;
    public Drawable F;
    public int G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public int a0;
    public boolean b0;
    public z0 c0;
    public TimeInterpolator d0;
    public x31.c e0;
    public ArrayList f0;
    public k g0;
    public ValueAnimator h0;
    public androidx.viewpager.widget.k i0;
    public a j0;
    public h k0;
    public x31.h l0;
    public b m0;
    public boolean n0;
    public int o0;
    public z3.d p0;
    public int r;
    public ArrayList s;
    public g t;
    public f u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130969879, 2132018231), attributeSet, 2130969879);
        this.r = -1;
        this.s = new ArrayList();
        this.B = -1;
        this.G = 0;
        this.L = Integer.MAX_VALUE;
        this.W = -1;
        this.f0 = new ArrayList();
        this.p0 = new z3.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.u = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray f = o.f(context2, attributeSet, x21.a.M, 2130969879, 2132018231, 24);
        ColorStateList c = a2.c(getBackground());
        if (c != null) {
            j jVar = new j();
            jVar.q(c);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
        setSelectedTabIndicator(i4.Y(context2, f, 5));
        setSelectedTabIndicatorColor(f.getColor(8, 0));
        fVar.b(f.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(f.getInt(10, 0));
        setTabIndicatorAnimationMode(f.getInt(7, 0));
        setTabIndicatorFullWidth(f.getBoolean(9, true));
        int dimensionPixelSize = f.getDimensionPixelSize(16, 0);
        this.y = dimensionPixelSize;
        this.x = dimensionPixelSize;
        this.w = dimensionPixelSize;
        this.v = dimensionPixelSize;
        this.v = f.getDimensionPixelSize(19, dimensionPixelSize);
        this.w = f.getDimensionPixelSize(20, dimensionPixelSize);
        this.x = f.getDimensionPixelSize(18, dimensionPixelSize);
        this.y = f.getDimensionPixelSize(17, dimensionPixelSize);
        if (b4.d0(2130969285, context2, false)) {
            this.z = 2130969940;
        } else {
            this.z = 2130969898;
        }
        int resourceId = f.getResourceId(24, 2132017816);
        this.A = resourceId;
        int[] iArr = j.a.x;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.H = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.C = i4.W(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (f.hasValue(22)) {
                this.B = f.getResourceId(22, resourceId);
            }
            int i = this.B;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i, iArr);
                try {
                    this.I = obtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList W = i4.W(context2, obtainStyledAttributes, 3);
                    if (W != null) {
                        this.C = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{W.getColorForState(new int[]{R.attr.state_selected}, W.getDefaultColor()), this.C.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (f.hasValue(25)) {
                this.C = i4.W(context2, f, 25);
            }
            if (f.hasValue(23)) {
                this.C = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{f.getColor(23, 0), this.C.getDefaultColor()});
            }
            this.D = i4.W(context2, f, 3);
            o.g(f.getInt(4, -1), null);
            this.E = i4.W(context2, f, 21);
            this.R = f.getInt(6, 300);
            this.d0 = k41.b.K(context2, 2130969550, y21.a.b);
            this.M = f.getDimensionPixelSize(14, -1);
            this.N = f.getDimensionPixelSize(13, -1);
            this.K = f.getResourceId(0, 0);
            this.P = f.getDimensionPixelSize(1, 0);
            this.T = f.getInt(15, 1);
            this.Q = f.getInt(2, 0);
            this.U = f.getBoolean(12, false);
            this.b0 = f.getBoolean(26, false);
            f.recycle();
            Resources resources = getResources();
            this.J = resources.getDimensionPixelSize(2131165373);
            this.O = resources.getDimensionPixelSize(2131165371);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int i2 = this.T;
        if (i2 == 0 || i2 == 2) {
            return this.O;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.u.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        f fVar = this.u;
        int childCount = fVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = fVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof x31.j) {
                        ((x31.j) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(x31.c cVar) {
        ArrayList arrayList = this.f0;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(g gVar, boolean z) {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        if (gVar.e != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        gVar.c = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((g) arrayList.get(i2)).c == this.r) {
                i = i2;
            }
            ((g) arrayList.get(i2)).c = i2;
        }
        this.r = i;
        x31.j jVar = gVar.f;
        jVar.setSelected(false);
        jVar.setActivated(false);
        int i3 = gVar.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.T == 1 && this.Q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.u.addView(jVar, i3, layoutParams);
        if (z) {
            gVar.a();
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.u;
            int childCount = fVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (fVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int e = e(i, 0.0f);
            if (scrollX != e) {
                f();
                this.h0.setIntValues(scrollX, e);
                this.h0.start();
            }
            ValueAnimator valueAnimator = fVar.r;
            if (valueAnimator != null && valueAnimator.isRunning() && fVar.s.r != i) {
                fVar.r.cancel();
            }
            fVar.d(i, this.R, true);
            return;
        }
        m(i, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r0 != 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i = this.T;
        int max = (i == 0 || i == 2) ? Math.max(0, this.P - this.v) : 0;
        f fVar = this.u;
        fVar.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.T;
        if (i2 == 0) {
            int i3 = this.Q;
            if (i3 != 0) {
                if (i3 == 1) {
                    fVar.setGravity(1);
                }
            }
            fVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            fVar.setGravity(1);
        }
        o(true);
    }

    public final int e(int i, float f) {
        f fVar;
        View childAt;
        int i2 = this.T;
        if ((i2 != 0 && i2 != 2) || (childAt = (fVar = this.u).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < fVar.getChildCount() ? fVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void f() {
        if (this.h0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.h0 = valueAnimator;
            valueAnimator.setInterpolator(this.d0);
            this.h0.setDuration(this.R);
            this.h0.addUpdateListener(new d31.b(3, this));
        }
    }

    public final g g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (g) this.s.get(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.t;
        if (gVar != null) {
            return gVar.c;
        }
        return -1;
    }

    public int getTabCount() {
        return this.s.size();
    }

    public int getTabGravity() {
        return this.Q;
    }

    public ColorStateList getTabIconTint() {
        return this.D;
    }

    public int getTabIndicatorAnimationMode() {
        return this.a0;
    }

    public int getTabIndicatorGravity() {
        return this.S;
    }

    public int getTabMaxWidth() {
        return this.L;
    }

    public int getTabMode() {
        return this.T;
    }

    public ColorStateList getTabRippleColor() {
        return this.E;
    }

    public Drawable getTabSelectedIndicator() {
        return this.F;
    }

    public ColorStateList getTabTextColors() {
        return this.C;
    }

    public final g h() {
        g gVar = (g) q0.a();
        if (gVar == null) {
            gVar = new g();
            gVar.c = -1;
        }
        gVar.e = this;
        z3.d dVar = this.p0;
        x31.j jVar = dVar != null ? (x31.j) dVar.a() : null;
        if (jVar == null) {
            jVar = new x31.j(this, getContext());
        }
        jVar.setTab(gVar);
        jVar.setFocusable(true);
        jVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            jVar.setContentDescription(gVar.b);
        } else {
            jVar.setContentDescription(null);
        }
        gVar.f = jVar;
        return gVar;
    }

    public final void i() {
        int currentItem;
        j();
        a aVar_r7 = this.j0;
        if (aVar_r7 != null) {
            int c = aVar_r7.c();
            for (int i = 0; i < c; i++) {
                g h = h();
                h.b(this.j0.d(i));
                b(h, false);
            }
            androidx.viewpager.widget.k kVar_r7 = this.i0;
            if (kVar_r7 == null || c <= 0 || (currentItem = kVar_r7.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            k(g(currentItem), true);
        }
    }

    public final void j() {
        f fVar = this.u;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            x31.j jVar = (x31.j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                this.p0.c(jVar);
            }
            requestLayout();
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.e = null;
            gVar.f = null;
            gVar.a = null;
            gVar.b = null;
            gVar.c = -1;
            gVar.d = null;
            q0.c(gVar);
        }
        this.t = null;
    }

    public final void k(g gVar, boolean z) {
        TabLayout tabLayout;
        g gVar2 = this.t;
        ArrayList arrayList = this.f0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((x31.c) arrayList.get(size)).C0(gVar);
                }
                c(gVar.c);
                return;
            }
            return;
        }
        int i = gVar != null ? gVar.c : -1;
        if (z) {
            if ((gVar2 == null || gVar2.c == -1) && i != -1) {
                tabLayout = this;
                tabLayout.m(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.t = gVar;
        if (gVar2 != null && gVar2.e != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((x31.c) arrayList.get(size2)).d3(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((x31.c) arrayList.get(size3)).j0(gVar);
            }
        }
    }

    public final void l(a aVar, boolean z) {
        h hVar;
        a aVar2_r7 = this.j0;
        if (aVar2_r7 != null && (hVar = this.k0) != null) {
            aVar2_r7.a.unregisterObserver(hVar);
        }
        this.j0 = aVar;
        if (z && aVar != null) {
            if (this.k0 == null) {
                this.k0 = new h(3, this);
            }
            aVar.a.registerObserver(this.k0);
        }
        i();
    }

    public final void m(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            f fVar = this.u;
            if (round >= fVar.getChildCount()) {
                return;
            }
            if (z2) {
                fVar.s.r = Math.round(f2);
                ValueAnimator valueAnimator = fVar.r;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.r.cancel();
                }
                fVar.c(fVar.getChildAt(i), fVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.h0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.h0.cancel();
            }
            int e = e(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.o0 == 1 || z3) {
                if (i < 0) {
                    e = 0;
                }
                scrollTo(e, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void n(androidx.viewpager.widget.k kVar, boolean z) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.viewpager.widget.k kVar2 = this.i0;
        if (kVar2 != null) {
            x31.h hVar = this.l0;
            if (hVar != null && (arrayList2 = kVar2.l0) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.m0;
            if (bVar != null && (arrayList = this.i0.n0) != null) {
                arrayList.remove(bVar);
            }
        }
        k kVar3 = this.g0;
        if (kVar3 != null) {
            this.f0.remove(kVar3);
            this.g0 = null;
        }
        if (kVar != null) {
            this.i0 = kVar;
            if (this.l0 == null) {
                this.l0 = new x31.h(this);
            }
            x31.h hVar2 = this.l0;
            hVar2.c = 0;
            hVar2.b = 0;
            if (kVar.l0 == null) {
                kVar.l0 = new ArrayList();
            }
            kVar.l0.add(hVar2);
            k kVar4 = new k(kVar, 0);
            this.g0 = kVar4;
            a(kVar4);
            a adapter = kVar.getAdapter();
            if (adapter != null) {
                l(adapter, true);
            }
            if (this.m0 == null) {
                this.m0 = new b(this);
            }
            b bVar2 = this.m0;
            bVar2.a = true;
            if (kVar.n0 == null) {
                kVar.n0 = new ArrayList();
            }
            kVar.n0.add(bVar2);
            tabLayout = this;
            tabLayout.m(kVar.getCurrentItem(), 0.0f, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.i0 = null;
            l(null, false);
        }
        tabLayout.n0 = z;
    }

    public final void o(boolean z) {
        int i = 0;
        while (true) {
            f fVar = this.u;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.T == 1 && this.Q == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            w.u(this, (j) background);
        }
        if (this.i0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.k) {
                n((androidx.viewpager.widget.k) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.n0) {
            setupWithViewPager(null);
            this.n0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x31.j jVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            f fVar = this.u;
            if (i >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i);
            if ((childAt instanceof x31.j) && (drawable = (jVar = (x31.j) childAt).z) != null) {
                drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                jVar.z.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e.c(1, getTabCount(), 1, false).b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round = Math.round(o.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.N;
            if (i3 <= 0) {
                i3 = (int) (size - o.d(getContext(), 56));
            }
            this.L = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.T;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).p(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        int i = 0;
        while (true) {
            f fVar = this.u;
            if (i >= fVar.getChildCount()) {
                d();
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof x31.j) {
                x31.j jVar = (x31.j) childAt;
                jVar.setOrientation(!jVar.B.U ? 1 : 0);
                TextView textView = jVar.x;
                if (textView == null && jVar.y == null) {
                    jVar.g(jVar.s, jVar.t, true);
                } else {
                    jVar.g(textView, jVar.y, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(x31.d dVar) {
        setOnTabSelectedListener((x31.c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.h0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.F = mutate;
        int i = this.G;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.W;
        if (i2 == -1) {
            i2 = this.F.getIntrinsicHeight();
        }
        this.u.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.G = i;
        Drawable drawable = this.F;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        o(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.S != i) {
            this.S = i;
            this.u.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.W = i;
        this.u.b(i);
    }

    public void setTabGravity(int i) {
        if (this.Q != i) {
            this.Q = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                x31.j jVar = ((g) arrayList.get(i)).f;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(o4.b.c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.a0 = i;
        if (i == 0) {
            this.c0 = new z0(9);
            return;
        }
        if (i == 1) {
            this.c0 = new x31.a(0);
        } else {
            if (i == 2) {
                this.c0 = new x31.a(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.V = z;
        int i = f.t;
        f fVar = this.u;
        fVar.a(fVar.s.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.T) {
            this.T = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.E == colorStateList) {
            return;
        }
        this.E = colorStateList;
        int i = 0;
        while (true) {
            f fVar = this.u;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof x31.j) {
                Context context = getContext();
                int i2 = x31.j.C;
                ((x31.j) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(o4.b.c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                x31.j jVar = ((g) arrayList.get(i)).f;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar_r7) {
        l(aVar_r7, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.b0 == z) {
            return;
        }
        this.b0 = z;
        int i = 0;
        while (true) {
            f fVar = this.u;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof x31.j) {
                Context context = getContext();
                int i2 = x31.j.C;
                ((x31.j) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(androidx.viewpager.widget.k kVar_r7) {
        n(kVar_r7, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams_dup(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(x31.c cVar) {
        x31.c cVar2 = this.e0;
        if (cVar2 != null) {
            this.f0.remove(cVar2);
        }
        this.e0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(s.o(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

}
