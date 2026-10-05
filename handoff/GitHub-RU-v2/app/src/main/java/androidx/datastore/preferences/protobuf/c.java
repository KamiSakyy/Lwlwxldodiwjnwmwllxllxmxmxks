package androidx.datastore.preferences.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2261a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2262b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2261a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2262b = cls2 != null;
    }

    public static boolean a() {
        return (f2261a == null || f2262b) ? false : true;
    }

    public c(Object... a) {
    }
}
