package b91;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import q81.u;
import t71.p;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = u.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(u.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(x81.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(t81.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = x.B(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) b.get(str);
        if (str3 == null) {
            str3 = p.r0(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int Q = p.Q(str2, '\n', i2, 4);
                if (Q == -1) {
                    Q = length;
                }
                while (true) {
                    min = Math.min(Q, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    k71.k.f(substring, "substring(...)");
                    Log.println(i, str3, substring);
                    if (min >= Q) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.a);
        }
    }
    public Object b(Object p1) { return null; }
}
