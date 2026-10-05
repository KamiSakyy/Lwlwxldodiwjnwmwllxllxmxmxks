package t;

import android.os.CancellationSignal;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
