package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fd {
    public String a;
    public gd b;

    public fd(String str, gd gdVar) {
        this.a = str;
        this.b = gdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return k71.k.b(this.a, fdVar.a) && k71.k.b(this.b, fdVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        gd gdVar = this.b;
        return hashCode + (gdVar != null ? gdVar.hashCode() : 0);
    }

    public final String toString() {
        return "File(extension=" + this.a + ", fileType=" + this.b + ")";
    }
}
