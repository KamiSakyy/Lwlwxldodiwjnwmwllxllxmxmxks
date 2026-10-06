package w;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f32907a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f32908b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f32909c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f32910d;

    /* renamed from: e, reason: collision with root package name */
    public float f32911e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f32914h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f32915j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32912f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32913g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f32916k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f6) {
        this.f32907a = f6;
        Paint paint = new Paint(5);
        this.f32908b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f32914h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f32914h.getDefaultColor()));
        this.f32909c = new RectF();
        this.f32910d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f6 = rect.left;
        float f10 = rect.top;
        float f11 = rect.right;
        float f12 = rect.bottom;
        RectF rectF = this.f32909c;
        rectF.set(f6, f10, f11, f12);
        Rect rect2 = this.f32910d;
        rect2.set(rect);
        if (this.f32912f) {
            rect2.inset((int) Math.ceil(c.a(this.f32911e, this.f32907a, this.f32913g)), (int) Math.ceil(c.b(this.f32911e, this.f32907a, this.f32913g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.f32908b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.i);
            z10 = true;
        }
        RectF rectF = this.f32909c;
        float f6 = this.f32907a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f32910d, this.f32907a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f32915j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f32914h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f32914h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f32908b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f32915j;
        if (colorStateList2 == null || (mode = this.f32916k) == null) {
            return z10;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f32908b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32908b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f32915j = colorStateList;
        this.i = a(colorStateList, this.f32916k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f32916k = mode;
        this.i = a(this.f32915j, mode);
        invalidateSelf();
    }
    public Object a = null;
    public Object e = null;
}
