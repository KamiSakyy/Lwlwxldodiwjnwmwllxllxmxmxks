package y31;

import a5.j1;
import a5.k1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends m {
    public int e;
    public int f;
    public TimeInterpolator g;
    public AutoCompleteTextView h;
    public a i;
    public com.github.rudroid.createissue.propertybar.projects.b j;
    public h k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [y31.h] */
    public i(l lVar) {
        super(lVar);
        this.i = new a(this, 1);
        this.j = new com.github.rudroid.createissue.propertybar.projects.b(2, this);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: y31.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                i iVar = i.this;
                AutoCompleteTextView autoCompleteTextView = iVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                iVar.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = k41.b.J(2130969543, 67, lVar.getContext());
        this.e = k41.b.J(2130969543, 50, lVar.getContext());
        this.g = k41.b.K(lVar.getContext(), 2130969552, y21.a.a);
    }

    @Override // y31.m
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new y1.a(2, this));
    }

    @Override // y31.m
    public final int c() {
        return 2131952550;
    }

    @Override // y31.m
    public final int d() {
        return 2131231578;
    }

    @Override // y31.m
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // y31.m
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // y31.m
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // y31.m
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // y31.m
    public final boolean k() {
        return this.n;
    }

    @Override // y31.m
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new wc.b(2, this));
        this.h.setOnDismissListener(new com.github.rudroid.views.c(1, this));
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // y31.m
    public final void m(b5.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.a;
        if (this.h.getInputType() == 0) {
            fVar.j(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // y31.m
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // y31.m
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new j1(2, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new j1(2, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new k1(9, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // y31.m
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h {
        public h() {
        }
    }
}
