package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mc {
    public String a;
    public nc b;

    public mc(String str, nc ncVar) {
        this.a = str;
        this.b = ncVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        return k71.k.b(this.a, mcVar.a) && k71.k.b(this.b, mcVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        nc ncVar = this.b;
        return hashCode + (ncVar != null ? ncVar.hashCode() : 0);
    }

    public final String toString() {
        return "File(extension=" + this.a + ", fileType=" + this.b + ")";
    }
}
