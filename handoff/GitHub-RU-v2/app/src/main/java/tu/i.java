package tu;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final int a;

    public i(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("SponsorshipsAsSponsor(totalCount=", this.a, ")");
    }
}
