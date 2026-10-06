package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 {
    public String a;

    public r3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && k71.k.b(this.a, ((r3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnImageFileType(url=", this.a, ")");
    }
}
