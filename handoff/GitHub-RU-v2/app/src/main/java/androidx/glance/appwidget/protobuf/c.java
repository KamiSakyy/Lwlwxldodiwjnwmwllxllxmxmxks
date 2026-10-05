package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2693a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2694b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2693a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2694b = cls2 != null;
    }

    public static boolean a() {
        return (f2693a == null || f2694b) ? false : true;
    }
}
