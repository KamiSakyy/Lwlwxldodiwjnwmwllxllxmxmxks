package k71;

import java.util.Collections;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements r71.f {
    public e a;
    public int b;

    public a0(e eVar, boolean z) {
        k.g(Collections.EMPTY_LIST, "arguments");
        this.a = eVar;
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        return (this.b & 1) != 0;
    }

    public final List b() {
        return Collections.EMPTY_LIST;
    }

    public final r71.b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.a.equals(a0Var.a)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return k.b(list, list) && this.b == a0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + f1.e.c(Collections.EMPTY_LIST, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Class x = l0.x(this.a);
        String name = x.isArray() ? x.equals(boolean[].class) ? "kotlin.BooleanArray" : x.equals(char[].class) ? "kotlin.CharArray" : x.equals(byte[].class) ? "kotlin.ByteArray" : x.equals(short[].class) ? "kotlin.ShortArray" : x.equals(int[].class) ? "kotlin.IntArray" : x.equals(float[].class) ? "kotlin.FloatArray" : x.equals(long[].class) ? "kotlin.LongArray" : x.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : x.getName();
        List list = Collections.EMPTY_LIST;
        sb.append(name + (list.isEmpty() ? "" : x61.m.c0(list, ", ", "<", ">", 0, new jy.b(10), 24)) + (a() ? "?" : ""));
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
