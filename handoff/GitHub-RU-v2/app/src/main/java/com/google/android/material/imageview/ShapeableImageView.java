package com.google.android.material.imageview;

import a41.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.i4;
import o4.b;
import q.v;
import u31.j;
import u31.n;
import u31.o;
import u31.p;
import u31.y;

/* loaded from: /home/user/work/p/classes4.dex */
public class ShapeableImageView extends v implements y {
    public ColorStateList A;
    public j B;
    public n C;
    public float D;
    public final Path E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public boolean L;
    public final p u;
    public final RectF v;
    public final RectF w;
    public final Paint x;
    public final Paint y;
    public final Path z;

    /* JADX WARN: Multi-variable type inference failed */
    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, 2132018525), attributeSet, 0);
        this.u = o.a;
        this.z = new Path();
        this.L = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.y = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.v = new RectF();
        this.w = new RectF();
        this.E = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, x21.a.H, 0, 2132018525);
        setLayerType(2, null);
        this.A = i4.W(context2, obtainStyledAttributes, 9);
        this.D = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.F = dimensionPixelSize;
        this.G = dimensionPixelSize;
        this.H = dimensionPixelSize;
        this.I = dimensionPixelSize;
        this.F = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.G = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.H = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.I = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.J = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.K = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.x = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.C = n.c(context2, attributeSet, 0, 2132018525).a();
        setOutlineProvider(new n31.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.v;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        n nVar = this.C;
        p pVar = this.u;
        Path path = this.z;
        pVar.a(nVar, null, 1.0f, rectF, null, path);
        Path path2 = this.E;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.w;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.I;
    }

    public final int getContentPaddingEnd() {
        int i = this.K;
        return i != Integer.MIN_VALUE ? i : b() ? this.F : this.H;
    }

    public int getContentPaddingLeft() {
        int i = this.K;
        int i2 = this.J;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (b() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!b() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.F;
    }

    public int getContentPaddingRight() {
        int i = this.K;
        int i2 = this.J;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (b() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!b() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.H;
    }

    public final int getContentPaddingStart() {
        int i = this.J;
        return i != Integer.MIN_VALUE ? i : b() ? this.H : this.F;
    }

    public int getContentPaddingTop() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingBottom() {
        return super/*android.view.View*/.getPaddingBottom() - getContentPaddingBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingEnd() {
        return super/*android.view.View*/.getPaddingEnd() - getContentPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingLeft() {
        return super/*android.view.View*/.getPaddingLeft() - getContentPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingRight() {
        return super/*android.view.View*/.getPaddingRight() - getContentPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingStart() {
        return super/*android.view.View*/.getPaddingStart() - getContentPaddingStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingTop() {
        return super/*android.view.View*/.getPaddingTop() - getContentPaddingTop();
    }

    public n getShapeAppearanceModel() {
        return this.C;
    }

    public ColorStateList getStrokeColor() {
        return this.A;
    }

    public float getStrokeWidth() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        canvas.drawPath(this.E, this.y);
        if (this.A == null) {
            return;
        }
        float f = this.D;
        Paint paint = this.x;
        paint.setStrokeWidth(f);
        int colorForState = this.A.getColorForState(getDrawableState(), this.A.getDefaultColor());
        if (this.D <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.z, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (!this.L && isLayoutDirectionResolved()) {
            this.L = true;
            if (!isPaddingRelative() && this.J == Integer.MIN_VALUE && this.K == Integer.MIN_VALUE) {
                setPadding(super/*android.view.View*/.getPaddingLeft(), super/*android.view.View*/.getPaddingTop(), super/*android.view.View*/.getPaddingRight(), super/*android.view.View*/.getPaddingBottom());
            } else {
                setPaddingRelative(super/*android.view.View*/.getPaddingStart(), super/*android.view.View*/.getPaddingTop(), super/*android.view.View*/.getPaddingEnd(), super/*android.view.View*/.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u31.y
    public void setShapeAppearanceModel(n nVar) {
        this.C = nVar;
        j jVar = this.B;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(nVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i) {
        setStrokeColor(b.c(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidth(float f) {
        if (this.D != f) {
            this.D = f;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public <T0> T0 setImageDrawable(Object... a) {
        return null;
    }

    public <T0> T0 setBackgroundColor(Object... a) {
        return null;
    }

    public <T0> T0 setImageURI(Object... a) {
        return null;
    }

    public <T0> T0 setOnClickListener(Object... a) {
        return null;
    }

    public <T0> T0 setLayerType(Object... a) {
        return null;
    }

    public <T0> T0 setOutlineProvider(Object... a) {
        return null;
    }

    public <T0> T0 getLayoutDirection(Object... a) {
        return null;
    }

    public <T0> T0 getDrawableState(Object... a) {
        return null;
    }

    public <T0> T0 isLayoutDirectionResolved(Object... a) {
        return null;
    }

    public <T0> T0 isPaddingRelative(Object... a) {
        return null;
    }

    public <T0> T0 getWidth(Object... a) {
        return null;
    }

    public <T0> T0 getHeight(Object... a) {
        return null;
    }

    public <T0> T0 invalidateOutline(Object... a) {
        return null;
    }

    public <T0> T0 getContext(Object... a) {
        return null;
    }
}
