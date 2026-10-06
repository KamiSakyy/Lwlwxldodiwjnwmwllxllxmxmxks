package j41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends b {
    public Object r;

    public c(Object obj) {
        this.r = obj;
    }

    @Override // j41.b
    public final Object a() {
        return this.r;
    }

    @Override // j41.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.r.equals(((c) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
