package h31;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public e8.b a;
    public final /* synthetic */ c b;

    public a(c cVar) {
        this.b = cVar;
    }

    public final void a(Drawable drawable) {
        ColorStateList colorStateList = this.b.F;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void b(Drawable drawable) {
        c cVar = this.b;
        ColorStateList colorStateList = cVar.F;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.J, colorStateList.getDefaultColor()));
        }
    }
}
