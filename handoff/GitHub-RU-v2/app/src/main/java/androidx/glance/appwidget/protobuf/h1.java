package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f2723a;

    public h1(Unsafe unsafe) {
        this.f2723a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2723a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2723a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j10, Object obj);

    public abstract byte d(long j10, Object obj);

    public abstract double e(long j10, Object obj);

    public abstract float f(long j10, Object obj);

    public final int g(long j10, Object obj) {
        return this.f2723a.getInt(obj, j10);
    }

    public final long h(long j10, Object obj) {
        return this.f2723a.getLong(obj, j10);
    }

    public final Object i(long j10, Object obj) {
        return this.f2723a.getObject(obj, j10);
    }

    public final long j(Field field) {
        return this.f2723a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j10, boolean z10);

    public abstract void l(Object obj, long j10, byte b10);

    public abstract void m(Object obj, long j10, double d10);

    public abstract void n(Object obj, long j10, float f6);

    public final void o(int i, long j10, Object obj) {
        this.f2723a.putInt(obj, j10, i);
    }

    public final void p(Object obj, long j10, long j11) {
        this.f2723a.putLong(obj, j10, j11);
    }

    public final void q(long j10, Object obj, Object obj2) {
        this.f2723a.putObject(obj, j10, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f2723a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            i1.a(th);
            return false;
        }
    }

    public abstract boolean s();








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Unsafe {
        public Unsafe() {
        }
    }
}
