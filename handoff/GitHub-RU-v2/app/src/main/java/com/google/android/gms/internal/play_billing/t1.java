package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t1 extends g1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected q2 zzc;
    private int zzd;

    public t1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = q2.f;
    }

    public static void f(Class cls, t1 t1Var) {
        t1Var.e();
        zzb.put(cls, t1Var);
    }

    public static final boolean i(t1 t1Var, boolean z) {
        byte byteValue = ((Byte) t1Var.j(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = l2.c.a(t1Var.getClass()).b(t1Var);
        if (z) {
            t1Var.j(2);
        }
        return b;
    }

    public static t1 m(Class cls) {
        Map map = zzb;
        t1 t1Var = (t1) map.get(cls);
        if (t1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t1Var = (t1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = (t1) ((t1) v2.g(cls)).j(6);
        if (t1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, t1Var2);
        return t1Var2;
    }

    public static Object o(Method method, t1 t1Var, Object... objArr) {
        try {
            return method.invoke(t1Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void a(m1 m1Var) {
        o2 a = l2.c.a(getClass());
        c2 c2Var = m1Var.a;
        if (c2Var == null) {
            c2Var = new c2(m1Var);
        }
        a.e(this, c2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int c(o2 o2Var) {
        if (h()) {
            int d = o2Var.d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(no.a.k("serialized size must be non-negative, was ", d));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = o2Var.d(this);
        if (d2 < 0) {
            throw new IllegalStateException(no.a.k("serialized size must be non-negative, was ", d2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | d2;
        return d2;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int d() {
        if (h()) {
            int d = l2.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(no.a.k("serialized size must be non-negative, was ", d));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = l2.c.a(getClass()).d(this);
        if (d2 < 0) {
            throw new IllegalStateException(no.a.k("serialized size must be non-negative, was ", d2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | d2;
        return d2;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l2.c.a(getClass()).i(this, (t1) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return l2.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = l2.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public abstract Object j(int i);

    public final s1 k() {
        return (s1) j(5);
    }

    public final s1 l() {
        s1 s1Var = (s1) j(5);
        if (!s1Var.r.equals(this)) {
            if (!s1Var.s.h()) {
                t1 n = s1Var.r.n();
                l2.c.a(n.getClass()).h(n, s1Var.s);
                s1Var.s = n;
            }
            t1 t1Var = s1Var.s;
            l2.c.a(t1Var.getClass()).h(t1Var, this);
        }
        return s1Var;
    }

    public final t1 n() {
        return (t1) j(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = h2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        h2.c(this, sb, 0);
        return sb.toString();
    }
}
