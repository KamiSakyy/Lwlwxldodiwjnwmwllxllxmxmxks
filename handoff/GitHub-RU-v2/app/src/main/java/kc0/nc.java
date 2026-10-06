package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nc {
    public String a;
    public qf0.a b;

    public nc(String str, qf0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return k71.k.b(this.a, ncVar.a) && k71.k.b(this.b, ncVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
