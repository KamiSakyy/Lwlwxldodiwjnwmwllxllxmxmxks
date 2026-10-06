package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kw {
    public final String a;
    public final cq.q0 b;

    public kw(String str, cq.q0 q0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return k71.k.b(this.a, kwVar.a) && k71.k.b(this.b, kwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }
}
