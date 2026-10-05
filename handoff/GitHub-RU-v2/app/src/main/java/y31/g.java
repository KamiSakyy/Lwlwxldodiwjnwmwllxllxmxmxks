package y31;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends u31.j {
    public static final /* synthetic */ int Z = 0;
    public f Y;

    @Override // u31.j
    public final void g(Canvas canvas) {
        if (this.Y.r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.Y.r);
        super.g(canvas);
        canvas.restore();
    }

    @Override // u31.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.Y = new f(this.Y);
        return this;
    }

    public final void y(float f, float f2, float f3, float f4) {
        RectF rectF = this.Y.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
