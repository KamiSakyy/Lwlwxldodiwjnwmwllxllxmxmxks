package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f3692a;

    public t(int i) {
        this.f3692a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f3692a == ((t) obj).f3692a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3692a);
    }

    public final String toString() {
        return x.i.j(new StringBuilder("ContainerInfo(layoutId="), this.f3692a, ')');
    }
}
