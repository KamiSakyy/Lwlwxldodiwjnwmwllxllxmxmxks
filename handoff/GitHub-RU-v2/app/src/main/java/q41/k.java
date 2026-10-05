package q41;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements Executor {
    public static final k r;
    public static final Handler s;
    public static final /* synthetic */ k[] t;

    static {
        k kVar = new k("INSTANCE", 0);
        r = kVar;
        t = new k[]{kVar};
        s = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        s.post(runnable);
    }
}
