package w51;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x extends BroadcastReceiver {
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
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f<T1,T2,T3,T4> {
        public f() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r<T1,T2,T3,T4> {
        public r() {
        }
    }
}
