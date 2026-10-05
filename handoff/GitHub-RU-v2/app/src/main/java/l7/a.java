package l7;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f28041a;

    /* renamed from: b, reason: collision with root package name */
    public int f28042b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28043c;

    /* renamed from: d, reason: collision with root package name */
    public int f28044d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f28041a;
            if (i != aVar.f28041a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f28044d - this.f28042b) != 1 || this.f28044d != aVar.f28042b || this.f28042b != aVar.f28044d) {
                if (this.f28044d != aVar.f28044d || this.f28042b != aVar.f28042b) {
                    return false;
                }
                Object obj2 = this.f28043c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f28043c)) {
                        return false;
                    }
                } else if (aVar.f28043c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f28041a * 31) + this.f28042b) * 31) + this.f28044d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i = this.f28041a;
        sb2.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f28042b);
        sb2.append("c:");
        sb2.append(this.f28044d);
        sb2.append(",p:");
        sb2.append(this.f28043c);
        sb2.append("]");
        return sb2.toString();
    }
}
