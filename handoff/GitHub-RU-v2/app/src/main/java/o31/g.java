package o31;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g extends LinearLayoutCompat {
    public Drawable G;
    public Rect H;
    public Rect I;
    public int J;
    public boolean K;
    public boolean L;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = new Rect();
        this.I = new Rect();
        this.J = 119;
        this.K = true;
        this.L = false;
        o.a(context, attributeSet, 0, 0);
        int[] iArr = x21.a.o;
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.J = obtainStyledAttributes.getInt(1, this.J);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.K = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        super/*android.view.View*/.draw(canvas);
        Drawable drawable = this.G;
        if (drawable != null) {
            if (this.L) {
                this.L = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.K;
                Rect rect = this.H;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.J;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.I;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableHotspotChanged(float f, float f2) {
        super/*android.view.View*/.drawableHotspotChanged(f, f2);
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableStateChanged() {
        super/*android.view.View*/.drawableStateChanged();
        Drawable drawable = this.G;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.G.setState(getDrawableState());
    }

    public Drawable getForeground() {
        return this.G;
    }

    public int getForegroundGravity() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jumpDrawablesToCurrentState() {
        super/*android.view.View*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.L = z | this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.L = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.G);
            }
            this.G = drawable;
            this.L = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.J == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setForegroundGravity(int i) {
        if (this.J != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.J = i;
            if (i == 119 && this.G != null) {
                this.G.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean verifyDrawable(Drawable drawable) {
        return super/*android.view.View*/.verifyDrawable(drawable) || drawable == this.G;
    }
    public Object onCreateDrawableState(Object p1) { return null; }
    public Object setWillNotDraw(boolean) { return null; }
    public Object unscheduleDrawable(Object) { return null; }
}
