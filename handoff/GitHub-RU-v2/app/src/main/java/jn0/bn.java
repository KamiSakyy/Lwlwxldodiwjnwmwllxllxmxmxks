package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bn {
    public String a;
    public cn b;
    public at0.a c;

    public bn(String str, cn cnVar, at0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cnVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return k71.k.b(this.a, bnVar.a) && k71.k.b(this.b, bnVar.b) && k71.k.b(this.c, bnVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cn cnVar = this.b;
        return this.c.hashCode() + ((hashCode + (cnVar == null ? 0 : cnVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "MinimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
