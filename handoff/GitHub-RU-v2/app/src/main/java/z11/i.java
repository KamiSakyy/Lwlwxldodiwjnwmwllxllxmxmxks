package z11;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends h0 {
    public final Context a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.b = eVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = f.a;
        e eVar = this.b;
        Context context = this.a;
        int b = eVar.b(context, i);
        int i2 = g.e;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = eVar.a(b, context, "n");
            eVar.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
