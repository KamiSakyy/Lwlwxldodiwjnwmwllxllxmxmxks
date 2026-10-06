package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kl {
    public String a;
    public ll b;
    public qh0.a c;

    public kl(String str, ll llVar, qh0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = llVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return k71.k.b(this.a, klVar.a) && k71.k.b(this.b, klVar.b) && k71.k.b(this.c, klVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ll llVar = this.b;
        return this.c.hashCode() + ((hashCode + (llVar == null ? 0 : llVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "MinimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
