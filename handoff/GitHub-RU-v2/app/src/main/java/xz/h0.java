package xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public String a;

    public h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && k71.k.b(this.a, ((h0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2GroupTextValue(text=", this.a, ")");
    }
}
