package com.google.android.material.bottomsheet;

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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b21.v;
import com.github.rudroid.copilot.h1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.n4;
import d31.c;
import d31.f;
import d31.k;
import j5.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l4.b;
import l4.e;
import l7.x1;
import no.a;
import u31.j;
import u31.n;

/* loaded from: /home/user/work/p/classes4.dex */
public class BottomSheetBehavior<V extends View> extends b implements p31.b {
    public boolean A;
    public final f B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final boolean M;
    public boolean N;
    public int O;
    public d P;
    public boolean Q;
    public int R;
    public boolean S;
    public final float T;
    public int U;
    public int V;
    public int W;
    public WeakReference X;
    public WeakReference Y;
    public final ArrayList Z;
    public final int a;
    public VelocityTracker a0;
    public boolean b;
    public p31.f b0;
    public boolean c;
    public int c0;
    public final float d;
    public int d0;
    public final int e;
    public boolean e0;
    public int f;
    public HashMap f0;
    public boolean g;
    public final SparseIntArray g0;
    public int h;
    public final c h0;
    public final int i;
    public final j j;
    public final ColorStateList k;
    public final int l;
    public final int m;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final n z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new f(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.T = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new c(this, 0);
    }

    public static BottomSheetBehavior A(View view) {
        e layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = layoutParams.a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int C() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.W;
        }
        if (i == 6) {
            return this.F;
        }
        throw new IllegalArgumentException(a.k("Invalid state to get top offset: ", i));
    }

    public final boolean E() {
        WeakReference weakReference = this.X;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.X.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void F() {
        this.c0 = -1;
        this.d0 = -1;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
    }

    public final void G(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.O == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i) {
        if (i == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        P();
    }

    public final void I(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h1.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.J || i != 5) {
            int i2 = (i == 6 && this.b && D(i) <= this.E) ? 3 : i;
            WeakReference weakReference = this.X;
            if (weakReference == null || weakReference.get() == null) {
                J(i);
                return;
            }
            View view = (View) this.X.get();
            d31.a aVar = new d31.a(this, view, i2, 0);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(aVar);
            } else {
                aVar.run();
            }
        }
    }

    public final void J(int i) {
        View view;
        if (this.O == i) {
            return;
        }
        this.O = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            O(true);
        } else if (i == 6 || i == 5 || i == 4) {
            O(false);
        }
        N(i, true);
        while (true) {
            ArrayList arrayList = this.Z;
            if (i2 >= arrayList.size()) {
                M();
                return;
            } else {
                ((d31.d) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean K(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.T) + ((float) view.getTop())) - ((float) this.H)) / ((float) y()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        J(2);
        N(r4, true);
        r2.B.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, int i, boolean z) {
        int D = D(i);
        d dVar = this.P;
        if (dVar != null) {
            if (!z) {
                int left = view.getLeft();
                dVar.r = view;
                dVar.c = -1;
                boolean h = dVar.h(left, D, 0, 0);
                if (!h && dVar.a == 0 && dVar.r != null) {
                    dVar.r = null;
                }
            }
        }
        J(i);
    }

    public final void M() {
        View view;
        int i;
        WeakReference weakReference = this.X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        c1.m(view, 524288);
        c1.i(view, 0);
        c1.m(view, 262144);
        c1.i(view, 0);
        c1.m(view, 1048576);
        c1.i(view, 0);
        SparseIntArray sparseIntArray = this.g0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            c1.m(view, i2);
            c1.i(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.O != 6) {
            String string = view.getResources().getString(2131951831);
            v vVar = new v(this, r7, 2);
            ArrayList g = c1.g(view);
            int i3 = 0;
            while (true) {
                if (i3 >= g.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = c1.d;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < g.size(); i7++) {
                            z &= ((b5.b) g.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    i = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((b5.b) g.get(i3)).a).getLabel())) {
                        i = ((b5.b) g.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                b5.b bVar = new b5.b((Object) null, i, string, vVar, (Class) null);
                a5.a e = c1.e(view);
                a5.b bVar2 = e == null ? null : e instanceof a5.a ? e.a : new a5.b(e);
                if (bVar2 == null) {
                    bVar2 = new a5.b();
                }
                c1.p(view, bVar2);
                c1.m(view, bVar.a());
                c1.g(view).add(bVar);
                c1.i(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.J) {
            int i8 = 5;
            if (this.O != 5) {
                c1.n(view, b5.b.l, (String) null, new v(this, i8, 2));
            }
        }
        int i9 = this.O;
        int i10 = 4;
        int i12 = 3;
        if (i9 == 3) {
            c1.n(view, b5.b.k, (String) null, new v(this, this.b ? 4 : 6, 2));
            return;
        }
        if (i9 == 4) {
            c1.n(view, b5.b.j, (String) null, new v(this, this.b ? 3 : 6, 2));
        } else {
            if (i9 != 6) {
                return;
            }
            c1.n(view, b5.b.k, (String) null, new v(this, i10, 2));
            c1.n(view, b5.b.j, (String) null, new v(this, i12, 2));
        }
    }

    public final void N(int i, boolean z) {
        j jVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.O == 3 && (this.y || E());
        if (this.A == z2 || (jVar = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            jVar.r(this.A ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(jVar.s.j, z2 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void O(boolean z) {
        HashMap hashMap;
        WeakReference weakReference = this.X;
        if (weakReference == null) {
            return;
        }
        CoordinatorLayout parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f0 != null) {
                    return;
                } else {
                    this.f0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.X.get()) {
                    if (z) {
                        this.f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.c && (hashMap = this.f0) != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.f0 = null;
            } else if (this.c) {
                ((View) this.X.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void P() {
        View view;
        if (this.X != null) {
            w();
            if (this.O != 4 || (view = (View) this.X.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p31.b
    public final void a(d.a aVar) {
        p31.f fVar = this.b0;
        if (fVar == null) {
            return;
        }
        d.a aVar2 = fVar.f;
        fVar.f = aVar;
        if (aVar2 == null) {
            return;
        }
        fVar.b(aVar.c);
    }

    @Override // p31.b
    public final void b() {
        p31.f fVar = this.b0;
        if (fVar == null) {
            return;
        }
        int i = fVar.d;
        int i2 = fVar.c;
        d.a aVar = fVar.f;
        fVar.f = null;
        if (aVar != null) {
            float f = aVar.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet a = fVar.a();
                    a.setDuration(y21.a.c(i2, f, i));
                    a.start();
                    I(4);
                    return;
                }
                Animator.AnimatorListener k1Var = new k1(3, this);
                View view = fVar.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new p6.a(1));
                ofFloat.setDuration(y21.a.c(i2, f, i));
                ofFloat.addListener(new k1(6, fVar));
                ofFloat.addListener(k1Var);
                ofFloat.start();
                return;
            }
        }
        I(this.J ? 5 : 4);
    }

    @Override // p31.b
    public final void c(d.a aVar) {
        p31.f fVar = this.b0;
        if (fVar == null) {
            return;
        }
        fVar.f = aVar;
    }

    @Override // p31.b
    public final void d() {
        p31.f fVar = this.b0;
        if (fVar == null) {
            return;
        }
        d.a aVar = fVar.f;
        fVar.f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet a = fVar.a();
        a.setDuration(fVar.e);
        a.start();
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public final void g(e eVar) {
        this.X = null;
        this.P = null;
        this.b0 = null;
    }

    public final void j() {
        this.X = null;
        this.P = null;
        this.b0 = null;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        d dVar;
        if (!view.isShown() || !this.L) {
            this.Q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            F();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.d0 = y;
            if (this.O != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x, y)) {
                    this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.e0 = true;
                }
            }
            this.Q = this.c0 == -1 && !coordinatorLayout.p(view, x, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.e0 = false;
            this.c0 = -1;
            if (this.Q) {
                this.Q = false;
                return false;
            }
        }
        if (this.Q || (dVar = this.P) == null || !dVar.o(motionEvent)) {
            WeakReference weakReference2 = this.Y;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.Q || this.O == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.P == null || (i = this.d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.P.b) {
                return false;
            }
        }
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.X == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(2131165342);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                n4 n4Var = new n4(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                k21.c cVar = new k21.c();
                cVar.a = paddingStart;
                cVar.b = paddingEnd;
                cVar.c = paddingBottom;
                x1 x1Var = new x1(n4Var, cVar);
                WeakHashMap weakHashMap = c1.a;
                t0.m(view, x1Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new k5.c(1));
                }
            }
            c1.s(view, new k(view));
            this.X = new WeakReference(view);
            this.b0 = new p31.f(view);
            j jVar = this.j;
            if (jVar != null) {
                view.setBackground(jVar);
                float f = this.I;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                jVar.p(f);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    t0.i(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.P == null) {
            this.P = new d(coordinatorLayout.getContext(), coordinatorLayout, this.h0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.V = coordinatorLayout.getWidth();
        this.W = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.U = height;
        int i3 = this.W;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            boolean z2 = this.s;
            int i6 = this.m;
            if (z2) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.U = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.U = i7;
            }
        }
        this.E = Math.max(0, this.W - this.U);
        this.F = (int) ((1.0f - this.G) * this.W);
        w();
        int i8 = this.O;
        if (i8 == 3) {
            int C = C();
            WeakHashMap weakHashMap2 = c1.a;
            view.offsetTopAndBottom(C);
        } else if (i8 == 6) {
            int i9 = this.F;
            WeakHashMap weakHashMap3 = c1.a;
            view.offsetTopAndBottom(i9);
        } else if (this.J && i8 == 5) {
            int i10 = this.W;
            WeakHashMap weakHashMap4 = c1.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i12 = this.H;
            WeakHashMap weakHashMap5 = c1.a;
            view.offsetTopAndBottom(i12);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = c1.a;
            view.offsetTopAndBottom(top2);
        }
        N(this.O, false);
        this.Y = new WeakReference(findScrollingChild(view));
        while (true) {
            ArrayList arrayList = this.Z;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((d31.d) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), B(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    public final boolean n(View view) {
        WeakReference weakReference = this.Y;
        return (weakReference == null || view != weakReference.get() || this.O == 3 || this.N) ? false : true;
    }

    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.M;
        if (i2 > 0) {
            if (!this.S && !z && view2 == view3 && view2.canScrollVertically(1)) {
                this.N = true;
                return;
            }
            if (i4 < C()) {
                int C = top - C();
                iArr[1] = C;
                WeakHashMap weakHashMap = c1.a;
                view.offsetTopAndBottom(-C);
                J(3);
            } else {
                if (!this.L) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = c1.a;
                view.offsetTopAndBottom(-i2);
                J(1);
            }
        } else if (i2 < 0) {
            boolean canScrollVertically = view2.canScrollVertically(-1);
            if (!this.S && !z && view2 == view3 && canScrollVertically) {
                this.N = true;
                return;
            }
            if (!canScrollVertically) {
                int i5 = this.H;
                if (i4 > i5 && !this.J) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = c1.a;
                    view.offsetTopAndBottom(-i6);
                    J(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = c1.a;
                    view.offsetTopAndBottom(-i2);
                    J(1);
                }
            }
        }
        z(view.getTop());
        this.R = i2;
        this.S = true;
        this.N = false;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view, Parcelable parcelable) {
        d31.e eVar = (d31.e) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = eVar.u;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = eVar.v;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = eVar.w;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = eVar.x;
            }
        }
        int i2 = eVar.t;
        if (i2 == 1 || i2 == 2) {
            this.O = 4;
        } else {
            this.O = i2;
        }
    }

    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d31.e(this);
    }

    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.R = 0;
        this.S = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.F) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == C()) {
            J(3);
            return;
        }
        WeakReference weakReference = this.Y;
        if (weakReference != null && view2 == weakReference.get() && this.S) {
            if (this.R > 0) {
                if (!this.b) {
                }
                L(view, i2, false);
                this.S = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.a0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.d);
                    yVelocity = this.a0.getYVelocity(this.c0);
                }
                if (K(view, yVelocity)) {
                    i2 = 5;
                    L(view, i2, false);
                    this.S = false;
                }
            }
            if (this.R == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.F;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            L(view, i2, false);
            this.S = false;
        }
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.O;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.P;
        if (dVar != null && (this.L || i == 1)) {
            dVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            F();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (this.P != null && ((this.L || this.O == 1) && actionMasked == 2 && !this.Q)) {
            float abs = Math.abs(this.d0 - motionEvent.getY());
            d dVar2 = this.P;
            if (abs > dVar2.b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Q;
    }

    public final void w() {
        int y = y();
        if (this.b) {
            this.H = Math.max(this.W - y, this.E);
        } else {
            this.H = this.W - y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        RoundedCorner roundedCorner;
        float f2 = 0.0f;
        if (this.j != null && (weakReference = this.X) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.X.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float k = this.j.k();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner2 != null) {
                    float radius = roundedCorner2.getRadius();
                    if (radius > 0.0f && k > 0.0f) {
                        f = radius / k;
                        j jVar = this.j;
                        float[] fArr = jVar.T;
                        float a = fArr == null ? fArr[0] : jVar.s.a.f.a(jVar.h());
                        roundedCorner = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner != null) {
                            float radius2 = roundedCorner.getRadius();
                            if (radius2 > 0.0f && a > 0.0f) {
                                f2 = radius2 / a;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                j jVar2 = this.j;
                float[] fArr2 = jVar2.T;
                if (fArr2 == null) {
                }
                roundedCorner = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i;
        return this.g ? Math.min(Math.max(this.h, this.W - ((this.V * 9) / 16)), this.U) + this.w : (this.o || this.p || (i = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i + this.i);
    }

    public final void z(int i) {
        View view = (View) this.X.get();
        if (view != null) {
            ArrayList arrayList = this.Z;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.H;
            if (i <= i2 && i2 != C()) {
                C();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((d31.d) arrayList.get(i3)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new f(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.T = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new c(this, i2);
        this.i = context.getResources().getDimensionPixelSize(2131166185);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.d);
        if (obtainStyledAttributes.hasValue(3)) {
            this.k = i4.W(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.z = n.c(context, attributeSet, 2130968715, 2132018225).a();
        }
        n nVar = this.z;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.j = jVar;
            jVar.m(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new d31.b(i2, this));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            H(i);
        } else {
            H(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        G(obtainStyledAttributes.getBoolean(9, false));
        this.o = obtainStyledAttributes.getBoolean(14, false);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        if (this.b != z) {
            this.b = z;
            if (this.X != null) {
                w();
            }
            J((this.b && this.O == 6) ? 3 : this.O);
            N(this.O, true);
            M();
        }
        this.K = obtainStyledAttributes.getBoolean(13, false);
        this.L = obtainStyledAttributes.getBoolean(4, true);
        this.M = obtainStyledAttributes.getBoolean(5, true);
        this.a = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.G = f;
            if (this.X != null) {
                this.F = (int) ((1.0f - f) * this.W);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.D = i3;
                    N(this.O, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.D = dimensionPixelOffset;
                    N(this.O, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.e = obtainStyledAttributes.getInt(12, 500);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.q = obtainStyledAttributes.getBoolean(19, false);
            this.r = obtainStyledAttributes.getBoolean(20, false);
            this.s = obtainStyledAttributes.getBoolean(21, true);
            this.t = obtainStyledAttributes.getBoolean(15, false);
            this.u = obtainStyledAttributes.getBoolean(16, false);
            this.v = obtainStyledAttributes.getBoolean(17, false);
            this.y = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }




}
