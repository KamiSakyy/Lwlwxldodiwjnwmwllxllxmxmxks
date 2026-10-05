package o2;

import android.view.KeyEvent;
import w1.r;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {
    public static final long a(int i) {
        long j10 = (i << 32) | (0 & 4294967295L);
        int i10 = a.H;
        return j10;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final r d(r rVar, j71.c cVar) {
        return rVar.f(new d(cVar, null));
    }

    public static final r e(r rVar, j71.c cVar) {
        return rVar.f(new d(null, cVar));
    }
}
