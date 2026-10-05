package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v2 {
    public static final Unsafe a;
    public static final Class b;
    public static final u2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    static {
        boolean z;
        u2 u2Var;
        boolean z2;
        Field b2;
        u2 u2Var2;
        Unsafe i = i();
        a = i;
        int i2 = i1.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean o = o(cls);
        Class cls2 = Integer.TYPE;
        boolean o2 = o(cls2);
        u2 u2Var3 = null;
        if (i != null) {
            if (o) {
                u2Var3 = new t2(i);
            } else if (o2) {
                u2Var3 = new s2(i);
            }
        }
        c = u2Var3;
        if (u2Var3 != null) {
            try {
                Class<?> cls3 = u2Var3.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(v2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                d = z;
                u2Var = c;
                if (u2Var != null) {
                    try {
                        Class<?> cls4 = u2Var.a.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(v2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    f = p(byte[].class);
                    p(boolean[].class);
                    a(boolean[].class);
                    p(int[].class);
                    a(int[].class);
                    p(long[].class);
                    a(long[].class);
                    p(float[].class);
                    a(float[].class);
                    p(double[].class);
                    a(double[].class);
                    p(Object[].class);
                    a(Object[].class);
                    b2 = b();
                    if (b2 != null && (u2Var2 = c) != null) {
                        u2Var2.a.objectFieldOffset(b2);
                    }
                    g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                e = z2;
                f = p(byte[].class);
                p(boolean[].class);
                a(boolean[].class);
                p(int[].class);
                a(int[].class);
                p(long[].class);
                a(long[].class);
                p(float[].class);
                a(float[].class);
                p(double[].class);
                a(double[].class);
                p(Object[].class);
                a(Object[].class);
                b2 = b();
                if (b2 != null) {
                    u2Var2.a.objectFieldOffset(b2);
                }
                g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        d = z;
        u2Var = c;
        if (u2Var != null) {
        }
        z2 = false;
        e = z2;
        f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        b2 = b();
        if (b2 != null) {
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = i1.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int e(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long f(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object g(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object h(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static Unsafe i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(v2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void j(int i, long j, Object obj) {
        c.a.putInt(obj, j, i);
    }

    public static void k(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void l(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean o(Class cls) {
        int i = i1.a;
        try {
            Class cls2 = b;
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

    public static int p(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }



}
