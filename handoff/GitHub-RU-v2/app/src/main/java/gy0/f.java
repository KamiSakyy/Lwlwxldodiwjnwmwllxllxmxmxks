package gy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public String a;
    public iy0.w b;

    public f(String str, iy0.w wVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wVar;
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
        iy0.w wVar = this.b;
        return hashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", projectV2FieldCommonFragment=" + this.b + ")";
    }
}
