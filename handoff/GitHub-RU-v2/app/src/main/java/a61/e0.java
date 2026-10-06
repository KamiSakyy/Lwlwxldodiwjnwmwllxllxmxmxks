package a61;

import android.util.Base64;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e0 {
    public static final String a;
    public static final String b;

    static {
        String encodeToString = Base64.encodeToString(t71.w.w(d0.b()), 10);
        a = f1.e.z("firebase_session_", encodeToString, "_data");
        b = f1.e.z("firebase_session_", encodeToString, "_settings");
    }
    public static final Object b = null;
}
