package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g5 extends s4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected k6 zzc;

    public g5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = k6.f;
    }

    public static g5 l(Class cls) {
        Map map = zzd;
        g5 g5Var = (g5) map.get(cls);
        if (g5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g5Var = (g5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (g5Var != null) {
            return g5Var;
        }
        g5 g5Var2 = (g5) ((g5) p6.e(cls)).o(6);
        if (g5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g5Var2);
        return g5Var2;
    }

    public static void m(Class cls, g5 g5Var) {
        g5Var.f();
        zzd.put(cls, g5Var);
    }

    public static Object n(Method method, g5 g5Var, Object... objArr) {
        try {
            return method.invoke(g5Var, objArr);
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

    @Override // com.google.android.gms.internal.measurement.s4
    public final int b(g6 g6Var) {
        if (e()) {
            int e = g6Var.e(this);
            if (e >= 0) {
                return e;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = g6Var.e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(e2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void d(y4 y4Var) {
        g6 a = d6.c.a(getClass());
        t5 t5Var = y4Var.a;
        if (t5Var == null) {
            t5Var = new t5(y4Var);
        }
        a.g(this, t5Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d6.c.a(getClass()).h(this, (g5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        d6.c.a(getClass()).i(this);
        f();
    }

    public final f5 h() {
        return (f5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return d6.c.a(getClass()).j(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int j = d6.c.a(getClass()).j(this);
        this.zza = j;
        return j;
    }

    public final f5 i() {
        f5 f5Var = (f5) o(5);
        f5Var.g(this);
        return f5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int e = d6.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = d6.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | e2;
            return e2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(e2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object o(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = y5.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        y5.b(this, sb, 0);
        return sb.toString();
    }
}
