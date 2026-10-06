package w51;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 extends Binder {
    public s21.a f;

    public b0(s21.a aVar) {
        this.f = aVar;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = c0Var.a;
        g gVar = (g) this.f.s;
        w21.g gVar2 = new w21.g();
        gVar.r.execute(new androidx.fragment.app.e(gVar, intent, gVar2, 5));
        gVar2.a.a(new i7.c(0), new a0(0, c0Var));
    }
    public static final Object a = null;
}
