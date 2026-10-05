package i21;

import a7.d;
import android.content.Context;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static final b b;
    public d a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static d a(Context context) {
        d dVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new d(context, (short) 0);
                }
                dVar = bVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
