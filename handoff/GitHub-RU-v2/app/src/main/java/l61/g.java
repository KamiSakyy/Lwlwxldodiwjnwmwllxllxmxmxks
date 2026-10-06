package l61;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final HashSet a = new HashSet();

    public final void a() {
        if (i21.a.c == null) {
            i21.a.c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != i21.a.c) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw f4Shadow.g(it);
        }
    }
}
