package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2284a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2285b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f2286c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2287d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2288e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2289f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2290g;

    static {
        Unsafe i = i();
        f2284a = i;
        f2285b = c.f2261a;
        boolean h10 = h(Long.TYPE);
        boolean h11 = h(Integer.TYPE);
        f1 f1Var = null;
        if (i != null) {
            if (!c.a()) {
                f1Var = new e1(i);
            } else if (h10) {
                f1Var = new d1(i, 1);
            } else if (h11) {
                f1Var = new d1(i, 0);
            }
        }
        f2286c = f1Var;
        f2287d = f1Var == null ? false : f1Var.r();
        f2288e = f1Var == null ? false : f1Var.q();
        f2289f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g7 = g();
        if (g7 != null && f1Var != null) {
            f1Var.i(g7);
        }
        f2290g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(g1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j10, Object obj) {
        return ((byte) ((f2286c.f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j10, Object obj) {
        return ((byte) ((f2286c.f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f2284a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int e(Class cls) {
        if (f2288e) {
            return f2286c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f2288e) {
            f2286c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f2285b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        f2286c.k(bArr, f2289f + j10, b10);
    }

    public static void k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int f6 = f2286c.f(j11, obj);
        int i = ((~((int) j10)) & 3) << 3;
        m(((255 & b10) << i) | (f6 & (~(255 << i))), j11, obj);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        m(((255 & b10) << i) | (f2286c.f(j11, obj) & (~(255 << i))), j11, obj);
    }

    public static void m(int i, long j10, Object obj) {
        f2286c.n(i, j10, obj);
    }

    public static void n(Object obj, long j10, long j11) {
        f2286c.o(obj, j10, j11);
    }

    public static void o(long j10, Object obj, Object obj2) {
        f2286c.p(j10, obj, obj2);
    }
}
