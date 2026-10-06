package y31;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends u31.h {
    public RectF r;

    public f(u31.n nVar, RectF rectF) {
        super(nVar);
        this.r = rectF;
    }

    @Override // u31.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.Y = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.r = fVar.r;
    }
}
