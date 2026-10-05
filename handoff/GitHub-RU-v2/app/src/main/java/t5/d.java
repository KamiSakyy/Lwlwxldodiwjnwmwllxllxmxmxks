package t5;

import android.view.View;
import sy.q;
import u31.y;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32071a;

    public final float h(y yVar) {
        switch (this.f32071a) {
            case k5.f.J /* 0 */:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }

    public final void k(y yVar, float f6) {
        switch (this.f32071a) {
            case k5.f.J /* 0 */:
                ((View) yVar).setAlpha(f6);
                break;
            case 1:
                ((View) yVar).setScaleX(f6);
                break;
            case 2:
                ((View) yVar).setScaleY(f6);
                break;
            case 3:
                ((View) yVar).setRotation(f6);
                break;
            case 4:
                ((View) yVar).setRotationX(f6);
                break;
            default:
                ((View) yVar).setRotationY(f6);
                break;
        }
    }
}
