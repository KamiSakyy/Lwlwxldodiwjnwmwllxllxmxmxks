package e1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import d2.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends RippleDrawable {

    /* renamed from: r, reason: collision with root package name */
    public boolean f21838r;

    /* renamed from: s, reason: collision with root package name */
    public t f21839s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f21840t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21841u;

    public h(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f21838r = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f21838r) {
            this.f21841u = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f21841u = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f21841u;
    }
}
