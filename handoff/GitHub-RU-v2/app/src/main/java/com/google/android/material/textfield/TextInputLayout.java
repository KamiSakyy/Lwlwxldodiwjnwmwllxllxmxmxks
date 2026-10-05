package com.google.android.material.textfield;

import a0.s0;
import a41.a;
import a5.c1;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import d8.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import m11.r;
import o31.d;
import o31.e;
import o31.o;
import o4.b;
import q.i1;
import u31.f;
import u31.j;
import u31.m;
import u31.n;
import w51.a0;
import w8.s;
import y31.g;
import y31.i;
import y31.k;
import y31.l;
import y31.p;
import y31.t;
import y31.u;
import y31.v;
import y31.w;
import y31.x;

/* loaded from: /home/user/work/p/classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] U0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public ColorStateList A0;
    public final p B;
    public ColorStateList B0;
    public boolean C;
    public int C0;
    public int D;
    public int D0;
    public boolean E;
    public int E0;
    public w F;
    public ColorStateList F0;
    public AppCompatTextView G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public CharSequence J;
    public int J0;
    public boolean K;
    public int K0;
    public AppCompatTextView L;
    public int L0;
    public ColorStateList M;
    public boolean M0;
    public int N;
    public final d N0;
    public h O;
    public boolean O0;
    public h P;
    public boolean P0;
    public ColorStateList Q;
    public ValueAnimator Q0;
    public ColorStateList R;
    public boolean R0;
    public ColorStateList S;
    public boolean S0;
    public ColorStateList T;
    public boolean T0;
    public boolean U;
    public CharSequence V;
    public boolean W;
    public j a0;
    public j b0;
    public StateListDrawable c0;
    public boolean d0;
    public j e0;
    public j f0;
    public n g0;
    public boolean h0;
    public final int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public final Rect q0;
    public final FrameLayout r;
    public final Rect r0;
    public final t s;
    public final RectF s0;
    public final l t;
    public Typeface t0;
    public final int u;
    public ColorDrawable u0;
    public EditText v;
    public int v0;
    public CharSequence w;
    public final LinkedHashSet w0;
    public int x;
    public ColorDrawable x0;
    public int y;
    public int y0;
    public int z;
    public Drawable z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969959, 2132018233), attributeSet, 2130969959);
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = new p(this);
        this.F = new r(24);
        this.q0 = new Rect();
        this.r0 = new Rect();
        this.s0 = new RectF();
        this.w0 = new LinkedHashSet();
        d dVar = new d(this);
        this.N0 = dVar;
        this.T0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = y21.a.a;
        dVar.X = linearInterpolator;
        dVar.l(false);
        dVar.W = linearInterpolator;
        dVar.l(false);
        dVar.s(8388659);
        o.a(context2, attributeSet, 2130969959, 2132018233);
        int[] iArr = x21.a.O;
        o.b(context2, attributeSet, iArr, 2130969959, 2132018233, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969959, 2132018233);
        l51.h hVar = new l51.h(context2, obtainStyledAttributes);
        t tVar = new t(this, hVar);
        this.s = tVar;
        this.U = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.P0 = obtainStyledAttributes.getBoolean(47, true);
        this.O0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.g0 = n.c(context2, attributeSet, 2130969959, 2132018233).a();
        this.i0 = context2.getResources().getDimensionPixelOffset(2131166245);
        this.k0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.u = getResources().getDimensionPixelSize(2131165882);
        this.m0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(2131166246));
        this.n0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(2131166247));
        this.l0 = this.m0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        m g = this.g0.g();
        if (dimension >= 0.0f) {
            g.e = new u31.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            g.f = new u31.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            g.g = new u31.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            g.h = new u31.a(dimension4);
        }
        this.g0 = g.a();
        ColorStateList X = i4.X(context2, hVar, 7);
        if (X != null) {
            int defaultColor = X.getDefaultColor();
            this.G0 = defaultColor;
            this.p0 = defaultColor;
            if (X.isStateful()) {
                this.H0 = X.getColorForState(new int[]{-16842910}, -1);
                this.I0 = X.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.J0 = X.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.I0 = this.G0;
                ColorStateList c = b.c(context2, 2131100853);
                this.H0 = c.getColorForState(new int[]{-16842910}, -1);
                this.J0 = c.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.p0 = 0;
            this.G0 = 0;
            this.H0 = 0;
            this.I0 = 0;
            this.J0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList q = hVar.q(1);
            this.B0 = q;
            this.A0 = q;
        }
        ColorStateList X2 = i4.X(context2, hVar, 14);
        this.E0 = obtainStyledAttributes.getColor(14, 0);
        this.C0 = context2.getColor(2131100880);
        this.K0 = context2.getColor(2131100881);
        this.D0 = context2.getColor(2131100884);
        if (X2 != null) {
            setBoxStrokeColorStateList(X2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(i4.X(context2, hVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.S = hVar.q(24);
        this.T = hVar.q(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z3 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.I = obtainStyledAttributes.getResourceId(22, 0);
        this.H = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.H);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.I);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(hVar.q(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(hVar.q(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(hVar.q(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(hVar.q(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(hVar.q(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(hVar.q(59));
        }
        l lVar = new l(this, hVar);
        this.t = lVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        hVar.G();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(tVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.v;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.a0;
        }
        int n = a.a.n(this.v, 2130968854);
        int i = this.j0;
        int[][] iArr = U0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.a0;
            int i2 = this.p0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{a.a.q(n, 0.1f, i2), i2}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.a0;
        TypedValue e0 = b4.e0(2130968896, context, "TextInputLayout");
        int i3 = e0.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : e0.data;
        j jVar3 = new j(jVar2.s.a);
        int q = a.a.q(n, 0.1f, color);
        jVar3.q(new ColorStateList(iArr, new int[]{q, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{q, color});
        j jVar4 = new j(jVar2.s.a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.c0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.c0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.c0.addState(new int[0], h(false));
        }
        return this.c0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.b0 == null) {
            this.b0 = h(true);
        }
        return this.b0;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.v != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.v = editText;
        int i = this.x;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.z);
        }
        int i2 = this.y;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.A);
        }
        this.d0 = false;
        k();
        setTextInputAccessibilityDelegate(new v(this));
        Typeface typeface = this.v.getTypeface();
        d dVar = this.N0;
        boolean t = dVar.t(typeface);
        boolean z = dVar.z(typeface);
        if (t || z) {
            dVar.l(false);
        }
        dVar.y(this.v.getTextSize());
        float letterSpacing = this.v.getLetterSpacing();
        if (dVar.h0 != letterSpacing) {
            dVar.h0 = letterSpacing;
            dVar.l(false);
        }
        int gravity = this.v.getGravity();
        dVar.s((gravity & (-113)) | 48);
        dVar.x(gravity);
        this.L0 = editText.getMinimumHeight();
        this.v.addTextChangedListener(new u(this, editText));
        if (this.A0 == null) {
            this.A0 = this.v.getHintTextColors();
        }
        if (this.U) {
            if (TextUtils.isEmpty(this.V)) {
                CharSequence hint = this.v.getHint();
                this.w = hint;
                setHint(hint);
                this.v.setHint((CharSequence) null);
            }
            this.W = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.G != null) {
            p(this.v.getText());
        }
        t();
        this.B.b();
        this.s.bringToFront();
        l lVar = this.t;
        lVar.bringToFront();
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this);
        }
        lVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.V)) {
            return;
        }
        this.V = charSequence;
        this.N0.B(charSequence);
        if (this.M0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.K == z) {
            return;
        }
        if (z) {
            View view = this.L;
            if (view != null) {
                this.r.addView(view);
                this.L.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView = this.L;
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.L = null;
        }
        this.K = z;
    }

    public final void a() {
        if (this.v == null || this.j0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.v;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.N0.g() + this.u), this.v.getPaddingEnd(), getResources().getDimensionPixelSize(2131166044));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.v;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(2131166047), this.v.getPaddingEnd(), getResources().getDimensionPixelSize(2131166046));
        } else if (i4.d0(getContext())) {
            EditText editText3 = this.v;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(2131166045), this.v.getPaddingEnd(), getResources().getDimensionPixelSize(2131166044));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.r;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        d dVar = this.N0;
        if (dVar.b == f) {
            return;
        }
        if (this.Q0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Q0 = valueAnimator;
            valueAnimator.setInterpolator(k41.b.K(getContext(), 2130969550, y21.a.b));
            this.Q0.setDuration(k41.b.J(2130969540, 167, getContext()));
            this.Q0.addUpdateListener(new d31.b(4, this));
        }
        this.Q0.setFloatValues(dVar.b, f);
        this.Q0.start();
    }

    public final void c() {
        int i;
        int i2;
        j jVar = this.a0;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.s.a;
        n nVar2 = this.g0;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.j0 == 2 && (i = this.l0) > -1 && (i2 = this.o0) != 0) {
            j jVar2 = this.a0;
            jVar2.s.k = i;
            jVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            u31.h hVar = jVar2.s;
            if (hVar.e != valueOf) {
                hVar.e = valueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int i3 = this.p0;
        if (this.j0 == 1) {
            i3 = r4.a.d(this.p0, a.a.m(2130968896, 0, getContext()));
        }
        this.p0 = i3;
        this.a0.q(ColorStateList.valueOf(i3));
        j jVar3 = this.e0;
        if (jVar3 != null && this.f0 != null) {
            if (this.l0 > -1 && this.o0 != 0) {
                jVar3.q(this.v.isFocused() ? ColorStateList.valueOf(this.C0) : ColorStateList.valueOf(this.o0));
                this.f0.q(ColorStateList.valueOf(this.o0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.v == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.r0;
        rect2.bottom = i;
        int i2 = this.j0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.k0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.v.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.v.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.v;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.W;
            this.W = false;
            CharSequence hint = editText.getHint();
            this.v.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.v.setHint(hint);
                this.W = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.r;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.v) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.S0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.S0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        super.draw(canvas);
        boolean z = this.U;
        d dVar = this.N0;
        if (z) {
            dVar.f(canvas);
        }
        if (this.f0 == null || (jVar = this.e0) == null) {
            return;
        }
        jVar.draw(canvas);
        if (this.v.isFocused()) {
            Rect bounds = this.f0.getBounds();
            Rect bounds2 = this.e0.getBounds();
            float f = dVar.b;
            int centerX = bounds2.centerX();
            bounds.left = y21.a.c(centerX, f, bounds2.left);
            bounds.right = y21.a.c(centerX, f, bounds2.right);
            this.f0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.R0) {
            return;
        }
        this.R0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.N0;
        if (dVar != null) {
            dVar.S = drawableState;
            ColorStateList colorStateList2 = dVar.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.o) != null && colorStateList.isStateful())) {
                dVar.l(false);
                z = true;
                if (this.v != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.R0 = false;
            }
        }
        z = false;
        if (this.v != null) {
        }
        t();
        z();
        if (z) {
        }
        this.R0 = false;
    }

    public final int e() {
        if (this.U) {
            int i = this.j0;
            d dVar = this.N0;
            if (i == 0) {
                return (int) dVar.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (dVar.g() / 2.0f);
                }
                float g = dVar.g();
                TextPaint textPaint = dVar.V;
                textPaint.setTextSize(dVar.n);
                textPaint.setTypeface(dVar.x);
                textPaint.setLetterSpacing(dVar.g0);
                return Math.max(0, (int) (g - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        ((d8.o) hVar).t = k41.b.J(2130969542, 87, getContext());
        ((d8.o) hVar).u = k41.b.K(getContext(), 2130969552, y21.a.a);
        return hVar;
    }

    public final boolean g() {
        return this.U && !TextUtils.isEmpty(this.V) && (this.a0 instanceof g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.v;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i = this.j0;
        if (i == 1 || i == 2) {
            return this.a0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.p0;
    }

    public int getBoxBackgroundMode() {
        return this.j0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.k0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.s0;
        return layoutDirection == 1 ? this.g0.h.a(rectF) : this.g0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.s0;
        return layoutDirection == 1 ? this.g0.g.a(rectF) : this.g0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.s0;
        return layoutDirection == 1 ? this.g0.e.a(rectF) : this.g0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.s0;
        return layoutDirection == 1 ? this.g0.f.a(rectF) : this.g0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.F0;
    }

    public int getBoxStrokeWidth() {
        return this.m0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.n0;
    }

    public int getCounterMaxLength() {
        return this.D;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.C && this.E && (appCompatTextView = this.G) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.R;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q;
    }

    public ColorStateList getCursorColor() {
        return this.S;
    }

    public ColorStateList getCursorErrorColor() {
        return this.T;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0;
    }

    public EditText getEditText() {
        return this.v;
    }

    public CharSequence getEndIconContentDescription() {
        return this.t.x.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.t.x.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.t.D;
    }

    public int getEndIconMode() {
        return this.t.z;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.t.E;
    }

    public CheckableImageButton getEndIconView() {
        return this.t.x;
    }

    public CharSequence getError() {
        p pVar = this.B;
        if (pVar.q) {
            return pVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.B.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.B.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.B.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.t.t.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.B;
        if (pVar.x) {
            return pVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.B.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.U) {
            return this.V;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.N0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.N0;
        return dVar.h(dVar.p);
    }

    public int getHintMaxLines() {
        return this.N0.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.B0;
    }

    public w getLengthCounter() {
        return this.F;
    }

    public int getMaxEms() {
        return this.y;
    }

    public int getMaxWidth() {
        return this.A;
    }

    public int getMinEms() {
        return this.x;
    }

    public int getMinWidth() {
        return this.z;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.t.x.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.t.x.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.K) {
            return this.J;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.N;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.M;
    }

    public CharSequence getPrefixText() {
        return this.s.t;
    }

    public ColorStateList getPrefixTextColor() {
        return this.s.s.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.s.s;
    }

    public n getShapeAppearanceModel() {
        return this.g0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.s.u.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.s.u.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.s.x;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.s.y;
    }

    public CharSequence getSuffixText() {
        return this.t.G;
    }

    public ColorStateList getSuffixTextColor() {
        return this.t.H.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.t.H;
    }

    public Typeface getTypeface() {
        return this.t0;
    }

    public final j h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166219);
        float f = z ? dimensionPixelOffset : 0.0f;
        Object obj = this.v;
        float popupElevation = obj instanceof y31.r ? ((y31.r) obj).getPopupElevation() : getResources().getDimensionPixelOffset(2131165700);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166156);
        u31.l lVar = new u31.l();
        u31.l lVar2 = new u31.l();
        u31.l lVar3 = new u31.l();
        u31.l lVar4 = new u31.l();
        int i = 0;
        f fVar = new f(i);
        f fVar2 = new f(i);
        f fVar3 = new f(i);
        f fVar4 = new f(i);
        u31.a aVar = new u31.a(f);
        u31.a aVar2 = new u31.a(f);
        u31.a aVar3 = new u31.a(dimensionPixelOffset);
        u31.a aVar4 = new u31.a(dimensionPixelOffset);
        n nVar = new n();
        nVar.a = lVar;
        nVar.b = lVar2;
        nVar.c = lVar3;
        nVar.d = lVar4;
        nVar.e = aVar;
        nVar.f = aVar2;
        nVar.g = aVar4;
        nVar.h = aVar3;
        nVar.i = fVar;
        nVar.j = fVar2;
        nVar.k = fVar3;
        nVar.l = fVar4;
        Object obj2 = this.v;
        ColorStateList dropDownBackgroundTintList = obj2 instanceof y31.r ? ((y31.r) obj2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.W;
            TypedValue e0 = b4.e0(2130968896, context, j.class.getSimpleName());
            int i2 = e0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : e0.data);
        }
        j jVar = new j();
        jVar.m(context);
        jVar.q(dropDownBackgroundTintList);
        jVar.p(popupElevation);
        jVar.setShapeAppearanceModel(nVar);
        u31.h hVar = jVar.s;
        if (hVar.h == null) {
            hVar.h = new Rect();
        }
        jVar.s.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.v.getCompoundPaddingLeft() : this.t.c() : this.s.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.v.getCompoundPaddingRight() : this.s.a() : this.t.c());
    }

    public final void k() {
        int i = this.j0;
        if (i == 0) {
            this.a0 = null;
            this.e0 = null;
            this.f0 = null;
        } else if (i == 1) {
            this.a0 = new j(this.g0);
            this.e0 = new j();
            this.f0 = new j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(s0.l(new StringBuilder(), this.j0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.U || (this.a0 instanceof g)) {
                this.a0 = new j(this.g0);
            } else {
                n nVar = this.g0;
                int i2 = g.Z;
                if (nVar == null) {
                    nVar = new n();
                }
                y31.f fVar = new y31.f(nVar, new RectF());
                g gVar = new g(fVar);
                gVar.Y = fVar;
                this.a0 = gVar;
            }
            this.e0 = null;
            this.f0 = null;
        }
        u();
        z();
        if (this.j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.k0 = getResources().getDimensionPixelSize(2131166049);
            } else if (i4.d0(getContext())) {
                this.k0 = getResources().getDimensionPixelSize(2131166048);
            }
        }
        a();
        if (this.j0 != 0) {
            v();
        }
        EditText editText = this.v;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.j0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.v.getWidth();
            int gravity = this.v.getGravity();
            d dVar = this.N0;
            boolean c = dVar.c(dVar.H);
            dVar.J = c;
            Rect rect = dVar.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = dVar.k0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = dVar.k0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.s0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (dVar.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.J) {
                        f5 = dVar.k0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (dVar.J) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = dVar.k0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = dVar.g() + rect.top;
                if (dVar.j0 != null && !dVar.C()) {
                    StaticLayout staticLayout = dVar.j0;
                    float lineWidth = (dVar.n / dVar.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (dVar.J) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.i0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.l0);
                rectF.top = 0.0f;
                g gVar = (g) this.a0;
                gVar.getClass();
                gVar.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = dVar.k0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.s0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (dVar.k0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = dVar.g() + rect.top;
            if (dVar.j0 != null) {
                StaticLayout staticLayout2 = dVar.j0;
                float lineWidth2 = (dVar.n / dVar.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (dVar.J) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132017757);
        appCompatTextView.setTextColor(getContext().getColor(2131099833));
    }

    public final boolean o() {
        p pVar = this.B;
        return (pVar.o != 1 || pVar.r == null || TextUtils.isEmpty(pVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.N0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        l lVar = this.t;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.T0 = false;
        if (this.v != null && this.v.getMeasuredHeight() < (max = Math.max(lVar.getMeasuredHeight(), this.s.getMeasuredHeight()))) {
            this.v.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.v.post(new y1.a(3, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float i5;
        int i6;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.v;
        if (editText != null) {
            Rect rect = this.q0;
            e.a(this, editText, rect);
            j jVar = this.e0;
            if (jVar != null) {
                int i7 = rect.bottom;
                jVar.setBounds(rect.left, i7 - this.m0, rect.right, i7);
            }
            j jVar2 = this.f0;
            if (jVar2 != null) {
                int i8 = rect.bottom;
                jVar2.setBounds(rect.left, i8 - this.n0, rect.right, i8);
            }
            if (this.U) {
                float textSize = this.v.getTextSize();
                d dVar = this.N0;
                dVar.y(textSize);
                TextPaint textPaint = dVar.V;
                int gravity = this.v.getGravity();
                dVar.s((gravity & (-113)) | 48);
                dVar.x(gravity);
                Rect d = d(rect);
                dVar.o(d.left, d.top, d.right, d.bottom);
                if (this.v == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(dVar.m);
                    textPaint.setTypeface(dVar.A);
                    textPaint.setLetterSpacing(dVar.h0);
                    i5 = -textPaint.ascent();
                } else {
                    i5 = dVar.i() * dVar.q;
                }
                int compoundPaddingLeft = this.v.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.r0;
                rect2.left = compoundPaddingLeft;
                if (this.j0 != 1 || this.v.getMinLines() > 1) {
                    if (this.j0 != 0 || getHintMaxLines() == 1) {
                        i6 = 0;
                    } else {
                        textPaint.setTextSize(dVar.m);
                        textPaint.setTypeface(dVar.A);
                        textPaint.setLetterSpacing(dVar.h0);
                        i6 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.v.getCompoundPaddingTop() + rect.top) - i6;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (i5 / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.v.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.j0 != 1 || this.v.getMinLines() > 1) ? rect.bottom - this.v.getCompoundPaddingBottom() : (int) (rect2.top + i5);
                rect2.bottom = compoundPaddingBottom;
                dVar.u(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                dVar.l(false);
                if (!g() || this.M0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.T0;
        l lVar = this.t;
        if (!z) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.T0 = true;
        }
        if (this.L != null && (editText = this.v) != null) {
            this.L.setGravity(editText.getGravity());
            this.L.setPadding(this.v.getCompoundPaddingLeft(), this.v.getCompoundPaddingTop(), this.v.getCompoundPaddingRight(), this.v.getCompoundPaddingBottom());
        }
        lVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.v.getMeasuredWidth() - this.v.getCompoundPaddingLeft()) - this.v.getCompoundPaddingRight();
        d dVar = this.N0;
        TextPaint textPaint = dVar.V;
        textPaint.setTextSize(dVar.n);
        textPaint.setTypeface(dVar.x);
        textPaint.setLetterSpacing(dVar.g0);
        float f2 = measuredWidth;
        dVar.t0 = dVar.e(dVar.p0, textPaint, dVar.H, (dVar.n / dVar.m) * f2, dVar.J).getHeight();
        textPaint.setTextSize(dVar.m);
        textPaint.setTypeface(dVar.A);
        textPaint.setLetterSpacing(dVar.h0);
        dVar.u0 = dVar.e(dVar.o0, textPaint, dVar.H, f2, dVar.J).getHeight();
        EditText editText2 = this.v;
        Rect rect = this.q0;
        e.a(this, editText2, rect);
        Rect d = d(rect);
        dVar.o(d.left, d.top, d.right, d.bottom);
        v();
        a();
        if (this.v == null) {
            return;
        }
        int i3 = dVar.u0;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = dVar.V;
            textPaint2.setTextSize(dVar.m);
            textPaint2.setTypeface(dVar.A);
            textPaint2.setLetterSpacing(dVar.h0);
            f = -textPaint2.ascent();
        }
        float f3 = 0.0f;
        if (this.J != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.L.getPaint());
            textPaint3.setTextSize(this.L.getTextSize());
            textPaint3.setTypeface(this.L.getTypeface());
            textPaint3.setLetterSpacing(this.L.getLetterSpacing());
            try {
                o31.j jVar = new o31.j(this.J, textPaint3, measuredWidth);
                jVar.k = getLayoutDirection() == 1;
                jVar.j = true;
                float lineSpacingExtra = this.L.getLineSpacingExtra();
                float lineSpacingMultiplier = this.L.getLineSpacingMultiplier();
                jVar.g = lineSpacingExtra;
                jVar.h = lineSpacingMultiplier;
                jVar.m = new a0(4, this);
                f3 = jVar.a().getHeight() + (this.j0 == 1 ? dVar.g() + this.k0 + this.u : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                e.getCause().getMessage();
            }
        }
        float max = Math.max(f, f3);
        if (this.v.getMeasuredHeight() < max) {
            this.v.setMinimumHeight(Math.round(max));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(((i5.b) xVar).r);
        setError(xVar.t);
        if (xVar.u) {
            post(new t81.d(7, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.h0) {
            u31.d dVar = this.g0.e;
            RectF rectF = this.s0;
            float a = dVar.a(rectF);
            float a2 = this.g0.f.a(rectF);
            float a3 = this.g0.h.a(rectF);
            float a4 = this.g0.g.a(rectF);
            n nVar = this.g0;
            sy.u uVar = nVar.a;
            sy.u uVar2 = nVar.b;
            sy.u uVar3 = nVar.d;
            sy.u uVar4 = nVar.c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            u31.a aVar = new u31.a(a2);
            u31.a aVar2 = new u31.a(a);
            u31.a aVar3 = new u31.a(a4);
            u31.a aVar4 = new u31.a(a3);
            n nVar2 = new n();
            nVar2.a = uVar2;
            nVar2.b = uVar;
            nVar2.c = uVar3;
            nVar2.d = uVar4;
            nVar2.e = aVar;
            nVar2.f = aVar2;
            nVar2.g = aVar4;
            nVar2.h = aVar3;
            nVar2.i = fVar;
            nVar2.j = fVar2;
            nVar2.k = fVar3;
            nVar2.l = fVar4;
            this.h0 = z;
            setShapeAppearanceModel(nVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, i5.b, y31.x] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? xVar = new x(super.onSaveInstanceState());
        if (o()) {
            xVar.t = getError();
        }
        l lVar = this.t;
        xVar.u = lVar.z != 0 && lVar.x.u;
        return xVar;
    }

    public final void p(Editable editable) {
        ((r) this.F).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.E;
        int i = this.D;
        if (i == -1) {
            this.G.setText(String.valueOf(length));
            this.G.setContentDescription(null);
            this.E = false;
        } else {
            this.E = length > i;
            Context context = getContext();
            this.G.setContentDescription(context.getString(this.E ? 2131951873 : 2131951872, Integer.valueOf(length), Integer.valueOf(this.D)));
            if (z != this.E) {
                q();
            }
            String str = y4.b.b;
            y4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? y4.b.e : y4.b.d;
            AppCompatTextView appCompatTextView = this.G;
            String string = getContext().getString(2131951874, Integer.valueOf(length), Integer.valueOf(this.D));
            bVar.getClass();
            n4 n4Var = y4.f.a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.v == null || z == this.E) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.G;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.E ? this.H : this.I);
            if (!this.E && (colorStateList2 = this.Q) != null) {
                this.G.setTextColor(colorStateList2);
            }
            if (!this.E || (colorStateList = this.R) == null) {
                return;
            }
            this.G.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.S;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue c0 = b4.c0(context, 2130968853);
            if (c0 != null) {
                int i = c0.resourceId;
                if (i != 0) {
                    colorStateList2 = b.c(context, i);
                } else {
                    int i2 = c0.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.v;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.v.getTextCursorDrawable().mutate();
        if ((o() || (this.G != null && this.E)) && (colorStateList = this.T) != null) {
            colorStateList2 = colorStateList;
        }
        mutate.setTintList(colorStateList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z;
        l lVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.v == null) {
            return false;
        }
        q.u uVar = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            t tVar = this.s;
            if (tVar.getMeasuredWidth() > 0) {
                int measuredWidth = tVar.getMeasuredWidth() - this.v.getPaddingLeft();
                if (this.u0 == null || this.v0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.u0 = colorDrawable3;
                    this.v0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.v.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.u0;
                if (drawable2 != colorDrawable4) {
                    this.v.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    lVar = this.t;
                    if ((!lVar.e() || ((lVar.z != 0 && lVar.d()) || lVar.G != null)) && lVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = lVar.H.getMeasuredWidth() - this.v.getPaddingRight();
                        if (!lVar.e()) {
                            uVar = lVar.t;
                        } else if (lVar.z != 0 && lVar.d()) {
                            uVar = lVar.x;
                        }
                        if (uVar != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).getMarginStart() + uVar.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.v.getCompoundDrawablesRelative();
                        colorDrawable = this.x0;
                        if (colorDrawable == null && this.y0 != measuredWidth2) {
                            this.y0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.v.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.x0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.x0 = colorDrawable5;
                            this.y0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.x0;
                        if (drawable != colorDrawable2) {
                            this.z0 = drawable;
                            this.v.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.x0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.v.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.x0) {
                            this.v.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.z0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.x0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                lVar = this.t;
                if (lVar.e()) {
                }
                int measuredWidth22 = lVar.H.getMeasuredWidth() - this.v.getPaddingRight();
                if (!lVar.e()) {
                }
                if (uVar != null) {
                }
                compoundDrawablesRelative = this.v.getCompoundDrawablesRelative();
                colorDrawable = this.x0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.x0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.u0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.v.getCompoundDrawablesRelative();
            this.v.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.u0 = null;
            z = true;
            lVar = this.t;
            if (lVar.e()) {
            }
            int measuredWidth222 = lVar.H.getMeasuredWidth() - this.v.getPaddingRight();
            if (!lVar.e()) {
            }
            if (uVar != null) {
            }
            compoundDrawablesRelative = this.v.getCompoundDrawablesRelative();
            colorDrawable = this.x0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.x0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        lVar = this.t;
        if (lVar.e()) {
        }
        int measuredWidth2222 = lVar.H.getMeasuredWidth() - this.v.getPaddingRight();
        if (!lVar.e()) {
        }
        if (uVar != null) {
        }
        compoundDrawablesRelative = this.v.getCompoundDrawablesRelative();
        colorDrawable = this.x0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.x0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            this.G0 = i;
            this.I0 = i;
            this.J0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.G0 = defaultColor;
        this.p0 = defaultColor;
        this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.j0) {
            return;
        }
        this.j0 = i;
        if (this.v != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.k0 = i;
    }

    public void setBoxCornerFamily(int i) {
        m g = this.g0.g();
        u31.d dVar = this.g0.e;
        g.a = sy.w.q(i);
        g.e = dVar;
        u31.d dVar2 = this.g0.f;
        g.b = sy.w.q(i);
        g.f = dVar2;
        u31.d dVar3 = this.g0.h;
        g.d = sy.w.q(i);
        g.h = dVar3;
        u31.d dVar4 = this.g0.g;
        g.c = sy.w.q(i);
        g.g = dVar4;
        this.g0 = g.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.C0 = colorStateList.getDefaultColor();
            this.K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.E0 != colorStateList.getDefaultColor()) {
            this.E0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.m0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.n0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.C != z) {
            p pVar = this.B;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.G = appCompatTextView;
                appCompatTextView.setId(2131363425);
                Typeface typeface = this.t0;
                if (typeface != null) {
                    this.G.setTypeface(typeface);
                }
                this.G.setMaxLines(1);
                pVar.a(this.G, 2);
                ((ViewGroup.MarginLayoutParams) this.G.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131166248));
                q();
                if (this.G != null) {
                    EditText editText = this.v;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                pVar.g(this.G, 2);
                this.G = null;
            }
            this.C = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.D != i) {
            if (i > 0) {
                this.D = i;
            } else {
                this.D = -1;
            }
            if (!this.C || this.G == null) {
                return;
            }
            EditText editText = this.v;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.H != i) {
            this.H = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.I != i) {
            this.I = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (o() || (this.G != null && this.E)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = colorStateList;
        if (this.v != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.t.x.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.t.x.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        l lVar = this.t;
        CharSequence text = i != 0 ? lVar.getResources().getText(i) : null;
        q.u uVar = lVar.x;
        if (uVar.getContentDescription() != text) {
            uVar.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        l lVar = this.t;
        Drawable o = i != 0 ? s.o(lVar.getContext(), i) : null;
        TextInputLayout textInputLayout = lVar.r;
        CheckableImageButton checkableImageButton = lVar.x;
        checkableImageButton.setImageDrawable(o);
        if (o != null) {
            sy.n.c(textInputLayout, checkableImageButton, lVar.B, lVar.C);
            sy.n.y(textInputLayout, checkableImageButton, lVar.B);
        }
    }

    public void setEndIconMinSize(int i) {
        l lVar = this.t;
        if (i < 0) {
            lVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != lVar.D) {
            lVar.D = i;
            q.u uVar = lVar.x;
            uVar.setMinimumWidth(i);
            uVar.setMinimumHeight(i);
            q.u uVar2 = lVar.t;
            uVar2.setMinimumWidth(i);
            uVar2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.t.g(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.t;
        ?? r1 = lVar.x;
        View.OnLongClickListener onLongClickListener = lVar.F;
        r1.setOnClickListener(onClickListener);
        sy.n.A((CheckableImageButton) r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.t;
        lVar.F = onLongClickListener;
        ?? r0 = lVar.x;
        r0.setOnLongClickListener(onLongClickListener);
        sy.n.A((CheckableImageButton) r0, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.t;
        lVar.E = scaleType;
        lVar.x.setScaleType(scaleType);
        lVar.t.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.t;
        if (lVar.B != colorStateList) {
            lVar.B = colorStateList;
            sy.n.c(lVar.r, lVar.x, colorStateList, lVar.C);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.t;
        if (lVar.C != mode) {
            lVar.C = mode;
            sy.n.c(lVar.r, lVar.x, lVar.B, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.t.h(z);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.B;
        if (!pVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.f();
            return;
        }
        pVar.c();
        pVar.p = charSequence;
        pVar.r.setText(charSequence);
        int i = pVar.n;
        if (i != 1) {
            pVar.o = 1;
        }
        pVar.i(i, pVar.o, pVar.h(pVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        p pVar = this.B;
        pVar.t = i;
        AppCompatTextView appCompatTextView = pVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.B;
        pVar.s = charSequence;
        AppCompatTextView appCompatTextView = pVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        p pVar = this.B;
        TextInputLayout textInputLayout = pVar.h;
        if (pVar.q == z) {
            return;
        }
        pVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.g, (AttributeSet) null);
            pVar.r = appCompatTextView;
            appCompatTextView.setId(2131363426);
            pVar.r.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.r.setTypeface(typeface);
            }
            int i = pVar.u;
            pVar.u = i;
            AppCompatTextView appCompatTextView2 = pVar.r;
            if (appCompatTextView2 != null) {
                pVar.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = pVar.v;
            pVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.s;
            pVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = pVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = pVar.t;
            pVar.t = i2;
            AppCompatTextView appCompatTextView5 = pVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            pVar.r.setVisibility(4);
            pVar.a(pVar.r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.r, 0);
            pVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        l lVar = this.t;
        lVar.i(i != 0 ? s.o(lVar.getContext(), i) : null);
        sy.n.y(lVar.r, lVar.t, lVar.u);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.t;
        ?? r1 = lVar.t;
        View.OnLongClickListener onLongClickListener = lVar.w;
        r1.setOnClickListener(onClickListener);
        sy.n.A((CheckableImageButton) r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.t;
        lVar.w = onLongClickListener;
        ?? r0 = lVar.t;
        r0.setOnLongClickListener(onLongClickListener);
        sy.n.A((CheckableImageButton) r0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.t;
        if (lVar.u != colorStateList) {
            lVar.u = colorStateList;
            sy.n.c(lVar.r, lVar.t, colorStateList, lVar.v);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.t;
        if (lVar.v != mode) {
            lVar.v = mode;
            sy.n.c(lVar.r, lVar.t, lVar.u, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        p pVar = this.B;
        pVar.u = i;
        AppCompatTextView appCompatTextView = pVar.r;
        if (appCompatTextView != null) {
            pVar.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.B;
        pVar.v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.B;
        if (isEmpty) {
            if (pVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.w = charSequence;
        pVar.y.setText(charSequence);
        int i = pVar.n;
        if (i != 2) {
            pVar.o = 2;
        }
        pVar.i(i, pVar.o, pVar.h(pVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.B;
        pVar.A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        p pVar = this.B;
        TextInputLayout textInputLayout = pVar.h;
        if (pVar.x == z) {
            return;
        }
        pVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.g, (AttributeSet) null);
            pVar.y = appCompatTextView;
            appCompatTextView.setId(2131363427);
            pVar.y.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.y.setTypeface(typeface);
            }
            pVar.y.setVisibility(4);
            pVar.y.setAccessibilityLiveRegion(1);
            int i = pVar.z;
            pVar.z = i;
            AppCompatTextView appCompatTextView2 = pVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = pVar.A;
            pVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            pVar.a(pVar.y, 1);
            pVar.y.setAccessibilityDelegate(new y31.o(pVar));
        } else {
            pVar.c();
            int i2 = pVar.n;
            if (i2 == 2) {
                pVar.o = 0;
            }
            pVar.i(i2, pVar.o, pVar.h(pVar.y, ""));
            pVar.g(pVar.y, 1);
            pVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        p pVar = this.B;
        pVar.z = i;
        AppCompatTextView appCompatTextView = pVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.U) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.P0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.U) {
            this.U = z;
            if (z) {
                CharSequence hint = this.v.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.V)) {
                        setHint(hint);
                    }
                    this.v.setHint((CharSequence) null);
                }
                this.W = true;
            } else {
                this.W = false;
                if (!TextUtils.isEmpty(this.V) && TextUtils.isEmpty(this.v.getHint())) {
                    this.v.setHint(this.V);
                }
                setHintInternal(null);
            }
            if (this.v != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        d dVar = this.N0;
        if (i != dVar.p0) {
            dVar.p0 = i;
            dVar.l(false);
        }
        dVar.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.N0;
        dVar.q(i);
        this.B0 = dVar.p;
        if (this.v != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            if (this.A0 == null) {
                this.N0.r(colorStateList);
            }
            this.B0 = colorStateList;
            if (this.v != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.F = wVar;
    }

    public void setMaxEms(int i) {
        this.y = i;
        EditText editText = this.v;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.A = i;
        EditText editText = this.v;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.x = i;
        EditText editText = this.v;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.z = i;
        EditText editText = this.v;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        l lVar = this.t;
        lVar.x.setContentDescription(i != 0 ? lVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        l lVar = this.t;
        lVar.x.setImageDrawable(i != 0 ? s.o(lVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        l lVar = this.t;
        if (z && lVar.z != 1) {
            lVar.g(1);
        } else if (z) {
            lVar.getClass();
        } else {
            lVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.t;
        lVar.B = colorStateList;
        sy.n.c(lVar.r, lVar.x, colorStateList, lVar.C);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.t;
        lVar.C = mode;
        sy.n.c(lVar.r, lVar.x, lVar.B, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.L == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.L = appCompatTextView;
            appCompatTextView.setId(2131363428);
            this.L.setImportantForAccessibility(1);
            this.L.setAccessibilityLiveRegion(1);
            h f = f();
            this.O = f;
            ((d8.o) f).s = 67L;
            this.P = f();
            setPlaceholderTextAppearance(this.N);
            setPlaceholderTextColor(this.M);
            c1.p(this.L, new com.google.android.material.datepicker.g(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.K) {
                setPlaceholderTextEnabled(true);
            }
            this.J = charSequence;
        }
        EditText editText = this.v;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.N = i;
        AppCompatTextView appCompatTextView = this.L;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            AppCompatTextView appCompatTextView = this.L;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        t tVar = this.s;
        tVar.getClass();
        tVar.t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        tVar.s.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.s.s.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.s.s.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.a0;
        if (jVar == null || jVar.s.a == nVar) {
            return;
        }
        this.g0 = nVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.s.u.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? s.o(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        t tVar = this.s;
        if (i < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != tVar.x) {
            tVar.x = i;
            q.u uVar = tVar.u;
            uVar.setMinimumWidth(i);
            uVar.setMinimumHeight(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.s;
        ?? r1 = tVar.u;
        View.OnLongClickListener onLongClickListener = tVar.z;
        r1.setOnClickListener(onClickListener);
        sy.n.A((CheckableImageButton) r1, onLongClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.s;
        tVar.z = onLongClickListener;
        ?? r0 = tVar.u;
        r0.setOnLongClickListener(onLongClickListener);
        sy.n.A((CheckableImageButton) r0, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.s;
        tVar.y = scaleType;
        tVar.u.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.s;
        if (tVar.v != colorStateList) {
            tVar.v = colorStateList;
            sy.n.c(tVar.r, tVar.u, colorStateList, tVar.w);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.s;
        if (tVar.w != mode) {
            tVar.w = mode;
            sy.n.c(tVar.r, tVar.u, tVar.v, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.s.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        l lVar = this.t;
        lVar.getClass();
        lVar.G = TextUtils.isEmpty(charSequence) ? null : charSequence;
        lVar.H.setText(charSequence);
        lVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.t.H.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.t.H.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.v;
        if (editText != null) {
            c1.p(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.t0) {
            this.t0 = typeface;
            d dVar = this.N0;
            boolean t = dVar.t(typeface);
            boolean z = dVar.z(typeface);
            if (t || z) {
                dVar.l(false);
            }
            p pVar = this.B;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                AppCompatTextView appCompatTextView = pVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.G;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.v;
        if (editText == null || this.j0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = i1.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(q.r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.E && (appCompatTextView = this.G) != null) {
            mutate.setColorFilter(q.r.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.v.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.v;
        if (editText == null || this.a0 == null) {
            return;
        }
        if ((this.d0 || editText.getBackground() == null) && this.j0 != 0) {
            this.v.setBackground(getEditTextBoxBackground());
            this.d0 = true;
        }
    }

    public final void v() {
        if (this.j0 != 1) {
            FrameLayout frameLayout = this.r;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.v;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.v;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.A0;
        d dVar = this.N0;
        if (colorStateList2 != null) {
            dVar.n(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.A0;
            dVar.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.K0) : this.K0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.B.r;
            dVar.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.E && (appCompatTextView = this.G) != null) {
            dVar.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.B0) != null) {
            dVar.r(colorStateList);
        }
        l lVar = this.t;
        t tVar = this.s;
        if (z3 || !this.O0 || (isEnabled() && z4)) {
            if (z2 || this.M0) {
                ValueAnimator valueAnimator = this.Q0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.Q0.cancel();
                }
                if (z && this.P0) {
                    b(1.0f);
                } else {
                    dVar.A(1.0f);
                }
                this.M0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.v;
                x(editText3 != null ? editText3.getText() : null);
                tVar.A = false;
                tVar.e();
                lVar.I = false;
                lVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.M0) {
            ValueAnimator valueAnimator2 = this.Q0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q0.cancel();
            }
            if (z && this.P0) {
                b(0.0f);
            } else {
                dVar.A(0.0f);
            }
            if (g() && !((g) this.a0).Y.r.isEmpty() && g()) {
                ((g) this.a0).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.M0 = true;
            AppCompatTextView appCompatTextView3 = this.L;
            if (appCompatTextView3 != null && this.K) {
                appCompatTextView3.setText(null);
                d8.s.a(this.r, this.P);
                this.L.setVisibility(4);
            }
            tVar.A = true;
            tVar.e();
            lVar.I = true;
            lVar.n();
        }
    }

    public final void x(Editable editable) {
        ((r) this.F).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.r;
        if (length != 0 || this.M0) {
            AppCompatTextView appCompatTextView = this.L;
            if (appCompatTextView == null || !this.K) {
                return;
            }
            appCompatTextView.setText(null);
            d8.s.a(frameLayout, this.P);
            this.L.setVisibility(4);
            return;
        }
        if (this.L == null || !this.K || TextUtils.isEmpty(this.J)) {
            return;
        }
        this.L.setText(this.J);
        d8.s.a(frameLayout, this.O);
        this.L.setVisibility(0);
        this.L.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.F0.getDefaultColor();
        int colorForState = this.F0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.F0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.o0 = colorForState2;
        } else if (z2) {
            this.o0 = colorForState;
        } else {
            this.o0 = defaultColor;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.widget.ImageView, com.google.android.material.internal.CheckableImageButton, q.u] */
    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.a0 == null || this.j0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.v) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.v) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.o0 = this.K0;
        } else if (o()) {
            if (this.F0 != null) {
                y(z2, z);
            } else {
                this.o0 = getErrorCurrentTextColors();
            }
        } else if (!this.E || (appCompatTextView = this.G) == null) {
            if (z2) {
                this.o0 = this.E0;
            } else if (z) {
                this.o0 = this.D0;
            } else {
                this.o0 = this.C0;
            }
        } else if (this.F0 != null) {
            y(z2, z);
        } else {
            this.o0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        l lVar = this.t;
        TextInputLayout textInputLayout = lVar.r;
        ?? r5 = lVar.x;
        TextInputLayout textInputLayout2 = lVar.r;
        lVar.l();
        sy.n.y(textInputLayout2, lVar.t, lVar.u);
        sy.n.y(textInputLayout2, (CheckableImageButton) r5, lVar.B);
        if (lVar.b() instanceof i) {
            if (!textInputLayout.o() || r5.getDrawable() == null) {
                sy.n.c(textInputLayout, (CheckableImageButton) r5, lVar.B, lVar.C);
            } else {
                Drawable mutate = r5.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                r5.setImageDrawable(mutate);
            }
        }
        t tVar = this.s;
        sy.n.y(tVar.r, tVar.u, tVar.v);
        if (this.j0 == 2) {
            int i = this.l0;
            if (z2 && isEnabled()) {
                this.l0 = this.n0;
            } else {
                this.l0 = this.m0;
            }
            if (this.l0 != i && g() && !this.M0) {
                if (g()) {
                    ((g) this.a0).y(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.j0 == 1) {
            if (!isEnabled()) {
                this.p0 = this.H0;
            } else if (z && !z2) {
                this.p0 = this.J0;
            } else if (z2) {
                this.p0 = this.I0;
            } else {
                this.p0 = this.G0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        q.u uVar = this.s.u;
        if (uVar.getContentDescription() != charSequence) {
            uVar.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.s.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.t.x.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.t.x.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.t.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        q.u uVar = this.t.x;
        if (uVar.getContentDescription() != charSequence) {
            uVar.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.t;
        TextInputLayout textInputLayout = lVar.r;
        CheckableImageButton checkableImageButton = lVar.x;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            sy.n.c(textInputLayout, checkableImageButton, lVar.B, lVar.C);
            sy.n.y(textInputLayout, checkableImageButton, lVar.B);
        }
    }
}
