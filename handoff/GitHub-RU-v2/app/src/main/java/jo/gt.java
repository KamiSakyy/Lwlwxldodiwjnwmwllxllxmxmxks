package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gt {
    public final String a;
    public final String b;
    public final qx.q0 c;

    public gt(String str, String str2, qx.q0 q0Var) {
        this.a = str;
        this.b = str2;
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        return k71.k.b(this.a, gtVar.a) && k71.k.b(this.b, gtVar.b) && k71.k.b(this.c, gtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", simpleUserListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
