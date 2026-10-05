package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2727a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2728b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f2729c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2730d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2731e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2732f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2733g;

    static {
        Unsafe j10 = j();
        f2727a = j10;
        f2728b = c.f2693a;
        boolean f6 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        h1 h1Var = null;
        if (j10 != null) {
            if (!c.a()) {
                h1Var = new g1(j10);
            } else if (f6) {
                h1Var = new f1(j10, 1);
            } else if (f10) {
                h1Var = new f1(j10, 0);
            }
        }
        f2729c = h1Var;
        f2730d = h1Var == null ? false : h1Var.s();
        f2731e = h1Var == null ? false : h1Var.r();
        f2732f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e5 = e();
        if (e5 != null && h1Var != null) {
            h1Var.j(e5);
        }
        f2733g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f2727a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int c(Class cls) {
        if (f2731e) {
            return f2729c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f2731e) {
            f2729c.b(cls);
        }
    }

    public static Field e() {
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

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f2728b;
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

    public static byte g(byte[] bArr, long j10) {
        return f2729c.d(f2732f + j10, bArr);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((f2729c.g((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((f2729c.g((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f2729c.l(bArr, f2732f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int g7 = f2729c.g(j11, obj);
        int i = ((~((int) j10)) & 3) << 3;
        n(((255 & b10) << i) | (g7 & (~(255 << i))), j11, obj);
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        n(((255 & b10) << i) | (f2729c.g(j11, obj) & (~(255 << i))), j11, obj);
    }

    public static void n(int i, long j10, Object obj) {
        f2729c.o(i, j10, obj);
    }

    public static void o(Object obj, long j10, long j11) {
        f2729c.p(obj, j10, j11);
    }

    public static void p(long j10, Object obj, Object obj2) {
        f2729c.q(j10, obj, obj2);
    }
}
