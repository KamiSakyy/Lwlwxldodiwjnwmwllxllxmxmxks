package d31;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements View.OnTouchListener {
    public final /* synthetic */ int r;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.r) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }
}
