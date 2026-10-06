package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class td implements aaShadow.m0 {
    public ud a;

    public td(ud udVar) {
        this.a = udVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td) && k71.k.b(this.a, ((td) obj).a);
    }

    public final int hashCode() {
        ud udVar = this.a;
        if (udVar == null) {
            return 0;
        }
        return udVar.hashCode();
    }

    public final String toString() {
        return "Data(enablePullRequestAutoMerge=" + this.a + ")";
    }
}
