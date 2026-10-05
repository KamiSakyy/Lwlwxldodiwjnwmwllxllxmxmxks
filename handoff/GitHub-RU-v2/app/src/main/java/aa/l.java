package aa;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f662a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f663b;

    public l(String str, boolean z10) {
        this.f662a = str;
        this.f663b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f662a.equals(lVar.f662a) && this.f663b == lVar.f663b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f663b) + (this.f662a.hashCode() * 31);
    }

    public final String toString() {
        return "CompiledCondition(name=" + this.f662a + ", inverted=" + this.f663b + ')';
    }
}
