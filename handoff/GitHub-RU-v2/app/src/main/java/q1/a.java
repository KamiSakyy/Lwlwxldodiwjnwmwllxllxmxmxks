package q1;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f30816a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f30816a == ((a) obj).f30816a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30816a);
    }

    public final String toString() {
        return i.j(new StringBuilder("DeltaCounter(count="), this.f30816a, ')');
    }
}
