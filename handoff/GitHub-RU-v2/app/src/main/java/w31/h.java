package w31;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.i4;
import o31.o;
import u31.n;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h extends FrameLayout {
    public static final d31.g C = new d31.g(2);
    public Rect A;
    public boolean B;
    public i r;
    public final n s;
    public int t;
    public final float u;
    public final float v;
    public final int w;
    public final int x;
    public ColorStateList y;
    public PorterDuff.Mode z;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, AttributeSet attributeSet) {
        super(a41.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, x21.a.J);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.t = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.s = n.c(context2, attributeSet, 0, 0).a();
        }
        this.u = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(i4.W(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(o.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.v = obtainStyledAttributes.getFloat(1, 1.0f);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.x = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(C);
        setFocusable(true);
        if (getBackground() == null) {
            int q = a.a.q(a.a.n(this, 2130968896), getBackgroundOverlayColorAlpha(), a.a.n(this, 2130968873));
            n nVar = this.s;
            if (nVar != null) {
                p6.a aVar = i.x;
                u31.j jVar = new u31.j(nVar);
                jVar.q(ColorStateList.valueOf(q));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                p6.a aVar2 = i.x;
                float dimension = resources.getDimension(2131166232);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(q);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.y;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(i iVar) {
        this.r = iVar;
    }

    public float getActionTextColorAlpha() {
        return this.v;
    }

    public int getAnimationMode() {
        return this.t;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.u;
    }

    public int getMaxInlineActionWidth() {
        return this.x;
    }

    public int getMaxWidth() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.r;
        if (iVar != null) {
            iVar.e();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        i iVar = this.r;
        if (iVar != null) {
            r D = r.D();
            f fVar = iVar.w;
            synchronized (D.s) {
                z = true;
                if (!D.H(fVar)) {
                    m mVar = (m) D.v;
                    if (!((mVar == null || fVar == null || mVar.a.get() != fVar) ? false : true)) {
                        z = false;
                    }
                }
            }
            if (z) {
                i.A.post(new d(iVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i iVar = this.r;
        if (iVar == null || !iVar.u) {
            return;
        }
        iVar.i();
        iVar.u = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.w;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.t = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.y != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.y);
            drawable.setTintMode(this.z);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.z);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.B || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.A = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        i iVar = this.r;
        if (iVar != null) {
            p6.a aVar = i.x;
            iVar.j();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : C);
        super.setOnClickListener(onClickListener);
    }
}
