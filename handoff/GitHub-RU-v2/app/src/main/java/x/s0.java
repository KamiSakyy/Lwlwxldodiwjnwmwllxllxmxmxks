package x;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 extends x61.v {

    /* renamed from: r, reason: collision with root package name */
    public int f33622r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f33623s;

    public s0(r0 r0Var) {
        this.f33623s = r0Var;
    }

    public final boolean hasNext() {
        return this.f33622r < this.f33623s.h();
    }

    public final int nextInt() {
        int i = this.f33622r;
        this.f33622r = i + 1;
        return this.f33623s.e(i);
    }
}
