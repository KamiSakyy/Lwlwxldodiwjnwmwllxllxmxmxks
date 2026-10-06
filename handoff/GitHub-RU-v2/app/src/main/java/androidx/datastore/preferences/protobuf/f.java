package androidx.datastore.preferences.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends g {

    /* renamed from: v, reason: collision with root package name */
    public final int f2275v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2276w;

    public f(byte[] bArr, int i, int i10) {
        super(bArr);
        g.b(i, i + i10, bArr.length);
        this.f2275v = i;
        this.f2276w = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i) {
        int i10 = this.f2276w;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.f2283s[this.f2275v + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(no.a.k("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(no.a.j(i, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void e(int i, byte[] bArr) {
        System.arraycopy(this.f2283s, this.f2275v, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int f() {
        return this.f2275v;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte g(int i) {
        return this.f2283s[this.f2275v + i];
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.f2276w;
    }
}
