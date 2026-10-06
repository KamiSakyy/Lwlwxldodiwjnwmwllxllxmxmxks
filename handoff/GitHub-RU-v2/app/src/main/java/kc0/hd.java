package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hd {
    public String a;
    public fd b;

    public hd(String str, fd fdVar) {
        this.a = str;
        this.b = fdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return k71.k.b(this.a, hdVar.a) && k71.k.b(this.b, hdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fd fdVar = this.b;
        return hashCode + (fdVar == null ? 0 : fdVar.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
