package i11;

import android.os.Handler;
import android.os.Looper;
import k71.l;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends l implements j71.a {
    public static final b s = new b(0);

    @Override // j71.a
    public final Object a() {
        return new Handler(Looper.getMainLooper());
    }
}
