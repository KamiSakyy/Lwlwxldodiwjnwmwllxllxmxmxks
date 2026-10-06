package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import k71.k;
import l7.a1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements a1 {
    public int a;
    public float b;
    public float c;

    public a(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        k.g(motionEvent, "e");
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        k.g(motionEvent, "ev");
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = x;
            this.c = y;
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        float abs = Math.abs(x - this.b);
        float abs2 = Math.abs(y - this.c);
        float f = this.a;
        if (abs < f || abs2 >= f) {
            return false;
        }
        recyclerView.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public final void e(boolean z) {
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }
}
