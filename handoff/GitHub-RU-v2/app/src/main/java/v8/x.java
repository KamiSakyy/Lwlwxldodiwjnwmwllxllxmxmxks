package v8;

import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static volatile x f32847b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32846a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final x f32848c = new x();

    public x() {
        List list = Collections.EMPTY_LIST;
    }

    public static x a() {
        x xVar;
        synchronized (f32846a) {
            try {
                if (f32847b == null) {
                    f32847b = new x();
                }
                xVar = f32847b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
