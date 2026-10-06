package w51;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l1;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public Context a;
    public j4.h b;
    public androidx.lifecycle.b c;
    public FirebaseMessaging d;
    public ScheduledThreadPoolExecutor f;
    public u h;
    public final x.e e = new x.e(0);
    public boolean g = false;

    public w(FirebaseMessaging firebaseMessaging, j4.h hVar, u uVar, androidx.lifecycle.b bVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = hVar;
        this.h = uVar;
        this.c = bVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(w21.o oVar) {
        try {
            t.q.d(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a = this.d.a();
        androidx.lifecycle.b bVar = this.c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(bVar.m(bVar.B(a, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a = this.d.a();
        androidx.lifecycle.b bVar = this.c;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(bVar.m(bVar.B(a, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        t a;
        u uVar;
        while (true) {
            synchronized (this) {
                try {
                    a = this.h.a();
                    if (a == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                        uVar = this.h;
                        synchronized (uVar) {
                            l1 l1Var = uVar.a;
                            String str3 = a.c;
                            synchronized (((ArrayDeque) l1Var.u)) {
                                if (((ArrayDeque) l1Var.u).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) l1Var.v).execute(new androidx.fragment.app.s(26, l1Var));
                                }
                            }
                        }
                        synchronized (this.e) {
                            try {
                                String str4 = a.c;
                                if (this.e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                                    w21.g gVar = (w21.g) arrayDeque.poll();
                                    if (gVar != null) {
                                        gVar.a(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    uVar = this.h;
                    synchronized (uVar) {
                    }
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                        uVar = this.h;
                        synchronized (uVar) {
                        }
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    uVar = this.h;
                    synchronized (uVar) {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final void f(long j2) {
        this.f.schedule(new y(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
