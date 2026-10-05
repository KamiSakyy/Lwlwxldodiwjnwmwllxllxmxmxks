package d31;

import a5.n1;
import a5.p2;
import a5.x1;
import android.view.View;
import b1.m;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends n1 {
    public final View t;
    public int u;
    public int v;
    public final int[] w;

    public k(View view) {
        super(0);
        this.w = new int[2];
        this.t = view;
    }

    public final void f(x1 x1Var) {
        this.t.setTranslationY(0.0f);
    }

    public final void g(x1 x1Var) {
        View view = this.t;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        this.u = iArr[1];
    }

    public final p2 h(p2 p2Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((x1) it.next()).a.d() & 8) != 0) {
                this.t.setTranslationY(y21.a.c(this.v, r0.a.c(), 0));
                break;
            }
        }
        return p2Var;
    }

    public final m i(x1 x1Var, m mVar) {
        View view = this.t;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        int i = this.u - iArr[1];
        this.v = i;
        view.setTranslationY(i);
        return mVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p2<T1,T2,T3,T4> {
        public p2() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x1<T1,T2,T3,T4> {
        public x1() {
        }
    }
}
