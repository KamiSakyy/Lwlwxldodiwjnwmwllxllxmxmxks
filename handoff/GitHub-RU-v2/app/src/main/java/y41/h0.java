package y41;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 extends r1 {
    public final String a;
    public final byte[] b;

    public h0(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.a.equals(h0Var.a)) {
                if (Arrays.equals(this.b, r1Var instanceof h0 ? ((h0) r1Var).b : h0Var.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
