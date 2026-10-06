package z8;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public int f34621a;

    public b(int i) {
        this.f34621a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f34621a == ((b) obj).f34621a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34621a);
    }

    public final String toString() {
        return i.j(new StringBuilder("ConstraintsNotMet(reason="), this.f34621a, ')');
    }
}
