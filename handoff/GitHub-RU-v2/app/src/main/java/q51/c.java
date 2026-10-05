package q51;

import a7.n;
import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.compose.foundation.lazy.layout.o1;
import c21.u;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l7.x1;
import org.json.JSONException;
import org.json.JSONObject;
import p41.k;
import q41.j;
import t.q;
import w21.o;
import w80.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements d {
    public static final Object m = new Object();
    public final k41.g a;
    public final s51.c b;
    public final x1 c;
    public final i d;
    public final k e;
    public final g f;
    public final Object g;
    public final ExecutorService h;
    public final j i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(k41.g gVar, p51.b bVar, ExecutorService executorService, j jVar) {
        gVar.a();
        s51.c cVar = new s51.c(gVar.a, bVar);
        x1 x1Var = new x1();
        x1Var.s = gVar;
        if (a0.v == null) {
            a0.v = new a0(8);
        }
        a0 a0Var = a0.v;
        if (i.d == null) {
            i.d = new i(a0Var);
        }
        i iVar = i.d;
        k kVar = new k(new p41.c(2, gVar));
        g gVar2 = new g();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gVar;
        this.b = cVar;
        this.c = x1Var;
        this.d = iVar;
        this.e = kVar;
        this.f = gVar2;
        this.h = executorService;
        this.i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.c;
        r2 = r2.a();
        r2.a = r3;
        r2.b = 3;
        r2 = r2.a();
        r4.v(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        r51.a F;
        synchronized (m) {
            try {
                k41.g gVar = this.a;
                gVar.a();
                x1 k = x1.k(gVar.a);
                try {
                    F = this.c.F();
                    int i = F.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (k != null) {
                        k.H();
                    }
                } catch (Throwable th) {
                    if (k != null) {
                        k.H();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(F);
        this.i.execute(new b(this, 2));
    }

    public final r51.a b(r51.a aVar) {
        int responseCode;
        s51.b f;
        s51.c cVar = this.b;
        k41.g gVar = this.a;
        gVar.a();
        String str = gVar.c.a;
        String str2 = aVar.a;
        k41.g gVar2 = this.a;
        gVar2.a();
        String str3 = gVar2.c.g;
        String str4 = aVar.d;
        s51.d dVar = cVar.c;
        if (!dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = s51.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c = cVar.c(a, str);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c.setDoOutput(true);
                    s51.c.h(c);
                    responseCode = c.getResponseCode();
                    dVar.b(responseCode);
                } finally {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f = s51.c.f(c);
            } else {
                s51.c.b(c, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    o1 a2 = s51.b.a();
                    a2.b = 3;
                    f = a2.c();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        o1 a3 = s51.b.a();
                        a3.b = 2;
                        f = a3.c();
                    }
                }
            }
            int b = y3.a.b(f.c);
            if (b != 0) {
                if (b == 1) {
                    n a4 = aVar.a();
                    a4.g = "BAD CONFIG";
                    a4.b = 5;
                    return a4.a();
                }
                if (b != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.j = null;
                }
                n a5 = aVar.a();
                a5.b = 2;
                return a5.a();
            }
            String str5 = f.a;
            long j = f.b;
            i iVar = this.d;
            iVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            iVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            n a6 = aVar.a();
            a6.c = str5;
            a6.e = Long.valueOf(j);
            a6.f = Long.valueOf(seconds);
            return a6.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return q.k(str);
        }
        w21.g gVar = new w21.g();
        f fVar = new f(gVar);
        synchronized (this.g) {
            this.l.add(fVar);
        }
        o oVar = gVar.a;
        this.h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        w21.g gVar = new w21.g();
        e eVar = new e(this.d, gVar);
        synchronized (this.g) {
            this.l.add(eVar);
        }
        o oVar = gVar.a;
        this.h.execute(new b(this, 1));
        return oVar;
    }

    public final void e() {
        k41.g gVar = this.a;
        gVar.a();
        u.e(gVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.e(gVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        u.e(gVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.b;
        Pattern pattern = i.c;
        u.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        u.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i.c.matcher(gVar.c.a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(r51.a aVar) {
        String string;
        k41.g gVar = this.a;
        gVar.a();
        if (!gVar.b.equals("CHIME_ANDROID_SDK")) {
            k41.g gVar2 = this.a;
            gVar2.a();
        }
        if (aVar.b == 1) {
            r51.b bVar = (r51.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    synchronized (bVar.a) {
                        string = bVar.a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f.getClass();
            return g.a();
        }
        this.f.getClass();
        return g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [s51.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [s51.a] */
    public final r51.a g(r51.a aVar) {
        int responseCode;
        String str = aVar.a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            r51.b bVar = (r51.b) this.e.get();
            synchronized (bVar.a) {
                try {
                    String[] strArr = r51.b.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = bVar.a.getString("|T|" + bVar.b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        s51.c cVar = this.b;
        k41.g gVar = this.a;
        gVar.a();
        String str4 = gVar.c.a;
        String str5 = aVar.a;
        k41.g gVar2 = this.a;
        gVar2.a();
        String str6 = gVar2.c.g;
        k41.g gVar3 = this.a;
        gVar3.a();
        String str7 = gVar3.c.b;
        s51.d dVar = cVar.c;
        if (!dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a = s51.c.a("projects/" + str6 + "/installations");
        int i2 = 0;
        s51.a aVar2 = cVar;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c = aVar2.c(a, str4);
            try {
                try {
                    c.setRequestMethod("POST");
                    c.setDoOutput(true);
                    if (str2 != null) {
                        c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    s51.c.g(c, str5, str7);
                    responseCode = c.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    s51.a e = s51.c.e(c);
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e;
                } else {
                    try {
                        s51.c.b(c, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        aVar2 = aVar2;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        s51.a aVar3 = new s51.a(null, null, null, null, 2);
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVar3;
                    } else {
                        c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        aVar2 = aVar2;
                    }
                }
                int b = y3.a.b(aVar2.e);
                if (b != 0) {
                    if (b != 1) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    n a2 = aVar.a();
                    a2.g = "BAD CONFIG";
                    a2.b = 5;
                    return a2.a();
                }
                String str8 = aVar2.b;
                String str9 = aVar2.c;
                i iVar = this.d;
                iVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                s51.b bVar2 = aVar2.d;
                String str10 = bVar2.a;
                long j = bVar2.b;
                n a3 = aVar.a();
                a3.a = str8;
                a3.b = 4;
                a3.c = str10;
                a3.d = str9;
                a3.e = Long.valueOf(j);
                a3.f = Long.valueOf(seconds);
                return a3.a();
            } finally {
                c.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(r51.a aVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
