package n21;

import android.os.Build;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
