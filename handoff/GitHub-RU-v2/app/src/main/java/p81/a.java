package p81;

import android.content.Context;
import android.util.Log;
import k21.b;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements b {
    public static a s;
    public int r;

    public static void c(String str, Object... objArr) {
        d().e(3, str, objArr);
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            try {
                if (s == null) {
                    s = new a();
                }
                aVar = s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public int a(Context context, String str, boolean z) {
        return 0;
    }

    public int b(Context context, String str) {
        return this.r;
    }

    public void e(int i, String str, Object... objArr) {
        if (this.r > i) {
            return;
        }
        if (objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        Log.println(i, "AppAuth", str);
    }

    public a() {
        int i = 7;
        while (i >= 2 && Log.isLoggable("AppAuth", i)) {
            i--;
        }
        this.r = i + 1;
    }
}
