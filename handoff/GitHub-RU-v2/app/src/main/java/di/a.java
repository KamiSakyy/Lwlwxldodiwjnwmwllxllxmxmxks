package di;

import androidx.lifecycle.c0;
import androidx.lifecycle.i;
import com.github.rudroid.agents.sessionevents.ui.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements i {
    public final /* synthetic */ k.i r;
    public final /* synthetic */ z1 s;

    public a(k.i iVar, z1 z1Var) {
        this.r = iVar;
        this.s = z1Var;
    }

    public final void E(c0 c0Var) {
        if (this.r.isFinishing()) {
            return;
        }
        this.s.a();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z1<T1,T2,T3,T4> {
        public z1() {
        }
    }
}
