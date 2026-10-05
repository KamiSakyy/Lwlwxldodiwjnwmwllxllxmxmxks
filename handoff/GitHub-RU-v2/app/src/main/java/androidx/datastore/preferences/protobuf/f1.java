package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f2279a;

    public f1(Unsafe unsafe) {
        this.f2279a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2279a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2279a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j10, Object obj);

    public abstract double d(long j10, Object obj);

    public abstract float e(long j10, Object obj);

    public final int f(long j10, Object obj) {
        return this.f2279a.getInt(obj, j10);
    }

    public final long g(long j10, Object obj) {
        return this.f2279a.getLong(obj, j10);
    }

    public final Object h(long j10, Object obj) {
        return this.f2279a.getObject(obj, j10);
    }

    public final long i(Field field) {
        return this.f2279a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j10, boolean z10);

    public abstract void k(Object obj, long j10, byte b10);

    public abstract void l(Object obj, long j10, double d10);

    public abstract void m(Object obj, long j10, float f6);

    public final void n(int i, long j10, Object obj) {
        this.f2279a.putInt(obj, j10, i);
    }

    public final void o(Object obj, long j10, long j11) {
        this.f2279a.putLong(obj, j10, j11);
    }

    public final void p(long j10, Object obj, Object obj2) {
        this.f2279a.putObject(obj, j10, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f2279a;
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
            g1.a(th);
            return false;
        }
    }

    public abstract boolean r();








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Unsafe<T1,T2,T3,T4> {
        public Unsafe() {
        }
    }
}
