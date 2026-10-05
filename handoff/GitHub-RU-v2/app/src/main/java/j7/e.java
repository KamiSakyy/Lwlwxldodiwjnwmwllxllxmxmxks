package j7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
