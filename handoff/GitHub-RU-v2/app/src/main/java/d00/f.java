package d00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final String a;
    public final f00.y b;

    public f(String str, f00.y yVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f00.y yVar = this.b;
        return hashCode + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", projectV2FieldCommonFragment=" + this.b + ")";
    }
}
