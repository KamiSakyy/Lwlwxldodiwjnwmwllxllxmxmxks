package l11;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o extends a0 {
    public final r a;

    public o(r rVar) {
        z zVar = z.r;
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.a.equals(((o) ((a0) obj)).a)) {
            return false;
        }
        Object obj2 = z.r;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ z.r.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + z.r + "}";
    }
}
