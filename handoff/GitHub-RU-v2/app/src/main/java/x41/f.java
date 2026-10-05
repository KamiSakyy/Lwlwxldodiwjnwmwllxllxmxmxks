package x41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements k {
    public static final i50.c t = new i50.c(9);
    public final Object r;
    public Object s;

    public f(b51.d dVar) {
        this.r = dVar;
        this.s = t;
    }

    @Override // x41.k
    public void a(j jVar, int i) {
        int[] iArr = (int[]) this.s;
        try {
            jVar.read((byte[]) this.r, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.r = bArr;
        this.s = iArr;
    }
}
