package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i50 {
    public final String a;
    public final String b;
    public final ea0.j c;

    public i50(String str, String str2, ea0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return k71.k.b(this.a, i50Var.a) && k71.k.b(this.b, i50Var.b) && k71.k.b(this.c, i50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c0<T1,T2,T3,T4> {
        public c0() {
        }
    }
}
