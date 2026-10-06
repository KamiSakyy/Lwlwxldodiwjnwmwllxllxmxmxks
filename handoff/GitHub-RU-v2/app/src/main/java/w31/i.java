package w31;

import a5.c1;
import a5.t0;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;
import o31.o;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public int a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public ViewGroup g;
    public Context h;
    public h i;
    public j j;
    public int k;
    public boolean l;
    public g m;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public AccessibilityManager v;
    public static final p6.a x = y21.a.b;
    public static final LinearInterpolator y = y21.a.a;
    public static final p6.a z = y21.a.d;
    public static final int[] B = {2130969773};
    public static final Handler A = new Handler(Looper.getMainLooper(), new c());
    public final d n = new d(this, 0);
    public final f w = new f(this);

    public i(Context context, ViewGroup viewGroup, View view, j jVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = jVar;
        this.h = context;
        o.c(context, o.a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        h hVar = (h) from.inflate(resourceId != -1 ? 2131559326 : 2131558762, viewGroup, false);
        this.i = hVar;
        hVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = hVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.s.setTextColor(a.a.q(a.a.n(snackbarContentLayout, 2130968896), actionTextColorAlpha, snackbarContentLayout.s.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(hVar.getMaxInlineActionWidth());
        }
        hVar.addView(view);
        hVar.setAccessibilityLiveRegion(1);
        hVar.setImportantForAccessibility(1);
        hVar.setFitsSystemWindows(true);
        e eVar = new e(this);
        WeakHashMap weakHashMap = c1.a;
        t0.m(hVar, eVar);
        c1.p(hVar, new androidx.viewpager.widget.f(7, this));
        this.v = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = k41.b.J(2130969534, 250, context);
        this.a = k41.b.J(2130969534, 150, context);
        this.b = k41.b.J(2130969537, 75, context);
        this.d = k41.b.K(context, 2130969550, y);
        this.f = k41.b.K(context, 2130969550, z);
        this.e = k41.b.K(context, 2130969550, x);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        r D = r.D();
        f fVar = this.w;
        synchronized (D.s) {
            try {
                if (D.H(fVar)) {
                    D.n((m) D.u, i);
                } else {
                    m mVar = (m) D.v;
                    if ((mVar == null || fVar == null || mVar.a.get() != fVar) ? false : true) {
                        D.n((m) D.v, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View c() {
        g gVar = this.m;
        if (gVar == null) {
            return null;
        }
        return (View) gVar.s.get();
    }

    public int d() {
        return this.k;
    }

    public final void e() {
        WindowInsets rootWindowInsets;
        int i;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        this.s = i;
        j();
    }

    public final void f() {
        r D = r.D();
        f fVar = this.w;
        synchronized (D.s) {
            try {
                if (D.H(fVar)) {
                    D.u = null;
                    if (((m) D.v) != null) {
                        D.R();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void g() {
        r D = r.D();
        f fVar = this.w;
        synchronized (D.s) {
            try {
                if (D.H(fVar)) {
                    D.O((m) D.u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        r D = r.D();
        int d = d();
        f fVar = this.w;
        synchronized (D.s) {
            try {
                if (D.H(fVar)) {
                    m mVar = (m) D.u;
                    mVar.b = d;
                    ((Handler) D.t).removeCallbacksAndMessages(mVar);
                    D.O((m) D.u);
                    return;
                }
                m mVar2 = (m) D.v;
                if ((mVar2 == null || fVar == null || mVar2.a.get() != fVar) ? false : true) {
                    ((m) D.v).b = d;
                } else {
                    D.v = new m(d, fVar);
                }
                m mVar3 = (m) D.u;
                if (mVar3 == null || !D.n(mVar3, 4)) {
                    D.u = null;
                    D.R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        h hVar = this.i;
        AccessibilityManager accessibilityManager = this.v;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            hVar.post(new d(this, 2));
            return;
        }
        if (hVar.getParent() != null) {
            hVar.setVisibility(0);
        }
        g();
    }

    public final void j() {
        h hVar = this.i;
        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || hVar.A == null || hVar.getParent() == null) {
            return;
        }
        int i = c() != null ? this.r : this.o;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = hVar.A;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.p;
        int i4 = rect.right + this.q;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            hVar.requestLayout();
        }
        if ((z2 || this.t != this.s) && Build.VERSION.SDK_INT >= 29 && this.s > 0 && !this.l) {
            l4.e layoutParams2 = hVar.getLayoutParams();
            if ((layoutParams2 instanceof l4.e) && (layoutParams2.a instanceof SwipeDismissBehavior)) {
                d dVar = this.n;
                hVar.removeCallbacks(dVar);
                hVar.post(dVar);
            }
        }
    }
}
