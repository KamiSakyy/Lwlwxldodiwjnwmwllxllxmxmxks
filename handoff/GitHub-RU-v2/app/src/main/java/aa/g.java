package aa;

import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f651a;

    public g(Set set) {
        this.f651a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.f651a, ((g) obj).f651a);
    }

    public final int hashCode() {
        return this.f651a.hashCode();
    }

    public final String toString() {
        return "BPossibleTypes(possibleTypes=" + this.f651a + ')';
    }
}
