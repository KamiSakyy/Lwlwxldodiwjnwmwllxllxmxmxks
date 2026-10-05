package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public final String a;

    public g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && k71.k.b(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2GroupSingleSelectValue(optionId=", this.a, ")");
    }
}
