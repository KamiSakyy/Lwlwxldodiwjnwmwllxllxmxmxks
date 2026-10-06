package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class fc implements w3.z {

    /* renamed from: r, reason: collision with root package name */
    public int f22815r;

    /* renamed from: s, reason: collision with root package name */
    public int f22816s;

    public fc(int i, int i10) {
        this.f22815r = i;
        this.f22816s = i10;
    }

    public final long a(s3.k kVar, long j10, long j11) {
        int i = (int) (j10 >> 32);
        int d10 = ((kVar.d() - i) / 2) + kVar.f31699a;
        if (d10 < 0) {
            d10 = kVar.f31699a;
        } else if (d10 + i > ((int) (j11 >> 32))) {
            d10 = kVar.f31701c - i;
        }
        int i10 = kVar.f31700b - ((int) (j10 & 4294967295L));
        int i11 = this.f22816s;
        int i12 = i10 - i11;
        if (i12 < 0) {
            i12 = kVar.f31702d + i11;
        }
        return (d10 << 32) | (i12 & 4294967295L);
    }

    public final long b(s3.k kVar, long j10) {
        int i = kVar.f31699a;
        int i10 = this.f22816s;
        int i11 = i - (((int) (j10 >> 32)) + i10);
        if (i11 < 0) {
            i11 = kVar.f31701c + i10;
        }
        return (i11 << 32) | ((((kVar.f31700b + kVar.f31702d) - ((int) (j10 & 4294967295L))) / 2) & 4294967295L);
    }

    @Override // w3.z
    public final long c(s3.k kVar, long j10, s3.m mVar, long j11) {
        int i = this.f22815r;
        if (i == 3) {
            return b(kVar, j11);
        }
        if (i == 4) {
            return d(kVar, j11, j10);
        }
        if (i == 1) {
            return a(kVar, j11, j10);
        }
        if (i != 2) {
            return i == 5 ? mVar == s3.m.f31704r ? b(kVar, j11) : d(kVar, j11, j10) : i == 6 ? mVar == s3.m.f31704r ? d(kVar, j11, j10) : b(kVar, j11) : a(kVar, j11, j10);
        }
        int i10 = (int) (j11 >> 32);
        int d10 = ((kVar.d() - i10) / 2) + kVar.f31699a;
        if (d10 < 0) {
            d10 = kVar.f31699a;
        } else if (d10 + i10 > ((int) (j10 >> 32))) {
            d10 = kVar.f31701c - i10;
        }
        int i11 = kVar.f31702d;
        int i12 = this.f22816s;
        int i13 = i11 + i12;
        int i14 = (int) (j11 & 4294967295L);
        if (i13 + i14 > ((int) (j10 & 4294967295L))) {
            i13 = (kVar.f31700b - i14) - i12;
        }
        return (d10 << 32) | (i13 & 4294967295L);
    }

    public final long d(s3.k kVar, long j10, long j11) {
        int i = kVar.f31701c;
        int i10 = this.f22816s;
        int i11 = i + i10;
        int i12 = (int) (j10 >> 32);
        if (i11 + i12 > ((int) (j11 >> 32))) {
            i11 = kVar.f31699a - (i12 + i10);
        }
        return (i11 << 32) | ((((kVar.f31700b + kVar.f31702d) - ((int) (j10 & 4294967295L))) / 2) & 4294967295L);
    }
}
