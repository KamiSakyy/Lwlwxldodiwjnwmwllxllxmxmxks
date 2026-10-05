package com.google.android.material.appbar;

import a5.c1;
import a5.p2;
import a5.t0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o31.o;
import y3.j;
import z21.e;
import z21.f;

/* loaded from: /home/user/work/p/classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int A;
    public final Rect B;
    public final o31.d C;
    public final o31.d D;
    public final m31.a E;
    public boolean F;
    public boolean G;
    public final int H;
    public Drawable I;
    public Drawable J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public long N;
    public final TimeInterpolator O;
    public final TimeInterpolator P;
    public int Q;
    public e R;
    public int S;
    public int T;
    public int U;
    public p2 V;
    public int W;
    public boolean a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public boolean r;
    public final int s;
    public ViewGroup t;
    public View u;
    public View v;
    public int w;
    public int x;
    public int y;
    public int z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 2130968845, 2132018226), attributeSet, 2130968845);
        ColorStateList W;
        ColorStateList W2;
        this.r = true;
        this.B = new Rect();
        this.Q = -1;
        this.W = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.e0 = 0;
        Context context2 = getContext();
        this.T = getResources().getConfiguration().orientation;
        o31.d dVar = new o31.d(this);
        this.C = dVar;
        DecelerateInterpolator decelerateInterpolator = y21.a.e;
        dVar.X = decelerateInterpolator;
        dVar.l(false);
        dVar.K = false;
        this.E = new m31.a(context2);
        o.a(context2, attributeSet, 2130968845, 2132018226);
        int[] iArr = x21.a.j;
        o.b(context2, attributeSet, iArr, 2130968845, 2132018226, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968845, 2132018226);
        int i = obtainStyledAttributes.getInt(9, 8388691);
        int i2 = obtainStyledAttributes.getInt(2, 8388627);
        this.H = obtainStyledAttributes.getInt(3, 1);
        dVar.x(i);
        dVar.s(i2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.z = dimensionPixelSize;
        this.y = dimensionPixelSize;
        this.x = dimensionPixelSize;
        this.w = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(13)) {
            this.w = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.y = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.x = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.z = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.A = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.F = obtainStyledAttributes.getBoolean(28, true);
        setTitle(obtainStyledAttributes.getText(26));
        dVar.w(2132017806);
        dVar.q(2132017785);
        if (obtainStyledAttributes.hasValue(16)) {
            dVar.w(obtainStyledAttributes.getResourceId(16, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            dVar.q(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(31)) {
            int i3 = obtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i3 != 0 ? i3 != 1 ? i3 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (obtainStyledAttributes.hasValue(17) && dVar.o != (W2 = i4.W(context2, obtainStyledAttributes, 17))) {
            dVar.o = W2;
            dVar.l(false);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            dVar.r(i4.W(context2, obtainStyledAttributes, 5));
        }
        this.Q = obtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (obtainStyledAttributes.hasValue(29)) {
            dVar.v(obtainStyledAttributes.getInt(29, 1));
        } else if (obtainStyledAttributes.hasValue(20)) {
            dVar.v(obtainStyledAttributes.getInt(20, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            dVar.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            dVar.l(false);
        }
        o31.d dVar2 = new o31.d(this);
        this.D = dVar2;
        dVar2.X = decelerateInterpolator;
        dVar2.l(false);
        dVar2.K = false;
        if (obtainStyledAttributes.hasValue(24)) {
            setSubtitle(obtainStyledAttributes.getText(24));
        }
        dVar2.x(i);
        dVar2.s(i2);
        dVar2.w(2132017762);
        dVar2.q(2132017783);
        if (obtainStyledAttributes.hasValue(7)) {
            dVar2.w(obtainStyledAttributes.getResourceId(7, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            dVar2.q(obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(8) && dVar2.o != (W = i4.W(context2, obtainStyledAttributes, 8))) {
            dVar2.o = W;
            dVar2.l(false);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            dVar2.r(i4.W(context2, obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(25)) {
            dVar2.v(obtainStyledAttributes.getInt(25, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            dVar2.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            dVar2.l(false);
        }
        this.N = obtainStyledAttributes.getInt(21, 600);
        this.O = k41.b.K(context2, 2130969556, y21.a.c);
        this.P = k41.b.K(context2, 2130969556, y21.a.d);
        setContentScrim(obtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(obtainStyledAttributes.getInt(27, 0));
        this.s = obtainStyledAttributes.getResourceId(32, -1);
        this.a0 = obtainStyledAttributes.getBoolean(19, false);
        this.d0 = obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        j jVar = new j(5, this);
        WeakHashMap weakHashMap = c1.a;
        t0.m(this, jVar);
    }

    public static z21.j b(View view) {
        z21.j jVar = (z21.j) view.getTag(2131363502);
        if (jVar != null) {
            return jVar;
        }
        z21.j jVar2 = new z21.j(view);
        view.setTag(2131363502, jVar2);
        return jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateList;
        Context context = getContext();
        TypedValue c0 = b4.c0(context, 2130968898);
        if (c0 != null) {
            int i = c0.resourceId;
            if (i != 0) {
                colorStateList = o4.b.c(context, i);
            } else {
                int i2 = c0.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
            if (colorStateList == null) {
                return colorStateList.getDefaultColor();
            }
            float dimension = getResources().getDimension(2131165327);
            m31.a aVar = this.E;
            return aVar.a(aVar.d, dimension);
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public final void a() {
        if (this.r) {
            ViewGroup viewGroup = null;
            this.t = null;
            this.u = null;
            int i = this.s;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.t = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.u = view;
                }
            }
            if (this.t == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.t = viewGroup;
            }
            c();
            this.r = false;
        }
    }

    public final void c() {
        View view;
        if (!this.F && (view = this.v) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.v);
            }
        }
        if (!this.F || this.t == null) {
            return;
        }
        if (this.v == null) {
            this.v = new View(getContext());
        }
        if (this.v.getParent() == null) {
            this.t.addView(this.v, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z21.d;
    }

    public final void d() {
        if (this.I == null && this.J == null) {
            return;
        }
        setScrimsShown(getHeight() + this.S < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.t == null && (drawable = this.I) != null && this.K > 0) {
            drawable.mutate().setAlpha(this.K);
            this.I.draw(canvas);
        }
        if (this.F && this.G) {
            ViewGroup viewGroup = this.t;
            o31.d dVar = this.D;
            o31.d dVar2 = this.C;
            if (viewGroup == null || this.I == null || this.K <= 0 || this.U != 1 || dVar2.b >= dVar2.e) {
                dVar2.f(canvas);
                dVar.f(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.I.getBounds(), Region.Op.DIFFERENCE);
                dVar2.f(canvas);
                dVar.f(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.J == null || this.K <= 0) {
            return;
        }
        p2 p2Var = this.V;
        int d = p2Var != null ? p2Var.d() : 0;
        if (d > 0) {
            this.J.setBounds(0, -this.S, getWidth(), d - this.S);
            this.J.mutate().setAlpha(this.K);
            this.J.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.I;
        if (drawable == null || this.K <= 0 || ((view2 = this.u) == null || view2 == this ? view != this.t : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.U == 1 && view != null && this.F) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.I.mutate().setAlpha(this.K);
            this.I.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.I;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        o31.d dVar = this.C;
        if (dVar != null) {
            dVar.S = drawableState;
            ColorStateList colorStateList2 = dVar.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.o) != null && colorStateList.isStateful())) {
                dVar.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.F || (view = this.v) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = view.isAttachedToWindow() && this.v.getVisibility() == 0;
        this.G = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.u;
            if (view2 == null) {
                view2 = this.t;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((z21.d) view2.getLayoutParams())).bottomMargin;
            View view3 = this.v;
            Rect rect = this.B;
            o31.e.a(this, view3, rect);
            Toolbar toolbar = this.t;
            if (toolbar instanceof Toolbar) {
                Toolbar toolbar2 = toolbar;
                i8 = toolbar2.getTitleMarginStart();
                i6 = toolbar2.getTitleMarginEnd();
                i7 = toolbar2.getTitleMarginTop();
                i5 = toolbar2.getTitleMarginBottom();
            } else if (toolbar instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar3 = (android.widget.Toolbar) toolbar;
                i8 = toolbar3.getTitleMarginStart();
                i6 = toolbar3.getTitleMarginEnd();
                i7 = toolbar3.getTitleMarginTop();
                i5 = toolbar3.getTitleMarginBottom();
            } else {
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            int i9 = rect.left + (z3 ? i6 : i8);
            int i10 = rect.right - (z3 ? i8 : i6);
            int i12 = rect.top + height + i7;
            int i13 = (rect.bottom + height) - i5;
            o31.d dVar = this.D;
            TextPaint textPaint = dVar.V;
            textPaint.setTextSize(dVar.n);
            textPaint.setTypeface(dVar.x);
            textPaint.setLetterSpacing(dVar.g0);
            int descent = (int) (i13 - (textPaint.descent() + (-textPaint.ascent())));
            o31.d dVar2 = this.C;
            TextPaint textPaint2 = dVar2.V;
            textPaint2.setTextSize(dVar2.n);
            textPaint2.setTypeface(dVar2.x);
            textPaint2.setLetterSpacing(dVar2.g0);
            int descent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i12);
            if (TextUtils.isEmpty(dVar.H)) {
                dVar2.o(i9, i12, i10, i13);
            } else {
                dVar2.o(i9, i12, i10, descent);
                dVar.o(i9, descent2, i10, i13);
            }
            if (this.H == 0) {
                o31.e.a(this, this, rect);
                int i14 = rect.left + (z3 ? i6 : i8);
                int i15 = rect.right;
                if (!z3) {
                    i8 = i6;
                }
                int i16 = i15 - i8;
                if (TextUtils.isEmpty(dVar.H)) {
                    dVar2.p(i14, i12, i16, i13);
                } else {
                    dVar2.p(i14, i12, i16, descent);
                    dVar.p(i14, descent2, i16, i13);
                }
            }
            int i17 = z3 ? this.y : this.w;
            int i18 = rect.top + this.x;
            int i19 = (i3 - i) - (z3 ? this.w : this.y);
            int i20 = (i4 - i2) - this.z;
            if (TextUtils.isEmpty(dVar.H)) {
                this.C.u(true, i17, i18, i19, i20);
                dVar2.l(z);
            } else {
                this.C.u(false, i17, i18, i19, (int) ((i20 - (dVar.i() + this.c0)) - this.A));
                this.D.u(false, i17, (int) (dVar2.i() + this.b0 + i18 + this.A), i19, i20);
                dVar2.l(z);
                dVar.l(z);
            }
        }
    }

    public final void f() {
        Toolbar toolbar = this.t;
        if (toolbar == null || !this.F) {
            return;
        }
        CharSequence charSequence = null;
        CharSequence title = toolbar instanceof Toolbar ? toolbar.getTitle() : toolbar instanceof android.widget.Toolbar ? ((android.widget.Toolbar) toolbar).getTitle() : null;
        if (TextUtils.isEmpty(this.C.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        Toolbar toolbar2 = this.t;
        if (toolbar2 instanceof Toolbar) {
            charSequence = toolbar2.getSubtitle();
        } else if (toolbar2 instanceof android.widget.Toolbar) {
            charSequence = ((android.widget.Toolbar) toolbar2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.D.H) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        setSubtitle(charSequence);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        z21.d dVar = new z21.d(-1, -1);
        dVar.a = 0;
        dVar.b = 0.5f;
        return dVar;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.D.n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.D.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.C.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.C.n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.C.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.I;
    }

    public float getExpandedSubtitleTextSize() {
        return this.D.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.D.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.C.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.z;
    }

    public int getExpandedTitleMarginEnd() {
        return this.y;
    }

    public int getExpandedTitleMarginStart() {
        return this.w;
    }

    public int getExpandedTitleMarginTop() {
        return this.x;
    }

    public int getExpandedTitleSpacing() {
        return this.A;
    }

    public float getExpandedTitleTextSize() {
        return this.C.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.C.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.C.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.C.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.C.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.C.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.C.o0;
    }

    public int getScrimAlpha() {
        return this.K;
    }

    public long getScrimAnimationDuration() {
        return this.N;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.Q;
        if (i >= 0) {
            return i + this.W + this.b0 + this.c0 + this.e0;
        }
        p2 p2Var = this.V;
        int d = p2Var != null ? p2Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.J;
    }

    public CharSequence getSubtitle() {
        if (this.F) {
            return this.D.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.F) {
            return this.C.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.U;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.C.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.C.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.U == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.R == null) {
                this.R = new e(this);
            }
            e eVar = this.R;
            if (appBarLayout.y == null) {
                appBarLayout.y = new ArrayList();
            }
            if (eVar != null && !appBarLayout.y.contains(eVar)) {
                appBarLayout.y.add(eVar);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o31.d dVar = this.C;
        dVar.k(configuration);
        if (this.T != configuration.orientation && this.d0 && dVar.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.T = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        e eVar = this.R;
        if (eVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).y) != null) {
            arrayList.remove(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p2 p2Var = this.V;
        if (p2Var != null) {
            int d = p2Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    WeakHashMap weakHashMap = c1.a;
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            z21.j b = b(getChildAt(i6));
            View view = b.a;
            b.b = view.getTop();
            b.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ViewGroup viewGroup;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        p2 p2Var = this.V;
        int d = p2Var != null ? p2Var.d() : 0;
        if ((mode == 0 || this.a0) && d > 0) {
            this.W = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        f();
        if (this.F) {
            o31.d dVar = this.C;
            if (!TextUtils.isEmpty(dVar.H)) {
                int measuredHeight3 = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), measuredHeight3);
                float i3 = dVar.i() + collapsingToolbarLayout.W + collapsingToolbarLayout.x;
                o31.d dVar2 = collapsingToolbarLayout.D;
                int i4 = (int) (i3 + (TextUtils.isEmpty(dVar2.H) ? 0.0f : collapsingToolbarLayout.A + dVar2.i()) + collapsingToolbarLayout.z);
                if (i4 > measuredHeight3) {
                    collapsingToolbarLayout.e0 = i4 - measuredHeight3;
                } else {
                    collapsingToolbarLayout.e0 = 0;
                }
                if (collapsingToolbarLayout.d0) {
                    if (dVar.o0 > 1) {
                        int i5 = dVar.q;
                        if (i5 > 1) {
                            collapsingToolbarLayout.b0 = (i5 - 1) * Math.round(dVar.i());
                        } else {
                            collapsingToolbarLayout.b0 = 0;
                        }
                    }
                    if (dVar2.o0 > 1) {
                        int i6 = dVar2.q;
                        if (i6 > 1) {
                            collapsingToolbarLayout.c0 = (i6 - 1) * Math.round(dVar2.i());
                        } else {
                            collapsingToolbarLayout.c0 = 0;
                        }
                    }
                }
                int i7 = collapsingToolbarLayout.e0;
                int i8 = collapsingToolbarLayout.b0;
                int i9 = collapsingToolbarLayout.c0;
                if (i7 + i8 + i9 > 0) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i7 + i8 + i9, 1073741824));
                }
                viewGroup = collapsingToolbarLayout.t;
                if (viewGroup == null) {
                    View view = collapsingToolbarLayout.u;
                    if (view == null || view == collapsingToolbarLayout) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        setMinimumHeight(measuredHeight);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    } else {
                        measuredHeight2 = view.getMeasuredHeight();
                    }
                    setMinimumHeight(measuredHeight2);
                    return;
                }
                return;
            }
        }
        collapsingToolbarLayout = this;
        viewGroup = collapsingToolbarLayout.t;
        if (viewGroup == null) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.I;
        if (drawable != null) {
            ViewGroup viewGroup = this.t;
            if (this.U == 1 && viewGroup != null && this.F) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.D.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        o31.d dVar = this.D;
        if (dVar.n != f) {
            dVar.n = f;
            dVar.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        o31.d dVar = this.D;
        if (dVar.t(typeface)) {
            dVar.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.C.s(i);
        this.D.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.C.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        o31.d dVar = this.C;
        if (dVar.n != f) {
            dVar.n = f;
            dVar.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        o31.d dVar = this.C;
        if (dVar.t(typeface)) {
            dVar.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.I = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.t;
                if (this.U == 1 && viewGroup != null && this.F) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.I.setCallback(this);
                this.I.setAlpha(this.K);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.D.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        o31.d dVar = this.D;
        if (dVar.o != colorStateList) {
            dVar.o = colorStateList;
            dVar.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.D.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        o31.d dVar = this.D;
        if (dVar.z(typeface)) {
            dVar.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.C.x(i);
        this.D.x(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.z = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.y = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.w = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.x = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.A = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.C.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        o31.d dVar = this.C;
        if (dVar.o != colorStateList) {
            dVar.o = colorStateList;
            dVar.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.C.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        o31.d dVar = this.C;
        if (dVar.z(typeface)) {
            dVar.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.d0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.a0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.C.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.C.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.C.r0 = f;
    }

    public void setMaxLines(int i) {
        this.C.v(i);
        this.D.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.C.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.K) {
            if (this.I != null && (viewGroup = this.t) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.K = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.N = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.Q != i) {
            this.Q = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.L != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.M = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.K ? this.O : this.P);
                    this.M.addUpdateListener(new d31.b(5, this));
                } else if (valueAnimator.isRunning()) {
                    this.M.cancel();
                }
                this.M.setDuration(this.N);
                this.M.setIntValues(this.K, i);
                this.M.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.L = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(f fVar) {
        o31.d dVar = this.C;
        dVar.getClass();
        if (fVar != null) {
            dVar.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.J;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.J = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.J.setState(getDrawableState());
                }
                this.J.setLayoutDirection(getLayoutDirection());
                this.J.setVisible(getVisibility() == 0, false);
                this.J.setCallback(this);
                this.J.setAlpha(this.K);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.D.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.U = i;
        boolean z = i == 1;
        this.C.c = z;
        this.D.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.U == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.I == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        o31.d dVar = this.C;
        dVar.G = truncateAt;
        dVar.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.F) {
            this.F = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        o31.d dVar = this.C;
        dVar.W = timeInterpolator;
        dVar.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.J;
        if (drawable != null && drawable.isVisible() != z) {
            this.J.setVisible(z, false);
        }
        Drawable drawable2 = this.I;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.I.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I || drawable == this.J;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        z21.d dVar = new z21.d(context, attributeSet);
        dVar.a = 0;
        dVar.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.k);
        dVar.a = obtainStyledAttributes.getInt(0, 0);
        dVar.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return dVar;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.D.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.C.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        z21.d dVar = new z21.d(-1, -1);
        dVar.a = 0;
        dVar.b = 0.5f;
        return dVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        z21.d dVar = new z21.d(layoutParams);
        dVar.a = 0;
        dVar.b = 0.5f;
        return dVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p2<T1,T2,T3,T4> {
        public p2() {
        }
    }
}
