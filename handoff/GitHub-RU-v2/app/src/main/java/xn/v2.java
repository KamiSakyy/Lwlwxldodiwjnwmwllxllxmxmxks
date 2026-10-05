package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v2 {
    public static final u2 Companion = new u2();
    public final Object a;
    public final int b;
    public final int c;
    public final Integer d;
    public final t2 e;

    public v2(List list, int i, int i2, Integer num, t2 t2Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = t2Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final boolean a() {
        if (this.e.c != null) {
            return true;
        }
        int size = this.a.size();
        int i = this.c;
        if (size < i) {
            return false;
        }
        Integer num = this.d;
        return num == null || this.b * i < num.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.a.equals(v2Var.a) && this.b == v2Var.b && this.c == v2Var.c && k71.k.b(this.d, v2Var.d) && this.e.equals(v2Var.e);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        return this.e.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "PagedSessionEvents(events=" + this.a + ", page=" + this.b + ", perPage=" + this.c + ", total=" + this.d + ", links=" + this.e + ")";
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d<T1,T2,T3,T4> {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f<T1,T2,T3,T4> {
        public f() {
        }
    }
}
