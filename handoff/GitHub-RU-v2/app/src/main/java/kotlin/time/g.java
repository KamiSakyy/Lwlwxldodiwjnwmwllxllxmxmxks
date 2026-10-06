package kotlin.time;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long f27887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27888b;

    public g(int i, long j10) {
        this.f27887a = j10;
        this.f27888b = i;
    }

    @Override // kotlin.time.h
    public final d toInstant() {
        d dVar = d.f27877t;
        d dVar2 = d.f27877t;
        long j10 = dVar2.f27879r;
        long j11 = this.f27887a;
        if (j11 >= j10) {
            d dVar3 = d.f27878u;
            if (j11 <= dVar3.f27879r) {
                long j12 = this.f27888b;
                long j13 = j12 / 1000000000;
                if ((j12 ^ 1000000000) < 0 && j13 * 1000000000 != j12) {
                    j13--;
                }
                long j14 = j11 + j13;
                if ((j11 ^ j14) < 0 && (j13 ^ j11) >= 0) {
                    return j11 > 0 ? dVar3 : dVar2;
                }
                if (j14 >= -31557014167219200L) {
                    if (j14 <= 31556889864403199L) {
                        long j15 = j12 % 1000000000;
                        return new d((int) (j15 + ((((j15 ^ 1000000000) & ((-j15) | j15)) >> 63) & 1000000000)), j14);
                    }
                }
            }
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j11 + ')');
    }
}
