package x31;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import e50.z0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends z0 {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        super(9);
        this.w = i;
    }

    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.w) {
            case 0:
                RectF a = z0.a(tabLayout, view);
                RectF a2 = z0.a(tabLayout, view2);
                if (a.left < a2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(y21.a.c((int) a.left, sin, (int) a2.left), drawable.getBounds().top, y21.a.c((int) a.right, cos, (int) a2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF a3 = z0.a(tabLayout, view);
                float b = f < 0.5f ? y21.a.b(1.0f, 0.0f, 0.0f, 0.5f, f) : y21.a.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) a3.left, drawable.getBounds().top, (int) a3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                break;
        }
    }
}
