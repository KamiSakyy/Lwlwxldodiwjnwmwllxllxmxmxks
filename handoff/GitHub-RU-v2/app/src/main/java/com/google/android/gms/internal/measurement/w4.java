package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w4 extends x4 {
    public final int u;

    public w4(int i, byte[] bArr) {
        super(bArr);
        x4.f(0, i, bArr.length);
        this.u = i;
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final byte a(int i) {
        int i2 = this.u;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.s[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final byte b(int i) {
        return this.s[i];
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final int d() {
        return this.u;
    }
}
