package w61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements Comparable {
    public final byte r;

    public static String a(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return k71.k.h(this.r & 255, ((r) obj).r & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.r == ((r) obj).r;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.r);
    }

    public final String toString() {
        return a(this.r);
    }
}
