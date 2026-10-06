package q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public ActionBarContainer f30539a;

    public a(ActionBarContainer actionBarContainer) {
        this.f30539a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f30539a;
        if (actionBarContainer.f920x) {
            Drawable drawable = actionBarContainer.f919w;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f917u;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f918v;
        if (drawable3 == null || !actionBarContainer.f921y) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f30539a;
        if (actionBarContainer.f920x) {
            if (actionBarContainer.f919w != null) {
                actionBarContainer.f917u.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f917u;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
