package com.google.android.material.sidesheet;

import a0.s0;
import a5.c1;
import a5.k1;
import a5.t0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.settings.o;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.a;
import d31.c;
import d31.f;
import j5.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import jo.f4;
import l4.b;
import l4.e;
import p31.g;
import p31.h;
import sy.n;
import u31.j;
import u31.m;

/* loaded from: /home/user/work/p/classes4.dex */
public class SideSheetBehavior<V extends View> extends b implements p31.b {
    public n a;
    public final j b;
    public final ColorStateList c;
    public final u31.n d;
    public final f e;
    public final float f;
    public final boolean g;
    public int h;
    public d i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public h t;
    public int u;
    public final LinkedHashSet v;
    public final c w;

    public SideSheetBehavior() {
        this.e = new f(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new c(this, 1);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        c1.m(view, 262144);
        c1.i(view, 0);
        c1.m(view, 1048576);
        c1.i(view, 0);
        if (this.h != 5) {
            c1.n(view, b5.b.l, (String) null, new o(5, this));
        }
        if (this.h != 3) {
            c1.n(view, b5.b.j, (String) null, new o(3, this));
        }
    }

    @Override // p31.b
    public final void a(a aVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.t;
        if (hVar == null) {
            return;
        }
        n nVar = this.a;
        int i = (nVar == null || nVar.p() == 0) ? 5 : 3;
        a aVar2 = hVar.f;
        hVar.f = aVar;
        if (aVar2 != null) {
            hVar.a(aVar.c, i, aVar.d == 0);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.K(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // p31.b
    public final void b() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.t;
        if (hVar == null) {
            return;
        }
        a aVar = hVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f = null;
        int i2 = 5;
        if (aVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        n nVar = this.a;
        if (nVar != null && nVar.p() != 0) {
            i2 = 3;
        }
        Animator.AnimatorListener k1Var = new k1(8, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int i3 = this.a.i(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: v31.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.a.K(marginLayoutParams, y21.a.c(i3, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = hVar.b;
        boolean z = aVar.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new p6.a(1));
        ofFloat.setDuration(y21.a.c(hVar.c, aVar.c, hVar.d));
        ofFloat.addListener(new g(hVar, z, i2));
        ofFloat.addListener(k1Var);
        ofFloat.start();
    }

    @Override // p31.b
    public final void c(a aVar) {
        h hVar = this.t;
        if (hVar == null) {
            return;
        }
        hVar.f = aVar;
    }

    @Override // p31.b
    public final void d() {
        h hVar = this.t;
        if (hVar == null) {
            return;
        }
        View view = hVar.b;
        a aVar = hVar.f;
        hVar.f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(hVar.e);
        animatorSet.start();
    }

    public final void g(e eVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && c1.f(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (dVar = this.i) == null || !dVar.o(motionEvent)) ? false : true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        j jVar = this.b;
        int i3 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new h(view);
            if (jVar != null) {
                view.setBackground(jVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                jVar.p(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = c1.a;
                    t0.i(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (c1.f(view) == null) {
                c1.q(view, view.getResources().getString(2131954643));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        n nVar = this.a;
        if (nVar == null || nVar.p() != i5) {
            e eVar = null;
            u31.n nVar2 = this.d;
            if (i5 == 0) {
                this.a = new v31.a(this, 1);
                if (nVar2 != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        m g = nVar2.g();
                        g.f = new u31.a(0.0f);
                        g.g = new u31.a(0.0f);
                        u31.n a = g.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(s0.i("Invalid sheet edge position value: ", i5, ". Must be 0 or 1."));
                }
                this.a = new v31.a(this, 0);
                if (nVar2 != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        m g2 = nVar2.g();
                        g2.e = new u31.a(0.0f);
                        g2.h = new u31.a(0.0f);
                        u31.n a2 = g2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int n = this.a.n(view);
        coordinatorLayout.r(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.o(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.e(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            i3 = n - this.a.n(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.a.k();
        }
        WeakHashMap weakHashMap2 = c1.a;
        view.offsetLeftAndRight(i3);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view, Parcelable parcelable) {
        int i = ((v31.c) parcelable).t;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new v31.c(this);
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.j && y()) {
            float abs = Math.abs(this.u - motionEvent.getX());
            d dVar = this.i;
            if (abs > dVar.b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h1.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.p.get();
        b1.c cVar = new b1.c(this, i, 4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(cVar);
        } else {
            cVar.run();
        }
    }

    public final void x(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
        A();
    }

    public final boolean y() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        x(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, int i, boolean z) {
        int j;
        if (i == 3) {
            j = this.a.j();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(no.a.k("Invalid state to get outer edge offset: ", i));
            }
            j = this.a.k();
        }
        d dVar = this.i;
        if (dVar != null) {
            if (!z) {
                int top = view.getTop();
                dVar.r = view;
                dVar.c = -1;
                boolean h = dVar.h(j, top, 0, 0);
                if (!h && dVar.a == 0 && dVar.r != null) {
                    dVar.r = null;
                }
            }
        }
        x(i);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new f(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new c(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.I);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = i4.W(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = u31.n.c(context, attributeSet, 0, 2132018401).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        u31.n nVar = this.d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.b = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout<T1,T2,T3,T4> {
        public CoordinatorLayout() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d<T1,T2,T3,T4> {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }
}
