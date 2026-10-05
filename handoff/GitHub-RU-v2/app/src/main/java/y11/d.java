package y11;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import t.q;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class d implements w21.a, w21.f {
    public static final /* synthetic */ d s = new d(0);
    public static final /* synthetic */ d t = new d(1);
    public static final /* synthetic */ d u = new d(2);
    public final /* synthetic */ int r;

    public /* synthetic */ d(int i) {
        this.r = i;
    }

    @Override // w21.a
    public Object c(o oVar) {
        switch (this.r) {
            case 0:
                if (oVar.j()) {
                    return (Bundle) oVar.h();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(oVar.g()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", oVar.g());
            default:
                Intent intent = (Intent) ((Bundle) oVar.h()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // w21.f
    public o f(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? q.k(bundle) : q.k((Object) null);
    }
}
