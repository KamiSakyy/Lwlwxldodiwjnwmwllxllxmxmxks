package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final String a;
    public final hp.h b;

    public c0(String str, hp.h hVar) {
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", codingAgentFragment=" + this.b + ")";
    }
}
