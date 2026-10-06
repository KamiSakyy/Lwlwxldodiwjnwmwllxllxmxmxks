package z11;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends kShadow {
    public byte[] h;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.h = bArr;
    }

    @Override // z11.k
    public final byte[] M() {
        return this.h;
    }
}
