package b21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.measurement.internal.e3;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends BroadcastReceiver {
    public final /* synthetic */ int a = 1;
    public Context b;
    public Object c;

    public /* synthetic */ n() {
    }

    public void a() {
        Log.isLoggable("FirebaseMessaging", 3);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        e3 e3Var = (e3) this.c;
        if (e3Var != null) {
            Context context = ((FirebaseMessaging) e3Var.u).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    Object obj = ((b1.m) this.c).t;
                    throw null;
                }
                return;
            default:
                e3 e3Var = (e3) this.c;
                if (e3Var != null && e3Var.a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    e3 e3Var2 = (e3) this.c;
                    ((FirebaseMessaging) e3Var2.u).getClass();
                    FirebaseMessaging.b(e3Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
        }
    }

    public n(b1.m mVar) {
        this.c = mVar;
    }
}
