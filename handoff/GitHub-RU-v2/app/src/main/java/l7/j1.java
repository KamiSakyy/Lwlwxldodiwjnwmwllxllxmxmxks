package l7;

/* loaded from: /home/user/work/p/classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f28164a;

    /* renamed from: b, reason: collision with root package name */
    public int f28165b;

    /* renamed from: c, reason: collision with root package name */
    public int f28166c;

    /* renamed from: d, reason: collision with root package name */
    public int f28167d;

    /* renamed from: e, reason: collision with root package name */
    public int f28168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28171h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28172j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28173k;
    public int l;
    public long m;

    /* renamed from: n, reason: collision with root package name */
    public int f28174n;

    public final void a(int i) {
        if ((this.f28167d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f28167d));
    }

    public final int b() {
        return this.f28170g ? this.f28165b - this.f28166c : this.f28168e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f28164a + ", mData=null, mItemCount=" + this.f28168e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f28165b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f28166c + ", mStructureChanged=" + this.f28169f + ", mInPreLayout=" + this.f28170g + ", mRunSimpleAnimations=" + this.f28172j + ", mRunPredictiveAnimations=" + this.f28173k + '}';
    }

    public static Object b(Object... a) {
        return null;
    }
}
