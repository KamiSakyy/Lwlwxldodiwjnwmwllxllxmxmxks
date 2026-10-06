package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pc {
    public final String a;

    public pc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc) && k71.k.b(this.a, ((pc) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMarkdownFileType(contentRaw=", this.a, ")");
    }
}
