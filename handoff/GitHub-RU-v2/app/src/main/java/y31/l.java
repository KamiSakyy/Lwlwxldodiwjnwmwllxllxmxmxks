package y31;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.h1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends LinearLayout {
    public final LinkedHashSet A;
    public ColorStateList B;
    public PorterDuff.Mode C;
    public int D;
    public ImageView.ScaleType E;
    public View.OnLongClickListener F;
    public CharSequence G;
    public final AppCompatTextView H;
    public boolean I;
    public EditText J;
    public final AccessibilityManager K;
    public AccessibilityManager.TouchExplorationStateChangeListener L;
    public final j M;
    public final TextInputLayout r;
    public final FrameLayout s;
    public final CheckableImageButton t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public View.OnLongClickListener w;
    public final CheckableImageButton x;
    public final i3.e y;
    public int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, android.widget.ImageView, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, android.widget.ImageView, com.google.android.material.internal.CheckableImageButton] */
    public l(TextInputLayout textInputLayout, l51.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.z = 0;
        this.A = new LinkedHashSet();
        this.M = new j(this);
        k kVar = new k(this);
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.r = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.s = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        Object a = a(this, from, 2131363420);
        this.t = a;
        Object a2 = a(frameLayout, from, 2131363419);
        this.x = a2;
        this.y = new i3.e(this, hVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.H = appCompatTextView;
        TypedArray typedArray = (TypedArray) hVar.t;
        if (typedArray.hasValue(38)) {
            this.u = i4.X(getContext(), hVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.v = o31.o.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(hVar.s(37));
        }
        a.setContentDescription(getResources().getText(2131952516));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.B = i4.X(getContext(), hVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.C = o31.o.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a2.getContentDescription() != (text = typedArray.getText(27))) {
                a2.setContentDescription(text);
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.B = i4.X(getContext(), hVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.C = o31.o.g(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (a2.getContentDescription() != text2) {
                a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131166185));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.D) {
            this.D = dimensionPixelSize;
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
            a.setMinimumWidth(dimensionPixelSize);
            a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType h = sy.n.h(typedArray.getInt(31, -1));
            this.E = h;
            a2.setScaleType(h);
            a.setScaleType(h);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131363430);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(hVar.q(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.G = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a);
        textInputLayout.w0.add(kVar);
        if (textInputLayout.v != null) {
            kVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new h1(8, this));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) ((CheckableImageButton) layoutInflater.inflate(2131558773, viewGroup, false));
        r3.setId(i);
        if (i4.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) r3.getLayoutParams()).setMarginStart(0);
        }
        return r3;
    }

    public final m b() {
        m eVar;
        int i = this.z;
        i3.e eVar2 = this.y;
        SparseArray sparseArray = (SparseArray) eVar2.d;
        m mVar = (m) sparseArray.get(i);
        if (mVar != null) {
            return mVar;
        }
        l lVar = (l) eVar2.e;
        if (i == -1) {
            eVar = new e(lVar, 0);
        } else if (i == 0) {
            eVar = new e(lVar, 1);
        } else if (i == 1) {
            eVar = new s(lVar, eVar2.c);
        } else if (i == 2) {
            eVar = new d(lVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(no.a.k("Invalid end icon mode: ", i));
            }
            eVar = new i(lVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            q.u uVar = this.x;
            marginStart = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).getMarginStart() + uVar.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.H.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.s.getVisibility() == 0 && this.x.getVisibility() == 0;
    }

    public final boolean e() {
        return this.t.getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        m b = b();
        boolean j = b.j();
        CheckableImageButton r2 = this.x;
        boolean z4 = true;
        if (!j || (z3 = r2.u) == b.k()) {
            z2 = false;
        } else {
            r2.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof i) || (isActivated = r2.isActivated()) == ((i) b).l) {
            z4 = z2;
        } else {
            r2.setActivated(!isActivated);
        }
        if (z || z4) {
            sy.n.y(this.r, (CheckableImageButton) r2, this.B);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton, q.u] */
    public final void g(int i) {
        if (this.z == i) {
            return;
        }
        m b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.L;
        AccessibilityManager accessibilityManager = this.K;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.L = null;
        b.r();
        this.z = i;
        Iterator it = this.A.iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
        h(i != 0);
        m b2 = b();
        int i2 = this.y.b;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable o = i2 != 0 ? w8.s.o(getContext(), i2) : null;
        CheckableImageButton r5 = this.x;
        r5.setImageDrawable(o);
        TextInputLayout textInputLayout = this.r;
        if (o != null) {
            sy.n.c(textInputLayout, (CheckableImageButton) r5, this.B, this.C);
            sy.n.y(textInputLayout, (CheckableImageButton) r5, this.B);
        }
        int c = b2.c();
        CharSequence text = c != 0 ? getResources().getText(c) : null;
        if (r5.getContentDescription() != text) {
            r5.setContentDescription(text);
        }
        r5.setCheckable(b2.j());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
        this.L = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.L);
        }
        View.OnClickListener f = b2.f();
        View.OnLongClickListener onLongClickListener = this.F;
        r5.setOnClickListener(f);
        sy.n.A((CheckableImageButton) r5, onLongClickListener);
        EditText editText = this.J;
        if (editText != null) {
            b2.l(editText);
            j(b2);
        }
        sy.n.c(textInputLayout, (CheckableImageButton) r5, this.B, this.C);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.x.setVisibility(z ? 0 : 8);
            k();
            m();
            this.r.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.t;
        checkableImageButton.setImageDrawable(drawable);
        l();
        sy.n.c(this.r, checkableImageButton, this.u, this.v);
    }

    public final void j(m mVar) {
        if (this.J == null) {
            return;
        }
        if (mVar.e() != null) {
            this.J.setOnFocusChangeListener(mVar.e());
        }
        if (mVar.g() != null) {
            this.x.setOnFocusChangeListener(mVar.g());
        }
    }

    public final void k() {
        this.s.setVisibility((this.x.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.G == null || this.I) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        q.u uVar = this.t;
        Drawable drawable = uVar.getDrawable();
        TextInputLayout textInputLayout = this.r;
        uVar.setVisibility((drawable != null && textInputLayout.B.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.z != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.r;
        if (textInputLayout.v == null) {
            return;
        }
        this.H.setPaddingRelative(getContext().getResources().getDimensionPixelSize(2131166053), textInputLayout.v.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.v.getPaddingEnd(), textInputLayout.v.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.H;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.G == null || this.I) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.r.s();
    }
}
