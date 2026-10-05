package b21;

import android.os.Trace;
import com.google.android.gms.internal.measurement.m4;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements Runnable {
    public static final /* synthetic */ r s = new r(1);
    public final /* synthetic */ int r;

    public /* synthetic */ r(int i) {
        this.r = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                throw null;
            case 1:
                m4.i.incrementAndGet();
                return;
            default:
                try {
                    Method method = w4.e.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (u5.i.d()) {
                        u5.i.a().f();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = w4.e.b;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public r(s sVar) {
        this.r = 0;
    }
}
