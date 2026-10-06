package u5;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements l {

    /* renamed from: r, reason: collision with root package name */
    public int f32222r;

    /* renamed from: s, reason: collision with root package name */
    public int f32223s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f32224t = -1;

    public m(int i) {
        this.f32222r = i;
    }

    @Override // u5.l
    public final boolean e(CharSequence charSequence, int i, int i10, t tVar) {
        int i11 = this.f32222r;
        if (i > i11 || i11 >= i10) {
            return i10 <= i11;
        }
        this.f32223s = i;
        this.f32224t = i10;
        return false;
    }

    @Override // u5.l
    public final Object getResult() {
        return this;
    }
}
