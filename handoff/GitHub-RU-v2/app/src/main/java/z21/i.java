package z21;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i extends l4.b {
    public j a;
    public int b = 0;

    public i() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new j(view);
        }
        j jVar = this.a;
        View view2 = jVar.a;
        jVar.b = view2.getTop();
        jVar.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int w() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar.d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public i(int i) {
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
