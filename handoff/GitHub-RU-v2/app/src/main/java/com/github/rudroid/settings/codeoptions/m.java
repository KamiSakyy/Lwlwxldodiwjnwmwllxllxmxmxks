package com.github.rudroid.settings.codeoptions;

import android.view.KeyEvent;
import androidx.compose.runtime.l1;
import com.github.rudroid.settings.codeoptions.f;

/* loaded from: /home/user/work/p/classes3.dex */
final class m implements j71.c {
    public final /* synthetic */ l1 r;
    public final /* synthetic */ j71.c s;

    public m(l1 l1Var, j71.c cVar) {
        this.r = l1Var;
        this.s = cVar;
    }

    public final Object k(Object obj) {
        KeyEvent keyEvent = ((o2.b) obj).a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-it$0");
        if (o2.c.c(keyEvent) == 2) {
            long a = o2.c.a(keyEvent.getKeyCode());
            boolean a2 = o2.a.a(a, o2.a.g);
            j71.c cVar = this.s;
            l1 l1Var = this.r;
            if (a2) {
                float y = l1Var.y();
                f.Companion.getClass();
                if (y >= f.a.b.size() - 1) {
                    return Boolean.FALSE;
                }
                cVar.k(Integer.valueOf(((int) l1Var.y()) + 1));
                return Boolean.TRUE;
            }
            if (o2.a.a(a, o2.a.f)) {
                if (l1Var.y() <= 0.0f) {
                    return Boolean.FALSE;
                }
                cVar.k(Integer.valueOf(((int) l1Var.y()) - 1));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
