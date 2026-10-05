package w;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import d9.e;
import v2.t;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a extends FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f32900w = {R.attr.colorBackground};

    /* renamed from: x, reason: collision with root package name */
    public static final e f32901x = new e(9);

    /* renamed from: r, reason: collision with root package name */
    public boolean f32902r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32903s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f32904t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f32905u;

    /* renamed from: v, reason: collision with root package name */
    public final t f32906v;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969471);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f32904t = rect;
        this.f32905u = new Rect();
        t tVar = new t(8, this);
        this.f32906v = tVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a.f32320a, 2130969471, 2132017471);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f32900w);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(2131099782) : getResources().getColor(2131099781));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f32902r = obtainStyledAttributes.getBoolean(7, false);
        this.f32903s = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b(valueOf, dimension);
        tVar.f32599s = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f32901x.d(tVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f32906v.f32599s)).f32914h;
    }

    public float getCardElevation() {
        return ((a) this.f32906v.f32600t).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f32904t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f32904t.left;
    }

    public int getContentPaddingRight() {
        return this.f32904t.right;
    }

    public int getContentPaddingTop() {
        return this.f32904t.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f32906v.f32599s)).f32911e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f32903s;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f32906v.f32599s)).f32907a;
    }

    public boolean getUseCompatPadding() {
        return this.f32902r;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        b bVar = (b) ((Drawable) this.f32906v.f32599s);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.f32914h = valueOf;
        bVar.f32908b.setColor(valueOf.getColorForState(bVar.getState(), bVar.f32914h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f6) {
        ((a) this.f32906v.f32600t).setElevation(f6);
    }

    public void setMaxCardElevation(float f6) {
        f32901x.d(this.f32906v, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f32903s) {
            this.f32903s = z10;
            t tVar = this.f32906v;
            f32901x.d(tVar, ((b) ((Drawable) tVar.f32599s)).f32911e);
        }
    }

    public void setRadius(float f6) {
        b bVar = (b) ((Drawable) this.f32906v.f32599s);
        if (f6 == bVar.f32907a) {
            return;
        }
        bVar.f32907a = f6;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f32902r != z10) {
            this.f32902r = z10;
            t tVar = this.f32906v;
            f32901x.d(tVar, ((b) ((Drawable) tVar.f32599s)).f32911e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f32906v.f32599s);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f32914h = colorStateList;
        bVar.f32908b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f32914h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class t<T1,T2,T3,T4> {
        public t() {
        }
    }
}
