package g41;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends ResultReceiver {
    public final /* synthetic */ w21.g r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, w21.g gVar) {
        super(handler);
        this.r = gVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.r.c(null);
    }
}
