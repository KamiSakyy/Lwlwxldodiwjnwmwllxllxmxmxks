package w51;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xShadow extends BroadcastReceiver {
    public y a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        y yVar = this.a;
        if (yVar == null) {
            return;
        }
        if (yVar.c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            y yVar2 = this.a;
            yVar2.u.f.schedule(yVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r {
        public r() {
        }
    }
}
