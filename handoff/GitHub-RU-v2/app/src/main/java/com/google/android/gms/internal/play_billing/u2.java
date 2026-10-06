package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u2 {
    public final Unsafe a;

    public u2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public abstract float b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, byte b);

    public abstract void e(Object obj, long j, double d);

    public abstract void f(Object obj, long j, float f);

    public abstract boolean g(long j, Object obj);








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Unsafe {
        public Unsafe() {
        }
    }
}
