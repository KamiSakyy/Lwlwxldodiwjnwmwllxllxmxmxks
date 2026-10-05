package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21408a;

    /* renamed from: b, reason: collision with root package name */
    public final w61.e f21409b;

    public a(String str, w61.e eVar) {
        this.f21408a = str;
        this.f21409b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f21408a, aVar.f21408a) && k71.k.b(this.f21409b, aVar.f21409b);
    }

    public final int hashCode() {
        String str = this.f21408a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        w61.e eVar = this.f21409b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f21408a + ", action=" + this.f21409b + ')';
    }
}
