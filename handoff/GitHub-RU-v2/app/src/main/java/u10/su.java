package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class su {
    public String a;
    public ja0.a b;

    public su(String str, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        return k71.k.b(this.a, suVar.a) && k71.k.b(this.b, suVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ja0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ")";
    }
}
